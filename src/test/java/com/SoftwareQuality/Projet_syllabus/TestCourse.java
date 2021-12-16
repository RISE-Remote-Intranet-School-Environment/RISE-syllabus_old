package com.SoftwareQuality.Projet_syllabus;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static com.SoftwareQuality.Projet_syllabus.ProjectSyllabusApplication.db;
import static org.junit.jupiter.api.Assertions.*;

public class TestCourse {

    @Test
    void addDocument() throws SQLException {
        Document docTest = new Document(5);
        Course courseTest = new Course(6);
        courseTest.addDocument(docTest);
        Statement stmt = db.con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from map_docu_course where document = 5 and course = 6");
        while(rs.next()){
            assertEquals(6, rs.getInt("course"));
            assertEquals(5, rs.getInt("document"));
        }
    }

    @Test
    void deleteDocument() throws SQLException{
        Document docTest = new Document(5);
        Course courseTest = new Course(6);
        courseTest.deleteDocument(docTest);
        Statement stmt = db.con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from map_docu_course where document = 5 and course = 6");
        while(rs.next()) {
            assertNull(rs.getInt("document"));
        }
    }

    @Test
    void fetchDocuments() throws SQLException {
        ArrayList<Document> test = new ArrayList<Document>();
        Document document = new Document(6);
        Course course = new Course(4);
        test.add(document);
        assertEquals(test.get(0).getName(),course.getDocuments().get(0).getName());
    }
}
