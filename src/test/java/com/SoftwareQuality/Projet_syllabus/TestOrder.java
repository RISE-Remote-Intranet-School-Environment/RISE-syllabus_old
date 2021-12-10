package com.SoftwareQuality.Projet_syllabus;

import org.junit.jupiter.api.Test;
import java.sql.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.SoftwareQuality.Projet_syllabus.ProjectSyllabusApplication.db;
import static org.junit.jupiter.api.Assertions.*;

public class TestOrder {

    @Test
    void saveOrder() throws SQLException {
        Statement stmt = db.con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from orders where orderID = 1;");
        while (rs.next()){
            int student = rs.getInt("student");
            String date = rs.getString("date");
            int price = rs.getInt("price");
            assertEquals(1, student);
            assertEquals(10,price);
            assertEquals("20211203",date);
        }
    }

    @Test
    void updateState() throws SQLException {
        Order test = new Order(1, null, null, 10, "a tester");
        test.updateState(1, "BOOOMMMBEEEE");
        Statement stmt= db.con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from orders where orderID = 1;");
        while(rs.next()){
            assertEquals("BOOOMMMBEEEE", rs.getString("state"));
        }
    }


}
