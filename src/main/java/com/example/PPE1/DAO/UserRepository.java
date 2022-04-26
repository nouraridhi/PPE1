package com.example.PPE1.DAO;
import com.example.PPE1.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.PPE1.controllers.*;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "select u from User u where u.nomC='admin'")
    @RestResource(path="admin")
    List<User> findNomC();


}
