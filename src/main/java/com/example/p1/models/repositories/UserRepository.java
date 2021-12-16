package com.example.p1.models.repositories;
import java.util.Optional;

import javax.transaction.Transactional;

import com.example.p1.models.*;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer>{
    @Modifying @Transactional
    @Query(value="insert into users (user_name, user_email, user_password, user_bdate)"+
        " values(:#{#User.name}, :#{#User.email}, :#{#User.password}, "+
        ":#{#User.bdate})", nativeQuery=true)
    Integer createUser(@Param("user_name") String name,
    @Param("user_password") String password,
    @Param("user_email") String email);

    Optional<User> findByNameAndPassword(String name, String password);
}