package com.SoftwareQuality.Projet_syllabus;

import java.sql.*;

import static com.SoftwareQuality.Projet_syllabus.ProjectSyllabusApplication.db;

public class Database{
    public Connection con;

    /**
     * Constructor of the Database object
     */
    public  Database(){
        try{
            Secret secret = new Secret();
            this.con=DriverManager.getConnection(
                    secret.host, secret.user, secret.password);

        }
        catch(Exception e){ System.out.println(e);}
    }

    /**
     * method to return a table from the db
     * @param table table we want
     * @return table asked
     * @throws SQLException
     */
    public ResultSet getData(String table) throws SQLException {
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from " + table);
        //while(rs.next())
        //    System.out.println(rs.getInt(1));  //+"  "+rs.getString(2)+"  "+rs.getString(3));
        con.close();
        return rs;
    }

    public void printWaitingOrders() throws SQLException{
        Statement stmt= db.con.createStatement();
        ResultSet rs = stmt.executeQuery( "SELECT * from orders WHERE state='attente';");
        while (rs.next()) {
            int length = rs.getRow();
            System.out.println(length);
        }
    }
}

