package com.SoftwareQuality.Projet_syllabus;

import java.util.ArrayList;

public class Student extends User{
    private int studentID;
    private ArrayList<Course> PAE;

    /**
     * Constructor of student object
     * @param FirstName Student FirstName
     * @param LastName Student LastName
     * @param Email Student Email
     * @param studentID Student studentID
     * @param PAE Student PAE
     */
    public Student(String FirstName, String LastName, String Email,int studentID,ArrayList<Course> PAE) {
        super(FirstName, LastName, Email);
        this.studentID = studentID;
        this.PAE = PAE;
    }

    //getters et setters
    public int getStudentID() {
        return studentID;
    }

    public ArrayList<Course> getPAE() {
        return PAE;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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
