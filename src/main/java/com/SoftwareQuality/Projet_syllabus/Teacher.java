package com.SoftwareQuality.Projet_syllabus;

import java.util.ArrayList;

public class Teacher extends User {
    private String trigramme;
    private ArrayList<Course> courses;

    //constructor
    public Teacher(String firstName, String lastName, String email, String trigramme, ArrayList<Course> courses) {
        super(firstName, lastName, email);
        this.trigramme = trigramme;
        this.courses = courses;
    }

    //getters and setters
    public void setTrigramme(String trigramme) {
        this.trigramme = trigramme;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public String getTrigramme() {
        return trigramme;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
