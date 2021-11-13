package com.example.p1.models.repositories;
import java.util.ArrayList;
import com.example.p1.models.*;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
    static ArrayList<User> users = new ArrayList<User>();

    public static User getUser(int id) {
        for (User user : users) {
            if (user.getId() == id) return user;
        }
        return null;
    }
}
