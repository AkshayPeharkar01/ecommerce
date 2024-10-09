package com.ecommerce.repository;

import com.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    //ORM--Object Relational Mapping
    //to connect service layer to database for operation


    //here we have written custom find methods

    Optional<User> findByEmail(String email);

    default Optional<User> findByEmailAndPassword(String email, String password) {
        return null;
    }

    List<User> findByUserNameContaining(String keyword);




}
