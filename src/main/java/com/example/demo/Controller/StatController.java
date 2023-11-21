package com.example.demo.Controller;
import com.example.demo.Models.*;

import java.sql.Connection;
import java.sql.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins ={ "file:///D:/ITUS5/rojo/vaikawebjs/page.html","null"})
@RestController
@RequestMapping("/api")
public class StatController {

   
    @GetMapping("/detailmatchs")
    public Motherobj[] readdetailmatch()throws Exception {
        Motherobj[] dm=null;

        try {
             Connection connection=new Connect().getConnectionPsql();
           dm= new DetailMatchs().read(connection);
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        return dm;
       
    }


     @GetMapping("/detailactions")
    public Motherobj[] readdetailactions()throws Exception {
        Motherobj[] dm=null;

        try {
             Connection connection=new Connect().getConnectionPsql();
           dm= new DetailActions().read(connection);
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        return dm;
       
    }

 
}
