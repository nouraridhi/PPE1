package com.example.PPE1.DAO;
import com.example.PPE1.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.PPE1.controllers.*;
@RepositoryRestResource
public interface RoleRepository extends JpaRepository<Role,Long> {

}
