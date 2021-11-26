package com.SoftwareQuality.Projet_syllabus;

import javax.print.Doc;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

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
     * @param syllabus syllabus to be added
     */
    public void addSyllabus(Document syllabus){
        this.syllabi.add(syllabus);
    }

    /**
     * method to generate a Json file with an order for a student
     */
    public void generateOrderForStudent(){
        //Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("First_Name", this.student.getFirstName());
        jsonObject.put("Last_Name", this.student.getLastName());
        jsonObject.put("studentID", this.student.getStudentID());
        for(int i = 0;i<this.syllabi.size();i++){
            String key = "doc_"+ String.valueOf(i);
            String value = this.syllabi.get(i).getID();
            jsonObject.put(key,value);
        }
    }


}
