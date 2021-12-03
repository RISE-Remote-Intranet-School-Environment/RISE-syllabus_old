package com.SoftwareQuality.Projet_syllabus;

import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Document {
    private String name;
    private ArrayList<String> author;
    private Date publish_date;
    private int pages;
    private String version;
    private String ID;
    /**
     * Constructor of Document object
     * @param name document name
     * @param author authors name
     * @param publish_date publish date
     * @param pages number of pages
     * @param version version of the syllabus
     */
    public Document(String name, ArrayList<String> author, Date publish_date, int pages,String version) throws SQLException {
        this.name = name;
        this.author = author;
        this.publish_date = publish_date;
        this.pages = pages;
        this.version = version;
        this.ID = name + "_" + version;
        Database db = new Database();
        db.addDocument(this);
    }

    //getters et setters de la classe
    public String getName() {
        return name;
    }
    public ArrayList<String> getAuthor() {
        return author;
    }
    public Date getPublish_date() {
        return publish_date;
    }
    public int getPages() {
        return pages;
    }
    public String getVersion() {
        return version;
    }
    public String getID() {
        return ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(ArrayList<String> author) {
        this.author = author;
    }
    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    //fin des getters et setters

    /**
     * method to generate a String for mySQL querry to add documnt to db
     * @return string for query sql to add document
     */
    public String toString(){
        String doc = "";
        doc = doc + name + "," + author + "," + publish_date.toString() + "," + String.valueOf(pages) + "," + version + "," + ID;
        return doc;
    }
}
