package com.example.p1.models.repositories;
import javax.transaction.Transactional;

import com.example.p1.models.*;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer>{

    @Modifying @Transactional
    @Query(value="insert into users (user_name, user_email, user_password, user_bdate) "+
        "values(:#{#users.name}, :#{#users.email}, :#{users.password}, :#{users.bdate}   )", nativeQuery=true)
    Integer createUser(@Param("user") User user);
 
}
