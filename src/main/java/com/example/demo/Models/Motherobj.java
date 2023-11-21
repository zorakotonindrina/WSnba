package com.example.demo.Models;

import java.sql.Connection;

public class Motherobj
{ 
  public void create(Connection connection,String primarykey)throws Exception{
      GenericDao gnDao=new GenericDao();
      gnDao.save(this, connection,primarykey);
  } 
  public Motherobj[] read(Connection connection)throws Exception{
      GenericDao gnDao=new GenericDao();
      Object[] obj= gnDao.findAll(this, connection);
      if(obj==null){ return null; }
      Motherobj[] motherobj=new Motherobj[obj.length];
      for(int i=0;i<obj.length;i++){
           motherobj[i]=(Motherobj)obj[i];
      }
      return motherobj;
  }


  
  public Motherobj readById(Connection connection,String primarykey)throws Exception{
      GenericDao gnDao=new GenericDao();
      Object ob=gnDao.find(this, connection, primarykey);
      if(ob==null){ return null; }
      Motherobj mo=(Motherobj)ob;
      return mo;
  }
  public void update(Connection connection,String primarykey)throws Exception{
      GenericDao gnDao=new GenericDao();
      gnDao.update(this, connection, primarykey);
  }
  public void delete(Connection connection,String primarykey)throws Exception{
      GenericDao gnDao=new GenericDao();
      gnDao.delete(this, connection, primarykey);
  }

  public Object[] readByQueryConvenable(Connection connection,String query)throws Exception{
    GenericDao gnDao=new GenericDao();
    Object[] obj=gnDao.creerLstObjects(this,connection,query);
    return obj;
  }
 
  
}