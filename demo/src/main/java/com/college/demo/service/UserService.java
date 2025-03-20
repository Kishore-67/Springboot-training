package com.college.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.college.demo.Repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import com.college.demo.entity.User;
import java.util.List;
import java.util.ArrayList;

@Service
public class UserService {
//    private  List<User> users= new ArrayList<>();

    @Autowired
    UserRepository user;

    public String sayAnto() {
        return "Hello, anto!";
    }


    public User UserCreation(User user1) {
        return user.save(user1);
    }

    public List<User> getAll() {
        return user.findAll();
    }
    public List<User> delete(long rollno) {
        user.deleteById(rollno);  // Deletes the user by ID
        return user.findAll();    // Returns the updated list of users
    }
    public User UserUpdation(User user1) {
        return user.save(user1);
    }
}