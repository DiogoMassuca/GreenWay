package com.example.p1.models.repositories;
import java.util.ArrayList;
import com.example.p1.models.*;

public class UserRepository {
    private static ArrayList<User> users = new ArrayList<User>();
    public static void populate(){
        users.add(new User("sasa", "123"));
    }
    public static ArrayList<User> getAllUsers() {
        return users;
    }

    public static User addUser(User user) {
        users.add(user);
        return user;
    }

    public static User getUser(int id) {
        for (User user : users) {
            if (user.getId() == id) return user;
        }
        return null;
    }
}
