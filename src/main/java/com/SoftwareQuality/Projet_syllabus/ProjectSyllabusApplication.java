package com.SoftwareQuality.Projet_syllabus;

import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.Statement;
import java.util.ArrayList;

@SpringBootApplication
public class ProjectSyllabusApplication {
	public static Database db = new Database();
	public ProjectSyllabusApplication()  {
	}

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(ProjectSyllabusApplication.class, args);
		//Course cours = new Course();
		//cours.setId("4");
		//cours.fetchDocuments();
		//System.out.println(generateOrderForPrinter());

	}

	/**
	 * method to generate a Json for the printer with the document to print
	 * @return Json Object with the documents to print and the number of copies
	 * @throws SQLException
	 */
	public static JSONObject generateOrderForPrinter() throws SQLException{
		//Creating a JSONObject object
		JSONObject jsonObject = new JSONObject();
		//Fetch orders to print
		String table = "orders";
		String state = "traitement";
		Statement stmt = db.con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT count(documentId) as number, name, documentId, pages\n" +
				"FROM orders o\n" +
				"inner join map_docu_order m\n" +
				"on o.orderID= `m`.`order`\n" +
				"inner join document d\n" +
				"on m.document=d.documentId\n" +
				"WHERE state=\"traitement\"\n" +
				"GROUP BY documentId;");
		int count = 1;
		while(rs.next()){
			JSONObject miniJson = new JSONObject();
			miniJson.put("document ID",rs.getInt("documentID"));
			miniJson.put("document title",rs.getString("name"));
			miniJson.put("number of copies",rs.getInt("number"));
			miniJson.put("number of pages",rs.getInt("pages"));
			jsonObject.put(count,miniJson);
			count++;
		}
		return jsonObject;
	}

}
