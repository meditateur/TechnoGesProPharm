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
public class Produit {
    
     //all attribut for class
    private int idProd;
    private String libelle;
    private String commentaire;
    private Date dateCreation;
    private Boolean enabled; 
    private Categorie categorie;
    private String imageUrl;
    private String imageData;
    
}
