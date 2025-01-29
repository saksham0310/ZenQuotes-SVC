package com.sak.ZenQuotes_SVC.Controller;

import com.sak.ZenQuotes_SVC.Entity.User;
import com.sak.ZenQuotes_SVC.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/auth")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("sign-up")
    public void signUpUser(@RequestBody User user) {
        userService.registryUser(user);
    }

    @PostMapping("login")
    public ResponseEntity<String> loginUpUser(@RequestBody User user) { 
        boolean isValid = userService.checkUser(user);
        if(isValid) {
            return ResponseEntity.ok().body("Is Valid");
        }
        else {
            return ResponseEntity.status(401).body("Invalid User!!");
        }
    }
}
