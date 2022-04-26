package com.example.PPE1.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.example.PPE1.DAO.*;
import com.example.PPE1.controllers.*;
@NoArgsConstructor
@Data
@Entity
public class Commande {
    @Id
    private Long numCom;
}
