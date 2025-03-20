package com.college.demo.Controller;

import com.college.demo.entity.User;
import com.college.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService user;

    @GetMapping("/hello")
    public String sayHello() {
        return user.sayAnto();
    }

    @PostMapping("/create")
    public User UserCreation(@RequestBody User user1) {
        return user.UserCreation(user1);
    }
    @PutMapping("/update")
    public User UserUpdation(@RequestBody User user1) {
        return user.UserUpdation(user1);
    }

    @GetMapping("/getAll")
    public List<User> getAll() {
        return user.getAll();
    }

    @DeleteMapping("/delete")
    public List<User> delete(@RequestParam long rollno) {
        return user.delete(rollno);
    }
}