package com.example.Spring2.entity;

public class UserDTO {
    private String name;

    private int age;
    private String email;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername(){
        return this.email;
    }

    public String getPassword() {
        return password;
    }

}