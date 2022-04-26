package com.example.PPE1.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.util.List;
import com.example.PPE1.DAO.*;
import com.example.PPE1.controllers.*;
@NoArgsConstructor
@Data
@Entity
public class Categorie{

    @javax.persistence.Id
    private Long numCat;


    private String nomCat;

    @OneToMany( mappedBy="categorie")
    private List<Deal> deals;




}
