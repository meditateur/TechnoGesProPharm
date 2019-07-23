/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gesprophar.entities;

import java.util.Date;

/**
 *
 * @author Alhousseini
 */
public class Utilisateur {
    //all attribut for class

    private int idUser;
    private String nom;
    private String prenom;
    private String username;
    private String password;
    private String adresse;
    private Profile profile;
    private Date dateCreation;
    private Boolean enabled;
    private String etat;

}
