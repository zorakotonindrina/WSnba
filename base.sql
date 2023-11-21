create database nba;
\c nba;


create table equipe(
    idequipe serial primary key,
    nomequipe varchar(50),
    genre int
);

create table saison(
    idsaison serial primary key,
    nomsaison varchar(50),
    anneedebut int,
    anneefin int
);


create table joueur(
    idjoueur serial primary key,
    nomjoueur varchar(50),
    photo varchar(20),
    datenaissance date,
    genre int,
    idequipe int,
    foreign key(idequipe) references equipe(idequipe)
);


create table match(
    idmatch serial primary key,
    idsaison int,
    datedebut timestamp,
    datefin timestamp,
    idequipe1 int,
    idequipe2 int,
    typematch int,
    foreign key(idsaison) references saison(idsaison),
    foreign key(idequipe1) references equipe(idequipe),
    foreign key(idequipe2) references equipe(idequipe)
);



create table actiontype(
    idactiontype serial primary key,
    nomaction varchar(50),
    points int
);

 create table actions(
    idaction serial primary key,
    idmatch int,
    idjoueur int,
    idactiontype int,
    temps time,
    statu int, 
    foreign key(idmatch) references match(idmatch),
    foreign key(idjoueur) references joueur(idjoueur),
    foreign key(idactiontype) references actiontype(idactiontype)
 );


 create table possession(
    idpossession serial primary key,
    idmatch int,
    idjoueur int,
    tempsdebut time,
    tempsfin time,
    foreign key(idmatch) references match(idmatch),
    foreign key(idjoueur) references joueur(idjoueur)
 );


CREATE or REPLACE view v_saisonequipetotalmatch as 
SELECT s.idsaison, m.idequipe1 AS idequipe, COUNT(m.idmatch) AS nbmatch
FROM match AS m
JOIN saison AS s ON s.idsaison = m.idsaison
GROUP BY s.idsaison, m.idequipe1
UNION
SELECT s.idsaison, m.idequipe2 AS idequipe, COUNT(m.idmatch) AS nbmatch
FROM match AS m
JOIN saison AS s ON s.idsaison = m.idsaison
GROUP BY s.idsaison, m.idequipe2;





CREATE or REPLACE view v_saisonjoueurtotalmatch as 
    select s.idsaison,ac.idjoueur,count(ac.idmatch) as matchjoue
    from saison as s
    join MATCH as m on s.idsaison=m.idsaison
    join actions as ac on ac.idmatch=m.idmatch
    group by s.idsaison,ac.idjoueur



CREATE or replace view v_detailjoueurmatch as
select 
    v_eqmatch.idsaison,
    v_jrmatch.idjoueur,
    j.nomjoueur,
    j.photo,
    v_eqmatch.idequipe,
    e.nomequipe,
    v_eqmatch.nbmatch,
    v_jrmatch.matchjoue
    from v_saisonjoueurtotalmatch as v_jrmatch
    join joueur as j on j.idjoueur=v_jrmatch.idjoueur
    join v_saisonequipetotalmatch as v_eqmatch 
        on (v_jrmatch.idsaison=v_eqmatch.idsaison and v_eqmatch.idequipe=j.idequipe)
    join equipe as e on e.idequipe=j.idequipe
    


CREATE or replace view detailmatch as
select 
    v_eqmatch.idsaison,
    v_jrmatch.idjoueur,
    j.nomjoueur,
    j.photo,
    v_eqmatch.idequipe,
    e.nomequipe,
    v_eqmatch.nbmatch,
    v_jrmatch.matchjoue
    from v_saisonjoueurtotalmatch as v_jrmatch
    join joueur as j on j.idjoueur=v_jrmatch.idjoueur
    join v_saisonequipetotalmatch as v_eqmatch 
        on (v_jrmatch.idsaison=v_eqmatch.idsaison and v_eqmatch.idequipe=j.idequipe)
    join equipe as e on e.idequipe=j.idequipe

CREATE or replace view detailmatchs as
select dm.*,p.timetotal from detailmatch as dm 
    join 
(
    select tab.idjoueur,tab.idsaison,sum(timetotal) as timetotal from
    (select po.idjoueur,m.idsaison,sum(po.tempsfin-po.tempsdebut) as timetotal from possession as po 
        join match as m on m.idmatch=po.idmatch group by po.idjoueur,m.idsaison
    union
    select j.idjoueur,s.idsaison,'00:00:00' as timetotal from joueur as j cross join saison as s
    ) as tab group by tab.idjoueur,tab.idsaison
) as p
 on (dm.idjoueur=p.idjoueur and dm.idsaison=p.idsaison)



    
CREATE or replace VIEW detailactions AS
    select tab.idsaison , tab.idjoueur,tab.idactiontype,tab.nomaction,sum(tab.sumpoints) as sumpoints,sum(tab.nbaction) as nbaction 
    from(
        select s.idsaison , ac.idjoueur,ac.idactiontype,actp.nomaction,
            sum(actp.points*ac.statu) as sumpoints,
            count(ac.idaction) as nbaction
            from saison as s 
            join MATCH as m on s.idsaison=m.idsaison
            join actions as ac on ac.idmatch=m.idmatch
            join actiontype as actp on ac.idactiontype=actp.idactiontype
            GROUP BY s.idsaison , ac.idjoueur,ac.idactiontype,actp.nomaction
        union
        select s.idsaison , j.idjoueur,actp.idactiontype,actp.nomaction,
            0 as sumpoints,
            0 as nbaction
            from saison as s 
            join MATCH as m on s.idsaison=m.idsaison
            join equipe as eq on (eq.idequipe=m.idequipe1 or eq.idequipe=m.idequipe2)
            join joueur as j on eq.idequipe=j.idequipe
            cross join actiontype as actp 
    ) as tab group by tab.idsaison , tab.idjoueur,tab.idactiontype,tab.nomaction;
    



