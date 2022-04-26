package com.example.PPE1.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import com.example.PPE1.DAO.*;
import com.example.PPE1.controllers.*;
@NoArgsConstructor
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long numUser;

    private String nomC;

    private String prenomC;


    public String email;

    private String mdp;

    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinTable(name="user_role")
    @JoinColumn(name="numUser")
    @JoinColumn(name="numRole")
    private List<Role> roles;
}
