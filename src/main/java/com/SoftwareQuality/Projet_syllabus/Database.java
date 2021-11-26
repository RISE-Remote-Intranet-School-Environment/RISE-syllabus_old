package com.SoftwareQuality.Projet_syllabus;

import java.sql.*;

public class Database{
    private Connection con;
    public  Database(){
        try{
            this.con=DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/syllabus","root","password");

        }
        catch(Exception e){ System.out.println(e);}
    }

    public ResultSet getData(String table) throws SQLException {
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from " + table);
        //while(rs.next())
        //    System.out.println(rs.getInt(1));  //+"  "+rs.getString(2)+"  "+rs.getString(3));
        con.close();
        return rs;
    }
    public void addDocument(Document document) throws SQLException{
        Statement stmt=con.createStatement();
        stmt.executeQuery("INSERT INTO `table_name`(Name,Author,Publish_Date,Pages,Version,ID) VALUES ();");
    }

}

