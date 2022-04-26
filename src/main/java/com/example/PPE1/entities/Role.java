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
@Table(name="roles")
public class Role {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long numRole;

    private String nom;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}
