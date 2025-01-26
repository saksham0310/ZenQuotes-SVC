package com.sak.ZenQuotes_SVC.Service;

import com.sak.ZenQuotes_SVC.Entity.User;
import com.sak.ZenQuotes_SVC.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.desktop.SystemEventListener;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void registryUser(User user) {
        try {
            userRepository.save(user);
        }
        catch (Exception e) {
            System.out.println("In registryUser at registryUser: "+ e.getMessage());
        }
    }

    public boolean checkUser(User user) {
        try {
            Optional<User> currentUser = userRepository.findByEmail(user.getEmail());
            return currentUser.isPresent() && currentUser.get().getPassword().equals(user.getPassword());
        }
        catch (Exception e)
        {
           System.out.println("In UserService at checkUser: "+ e.getMessage());
           return false;
        }
    }
}
