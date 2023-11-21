INSERT INTO equipe (nomequipe, genre) VALUES
('Equipe A', 1),
('Equipe B', 1),
('Equipe C', 0);


INSERT INTO saison (nomsaison, anneedebut, anneefin) VALUES
('Saison 2021-2022', 2021, 2022),
('Saison 2022-2023', 2022, 2023),
('Saison 2023-2024', 2023, 2024);


INSERT INTO joueur (nomjoueur, photo, datenaissance, genre, idequipe) VALUES
('Joueur 1A', 'photoa1.jpg', '1990-05-15', 1, 1),
('Joueur 2A', 'photoa2.jpg', '1995-08-22', 1, 1),
('Joueur 3A', 'photoa3.jpg', '1988-02-10', 1, 1),
('Joueur 4A', 'photoa4.jpg', '1990-05-15', 1, 1),
('Joueur 5A', 'photoa5.jpg', '1995-08-22', 1, 1),
('Joueur 1B', 'photo1b.jpg', '1990-05-15', 1, 2),
('Joueur 2B', 'photo2b.jpg', '1995-08-22', 1, 2),
('Joueur 3B', 'photo3b.jpg', '1988-02-10', 1, 2),
('Joueur 4B', 'photo4b.jpg', '1990-05-15', 1, 2),
('Joueur 5B', 'photo5b.jpg', '1995-08-22', 1, 2);




INSERT INTO actiontype (nomaction, points) VALUES
('Panier trois points', 3),
('Panier deux points', 2),
('Lancer franc', 1),
('Passe Decisive', 0),
('Rebond', 0);



INSERT INTO match (idsaison, datedebut, datefin, idequipe1, idequipe2, typematch) VALUES
(1, '2022-01-05 18:00:00', '2022-01-05 20:00:00', 1, 2, 1),
(2, '2022-02-10 19:30:00', '2022-02-10 21:30:00', 2, 3, 2),
(3, '2022-03-15 17:45:00', '2022-03-15 19:45:00', 1, 3, 1);


INSERT INTO actions (idmatch, idjoueur, idactiontype, temps, statu) VALUES
(1, 1, 1, '00:10:30', 0),
(1, 2, 5, '00:12:45', 1),
(1, 3, 2, '00:25:20', 1),
(1, 4, 1, '00:30:00', 0),
(1, 5, 3, '00:45:45', 1),
(1, 3, 4, '01:00:10', 1),
(1, 6, 1, '00:11:30', 0),
(1, 7, 4, '00:13:45', 1),
(1, 8, 5, '00:28:20', 1),
(1, 9, 3, '00:35:00', 1),
(1, 7, 2, '00:50:45', 1),
(1,10,1,  '01:15:0', 0);









INSERT INTO possession (idmatch, idjoueur, tempsdebut, tempsfin) VALUES
(1, 1, '00:10:00', '00:10:30'),
(1, 2, '00:12:00', '00:12:45'),
(2, 3, '00:25:00', '00:25:20');

