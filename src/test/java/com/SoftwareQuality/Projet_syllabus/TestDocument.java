package com.SoftwareQuality.Projet_syllabus;

import com.SoftwareQuality.Projet_syllabus.*;

import org.junit.jupiter.api.Test;

import javax.print.Doc;
import javax.swing.plaf.nimbus.State;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;
import static com.SoftwareQuality.Projet_syllabus.ProjectSyllabusApplication.db;

public class TestDocument {

    @Test
    void save() throws SQLException {
        LocalDate date = LocalDate.now();
        Document test = new Document("BOMMBEE CHIMIQUES", "SAVANT RUSSE",date, 36, "1", 3.9f);
        test.save();
        Document comp = new Document(9);
        assertEquals(comp.getName(), test.getName());
    }

    @Test
    void delete() throws SQLException{
        Document test = new Document(9);
        test.delete();
        Document comp = new Document(9);
        System.out.println(comp.getName());
        assertNull(comp.getName());
    }

    @Test
    void saveToOrder()throws SQLException{
        Document test = new Document(5);
        test.saveToOrder(101);
        Statement stmt = db.con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM `map_docu_order` WHERE `order` = 101 ");
        while(rs.next()){
            assertEquals(5, rs.getInt("document"));
        }
    }
}

