package com.customermanagementsystem.service;

import java.util.Scanner;

import com.customermanagementsystem.model.User;

public class UserService {


    public boolean registerUser(User user) {
        if(user == null) {
            System.out.println("User cannot be null.");
            return false;
        }

        User users = new User(user.getFullName(), user.getUserName(), user.getPassword(), user.getRole());
        
        return true;

    }



    

  
    
}
