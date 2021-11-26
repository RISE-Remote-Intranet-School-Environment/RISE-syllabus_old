package com.SoftwareQuality.Projet_syllabus;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    /**
     * Constructor of user object
     * @param firstName user's firstname
     * @param lastName user's lastname
     * @param email user's email address
     */
    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //getters et setters
    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
