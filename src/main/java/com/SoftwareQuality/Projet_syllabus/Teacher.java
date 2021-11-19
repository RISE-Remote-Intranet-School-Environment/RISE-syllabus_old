package com.SoftwareQuality.Projet_syllabus;

public class Teacher extends User {
    private String Trigramme;
    private ArrayList<Course> Courses;

    //constructor
    public Teacher(String FirstName, String LastName, String Email, String Trigramme, ArrayList<Course> Courses) {
        super(FirstName, LastName, Email);
        this.Trigramme = Trigramme;
        this.Courses = Courses;
    }

    //getters and setters
    public void setTrigramme(String Trigramme) {
        this.Trigramme = Trigramme;
    }

    public void setCourses(ArrayList<Course> Courses) {
        this.Courses = Courses;
    }

    public String getTrigramme() {
        return Trigramme;
    }

    public ArrayList<Course> getCourses() {
        return Courses;
    }
}
