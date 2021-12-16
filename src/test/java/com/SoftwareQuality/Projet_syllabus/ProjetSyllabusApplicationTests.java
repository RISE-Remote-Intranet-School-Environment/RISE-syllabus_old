package com.SoftwareQuality.Projet_syllabus;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.skyscreamer.jsonassert.JSONAssert;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.SoftwareQuality.Projet_syllabus.ProjectSyllabusApplication.db;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProjetSyllabusApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void generateOrderForPrinter() throws SQLException {
		JSONObject jsonTest = new JSONObject();
		String doc1 = "1";
		String doc2 = "2";

		JSONObject miniJson1 = new JSONObject();
		miniJson1.put("document ID",1);
		miniJson1.put("document title","Test");
		miniJson1.put("number of copies",3);
		miniJson1.put("number of pages",55);

		JSONObject miniJson2 = new JSONObject();
		miniJson2.put("document ID",2);
		miniJson2.put("document title","oui");
		miniJson2.put("number of copies",1);
		miniJson2.put("number of pages",12);

		jsonTest.put(doc1,miniJson1);
		jsonTest.put(doc2,miniJson2);

		ProjectSyllabusApplication app = new ProjectSyllabusApplication();
		JSONObject actual = app.generateOrderForPrinter();
		assertEquals(actual,jsonTest);
	}

}
