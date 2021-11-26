package com.SoftwareQuality.Projet_syllabus;

import java.util.ArrayList;

public class Student extends User{
    private int matricule;
    private ArrayList<Course> PAE;

    /**
     * Constructor of student object
     * @param FirstName Student FirstName
     * @param LastName Student LastName
     * @param Email Student Email
     * @param matricule Student maticule
     * @param PAE Student PAE
     */
    public Student(String FirstName, String LastName, String Email,int matricule,ArrayList<Course> PAE) {
        super(FirstName, LastName, Email);
        this.matricule = matricule;
        this.PAE = PAE;
    }

    //getters et setters
    public int getMatricule() {
        return matricule;
    }

    public ArrayList<Course> getPAE() {
        return PAE;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setPAE(ArrayList<Course> PAE) {
        this.PAE = PAE;
    }
    //fin des getters et des setters

    /**
     * method to add a course to the PAE of the student
     * @param course course to add
     */
    public void addCourseToPAE(Course course){
        this.PAE.add(course);
    }
}
