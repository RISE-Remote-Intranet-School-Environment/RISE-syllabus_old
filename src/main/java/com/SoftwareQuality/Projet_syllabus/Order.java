package com.SoftwareQuality.Projet_syllabus;

import javax.print.Doc;
import java.util.ArrayList;

public class Order {
    private int orderID;
    private Student student;
    private ArrayList<Document> syllabi;

    /**
     * constructor of the order object
     * @param orderID id number of the order
     * @param student student making the order
     * @param syllabus syllabus ordered in this order
     */
    public Order(int orderID, Student student, ArrayList<Document> syllabus){
        this.orderID = orderID;
        this.student = student;
        this.syllabi = syllabus;
    }

    /**
     * method to add a syllabus to the order
     * @param syllabus
     */
    public void addSyllabus(Document syllabus){
        this.syllabi.add(syllabus);
    }
}
