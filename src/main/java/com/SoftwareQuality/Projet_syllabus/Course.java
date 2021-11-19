package com.SoftwareQuality.Projet_syllabus;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Teacher> teachers;
    private String UE;
    private ArrayList<Student> students;
    private String academic_year;
    private ArrayList<Document> syllabi;

    /**
     * Constructor of the Course object
     * @param name name of the course
     * @param teachers name of the teachers of the course
     * @param UE name of the UE of the course
     * @param students list of the students following the course
     * @param academic_year current academic year
     * @param syllabi list of all document od the course
     */
    public Course(String name, ArrayList<Teacher> teachers, String UE, ArrayList<Student> students, String academic_year, ArrayList<Document> syllabi){
        this.name = name;
        this.teachers = teachers;
        this.UE = UE;
        this.students = students;
        this.academic_year = academic_year;
        this.syllabi = syllabi;
    }

    //getters et setters

    public String getName() {
        return name;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getUE() {
        return UE;
    }

    public String getAcademic_year() {
        return academic_year;
    }

    public ArrayList<Document> getSyllabi() {
        return syllabi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setUE(String UE) {
        this.UE = UE;
    }

    public void setAcademic_year(String academic_year) {
        this.academic_year = academic_year;
    }

    public void setSyllabi(ArrayList<Document> syllabi) {
        this.syllabi = syllabi;
    }
    //fin des getters et des setters

    /**
     * method to add a teacher to the Course
    @param teacher  teacher to add into the teachers list of the course
     */
    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }

    /**
     * method to add a student to the course
     * @param student student to add into the students list of the course
     */
    public void addStudent(Student student){
        this.students.add(student);
    }

    /**
     * method to add a syllabus to the syllabi's list of the course
     * @param syllabus document to add into the syllabi's list of the course
     */
    public void addSyllabus(Document syllabus){
        this.syllabi.add(syllabus);
    }


}
