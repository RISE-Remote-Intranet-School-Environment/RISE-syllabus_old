package com.SoftwareQuality.Projet_syllabus;

import java.sql.*;

public class Database{
    private Connection con;

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

    /**
     * method to add a document to the db
     * @param document  document to be added
     * @throws SQLException
     */
    public void addDocument(Document document) throws SQLException{
        Statement stmt=con.createStatement();
        stmt.executeQuery("INSERT INTO `table_name`(Name,Author,Publish_Date,Pages,Version,ID) VALUES ("+document.toString()+");");
    }

}

