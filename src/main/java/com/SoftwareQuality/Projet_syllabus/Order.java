package com.SoftwareQuality.Projet_syllabus;

import javax.print.Doc;
import java.sql.Statement;
import java.time.LocalDate;
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
    private User user;
    private ArrayList<Document> documents;
    private LocalDateTime orderDate;
    private float price;
    private String state;

    /**
     * constructor of the order object
     * @param orderID id number of the order
     * @param user user making the order
     * @param documents syllabus ordered in this order
     * @param price total price of the order
     * @param state state of the order (attente, traitement, imprimée, livrée)
     * the orderDate is the date of when the order was created to format it we'll use :
     *              import java.time.format.DateTimeFormatter;
     *
     *              DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
     *              dtf.format(orderDate)
     */
    public Order(int orderID, User user, ArrayList<Document> documents, float price, String state){
        this.orderID = orderID;
        this.user = user;
        this.documents = documents;
        this.state = state;
        this.price = price;
        this.orderDate = LocalDateTime.now();
    }

    /**
     * save order in the DB
     * @throws SQLException
     */
    public void saveOrder() throws SQLException{
        DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
        String date = dtf.format(this.orderDate);
        Statement stmt= db.con.createStatement();
        stmt.executeUpdate("INSERT INTO orders (orderID, student, date, price, state) VALUES ("+this.orderID+","+this.user+","+date+","+this.price+",'"+this.state+"');");
    }

    /**
     * method to add a syllabus to the order
     * @param document syllabus to be added
     */
    public void addSyllabus(Document document){
        this.documents.add(document);
        this.price += document.getPrice();
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
        jsonObject.put("First_Name", this.user.getFirstName());
        jsonObject.put("Last_Name", this.user.getLastName());
        for(int i = 0;i<this.documents.size();i++){
            String key = "doc_"+ String.valueOf(i);
            int value = this.documents.get(i).getID();
            jsonObject.put(key,value);
        }

        return jsonObject ;
    }

    void saveDocuments() throws SQLException {
        Statement stmt= db.con.createStatement();
        for (Document document:
             documents) {
            document.saveToOrder(this.orderID);
        }
    }
}
