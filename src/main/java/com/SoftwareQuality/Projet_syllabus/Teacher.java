package com.SoftwareQuality.Projet_syllabus;

import java.util.ArrayList;

public class Teacher extends User {
    private String trigram;
    private ArrayList<Course> courses;

    /**
     * Constructor of the Teacher object
     * @param firstName teacher's first name
     * @param lastName teacher's last name
     * @param email teacher's email address
     * @param trigram teacher's trigram
     * @param courses teacher's courses 
     */
    public Teacher(String firstName, String lastName, String email, String trigram, ArrayList<Course> courses) {
        super(firstName, lastName, email);
        this.trigram = trigram;
        this.courses = courses;
    }

    //getters and setters
    public void setTrigram(String trigram) {
        this.trigram = trigram;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public String getTrigram() {
        return trigram;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    /**
     * method to add a course for a teacher
     * @param course course to add
     */
    public void addCourse(Course course){
        this.courses.add(course);
    }
}
