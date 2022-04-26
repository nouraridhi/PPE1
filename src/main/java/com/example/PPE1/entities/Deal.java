package com.example.PPE1.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import com.example.PPE1.DAO.*;
import com.example.PPE1.controllers.*;
@NoArgsConstructor
@Data
@Entity
public class Deal {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long NumDeal;

    private String nomDeal;

    private Double ancien_prix;

    private Double pourcentage;

    private Double nouveau_prix;

    private Date temps_rest;

    private Long quantite;

    private String image;

    //  private Long nb_vente;

    @ManyToOne
    @JoinColumn(name="numCateg")
    private Categorie categorie;
}
