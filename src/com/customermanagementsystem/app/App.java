package com.customermanagementsystem.app;

import com.customermanagementsystem.model.User;
import com.customermanagementsystem.model.UserRol;
import com.customermanagementsystem.service.UserService;

public class App {
    public static void main(String[] args){
        Users();
    }

    public static void Users() {
        var user = new User[50];
        UserService userService = new UserService();


        var users1 = new User("Jorge Rodriguez", "JorgeSteven11", "password123", UserRol.ADMIN);
        var users2 = new User("Jorge Rodriguez", "JorgeSteven11", "password123", UserRol.ADMIN);

        userService.registerUser(users1);


        System.out.println(users1.getUserId() + " user 2 " + users2.getUserId());

        users1.showActions();

    }
}
