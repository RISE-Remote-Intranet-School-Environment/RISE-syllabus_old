package com.SoftwareQuality.Projet_syllabus;

import java.util.Date;

public class Document {
    private String name;
    private String author;
    private Date publish_date;
    private int pages;

    //constructeur
    public Document(String name, String author, Date publish_date, int pages){
        this.name = name;
        this.author = author;
        this.publish_date = publish_date;
        this.pages = pages;
    }

    //getters et setters de la classe
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public Date getPublish_date() {
        return publish_date;
    }
    public int getPages() {
        return pages;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    //fin des getters et setters
}
