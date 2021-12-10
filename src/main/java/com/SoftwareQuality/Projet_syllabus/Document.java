package com.SoftwareQuality.Projet_syllabus;

import java.lang.reflect.Array;
import java.sql.SQLException;

import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.Date;
import java.sql.*;

import static com.SoftwareQuality.Projet_syllabus.ProjectSyllabusApplication.db;

public class Document {
    private String name;
    private String author;
    private LocalDate publish_date;
    private int pages;
    private String version;
    private int ID;
    private float price;
    /**
     * Constructor of Document object
     * @param name document name
     * @param author authors name
     * @param publish_date publish date
     * @param pages number of pages
     * @param version version of the syllabus
     */

    public Document(String name, String author, LocalDate publish_date, int pages,String version, float price) throws SQLException {
        this.name = name;
        this.author = author;
        this.publish_date = publish_date;
        this.pages = pages;
        this.version = version;
        this.price = price;
    }
    /**
     * constructor of Document object from the database
     */
    public Document (int ID) throws SQLException{
        String table = "document";
        Statement stmt = db.con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from " + table + " where documentId="+ID+";");
        while (rs.next()) {
            this.ID = rs.getInt(1);
            this.name = rs.getString(2);
            this.author = rs.getString(3);
            this.publish_date = LocalDate.parse(rs.getString(4), DateTimeFormatter.BASIC_ISO_DATE);
            this.pages = rs.getInt(5);
            this.version = rs.getString(6);
            this.price = Float.parseFloat(rs.getString(7));
        }
    }

    //getters et setters de la classe
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public LocalDate getPublish_date() {
        return publish_date;
    }
    public int getPages() {
        return pages;
    }
    public String getVersion() {
        return version;
    }
    public int getID() {
        return ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublish_date(LocalDate publish_date) {
        this.publish_date = publish_date;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public float getPrice() {return this.price;}
    //fin des getters et setters

    /**
     * method used to save a document into the database
     */
    public void save() throws SQLException{
        Statement stmt= db.con.createStatement();
        DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
        String date = dtf.format(this.publish_date);
        stmt.executeUpdate("INSERT INTO `document`(name,author,publishDate,pages,version) VALUES ('"+ name + "','" + author + "','" + date + "','" + pages + "','" + version + "');");
    }

    /**
     * @delete Deletes a document from the database
     * @throws SQLException
     */
    public void delete() throws SQLException{
        Statement stmt= db.con.createStatement();
        stmt.executeUpdate("DELETE FROM `document`WHERE documentId="+this.ID+";");
    }

    /**
     * Makes the link between in an order and a document that's in it.
     * @param orderID
     * @throws SQLException
     */
    public void saveToOrder(int orderID) throws SQLException {
        Statement stmt= db.con.createStatement();
        stmt.executeUpdate("INSERT INTO `map_document_order`(document,course) VALUES ('"+ this.ID  + "','" + orderID +"');");
    }
}
