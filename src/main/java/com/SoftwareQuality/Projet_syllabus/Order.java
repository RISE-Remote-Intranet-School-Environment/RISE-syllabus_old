package com.SoftwareQuality.Projet_syllabus;

import javax.print.Doc;
import java.sql.Statement;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.time.format.DateTimeFormatter;

import org.apache.tomcat.jni.Local;
import org.json.simple.JSONObject;
import java.util.Date;
import java.time.LocalDateTime;
import static com.SoftwareQuality.Projet_syllabus.ProjectSyllabusApplication.db;

public class Order {
    private int orderID;
    private Student student;
    private ArrayList<Document> syllabi;
    private LocalDateTime orderDate;
    private float price;
    private String state;


    /**
     * constructor of the order object
     * @param orderID id number of the order
     * @param student student making the order
     * @param syllabus syllabus ordered in this order
     * @param price total price of the order
     * @param state state of the order (attente, traitement, imprimée, livrée)
     * the orderDate is the date of when the order was created to format it we'll use :
     *              import java.time.format.DateTimeFormatter;
     *
     *              DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
     *              dtf.format(orderDate)
     */
    public Order(int orderID, Student student, ArrayList<Document> syllabus, float price, String state){
        this.orderID = orderID;
        this.student = student;
        this.syllabi = syllabus;
        this.state = state;
        this.price = price;
        this.orderDate = LocalDateTime.now();
    }

    public void saveOrder() throws SQLException{
        DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
        String date = dtf.format(this.orderDate);
        //System.out.println("INSERT INTO orders (orderID, student, syllabi, date, price, state) VALUES ("+this.orderID+","+this.student+","+this.syllabi+","+date+","+this.price+","+this.state+");");
        Statement stmt= db.con.createStatement();
        stmt.executeUpdate("INSERT INTO orders (orderID, student, syllabi, date, price, state) VALUES ("+this.orderID+","+this.student+","+this.syllabi+","+date+","+this.price+",'"+this.state+"');");
    }


    /**
     * method to add a syllabus to the order
     * @param syllabus syllabus to be added
     */
    public void addSyllabus(Document syllabus){
        this.syllabi.add(syllabus);
        this.price += syllabus.getPrice();
    }

    /**
     * @param orderID Order to be modified
     * @param desiredState Order's state to update
     * @throws SQLException
     */
    public void updateState(int orderID, String desiredState) throws SQLException{
        this.state = desiredState;
        Statement stmt= db.con.createStatement();
        stmt.executeUpdate("UPDATE orders SET state = '"+desiredState+"' WHERE orderID = "+String.valueOf(orderID)+";");
    }

    /**
     * method to generate a Json file with an order for a student
     */
    public JSONObject generateOrderForStudent(){
        //Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("First_Name", this.student.getFirstName());
        jsonObject.put("Last_Name", this.student.getLastName());
        jsonObject.put("studentID", this.student.getStudentID());
        for(int i = 0;i<this.syllabi.size();i++){
            String key = "doc_"+ String.valueOf(i);
            int value = this.syllabi.get(i).getID();
            jsonObject.put(key,value);
        }

        return jsonObject ;
    }


}
