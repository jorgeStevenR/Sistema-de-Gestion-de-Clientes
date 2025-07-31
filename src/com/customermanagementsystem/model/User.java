package com.customermanagementsystem.model;

public class User {

    private String fullName;
    private Integer userId ;
    private static Integer userIdCounter = 1;
    private String userName;
    private String password;
    private UserRol userRol;
    private Boolean isActive ;
    private Action[] actions = new Action[100];
    private int contador = 0;


    public User(String fullName,  String userName, String password) {
        this.fullName = fullName;
        this.userId = userIdCounter++;
        this.userName = userName;
        this.password = password;
        this.userRol = UserRol.STANDARD; 
        this.isActive = true;     
        addaction(new Action("The user '" + fullName + "' has been created."));
       
        contador++;
    }   

    public User(String fullName,String userName, String password, UserRol userRol) {
        this.fullName = fullName;
        this.userId = userIdCounter++;
        this.userName = userName;
        this.password = password;
        this.userRol = userRol;
        this.isActive = true;
        addaction(new Action("The user '" + fullName + "' has been created."));
        contador++;
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

    public UserRol getRole() {
        return userRol;
    }

    public void setFullname(String fullname) {
        this.fullName = fullname;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public void addaction(Action action) {
        if(contador < actions.length) {
            actions[contador] = action;
            contador++;
        } else {
            System.out.println("No more actions can be added.");
        }
    }

    public void showActions() {
        System.out.println("Actions for user " + fullName + ":");
        for (int i = 0; i < contador; i++) {
            System.out.println(actions[i]);
        }
    }

    


    
}
