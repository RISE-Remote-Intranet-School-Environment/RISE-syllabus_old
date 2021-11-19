package com.SoftwareQuality.Projet_syllabus;

public class User {
    private String FirstName;
    private String LastName;
    private String Email;

    //constructeur
    public User(String FirstName, String LastName, String Email) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
    }

    //getters et setters
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return FirstName;
    }

    public String getEmail() {
        return Email;
    }
}
