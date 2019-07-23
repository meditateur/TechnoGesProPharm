/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gesprophar.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alhousseini
 */
public class DBConnection {
    Connection conn;
    String urlPilote = "oracle.jdbc.driver.OracleDriver";
    String urlBaseDonnees = "jdbc:oracle:thin:@localhost:1521:XE";

    public DBConnection() {
        //chargement du pilote 
        try {
            Class.forName(urlPilote);
            System.out.println("gescotra pilote chargé");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        //connexion a la base de données 

        try {
            String user="gespropharma";
            String pwd="admin";
             conn = DriverManager.getConnection(urlBaseDonnees, user,pwd);
            System.out.println("Connexion a gespropharma.");
        } catch (Exception ex) {
            System.out.println(ex);

        }
        //methode definissant les connexion 

    }

    Connection ObtenirConnexion() {
        return conn;
    }
    
}
