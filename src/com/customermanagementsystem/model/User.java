package com.customermanagementsystem.model;

public class User {

    private String fullName;
    private Integer userId;
    private String userName;
    private String password;
    private UserRol userRol;
    private Action[] actions = new Action[100];
    int contador = 0;


    public User(String fullName, Integer userId, String userName, String password) {
        this.fullName = fullName;
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.userRol = UserRol.STANDARD; 
        actions = new Action[] {
            new Action("The user '" + fullName + "' has been created.")
        };
    }   
    public User(String fullName, Integer userId, String userName, String password, UserRol userRol) {
        this.fullName = fullName;
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.userRol = userRol;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setFullname(String fullname) {
        this.fullName = fullname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void newAction(String description) {

    }
    


    
}
