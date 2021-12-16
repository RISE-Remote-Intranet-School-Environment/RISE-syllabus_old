package com.SoftwareQuality.Projet_syllabus;

public class User {
    private int ID;
    private String firstName;
    private String lastName;
    private String email;
    private String role;

    /**
     * Constructor of user object
     * @param ID User ID
     * @param firstName User first name
     * @param lastName User last name
     * @param email User email address
     * @param role User role
     */
    public User(int ID, String firstName, String lastName, String email, String role) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
    }

    //getters et setters
    public void setID(int ID) { this.ID = ID; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) { this.role = role; }

    public int getId() { return ID; }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() { return role; }
}

/* TO DO: Call [user management] microservice API and fetch json data,
and use constructor to fill attributes with said data when instantiating an User object.
 */
