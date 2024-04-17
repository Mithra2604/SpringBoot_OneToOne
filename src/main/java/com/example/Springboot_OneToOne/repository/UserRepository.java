package com.example.Springboot_OneToOne.repository;

import com.example.Springboot_OneToOne.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}