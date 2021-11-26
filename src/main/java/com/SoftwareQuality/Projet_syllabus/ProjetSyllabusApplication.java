package com.SoftwareQuality.Projet_syllabus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class ProjetSyllabusApplication {

	public ProjetSyllabusApplication()  {
	}

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(ProjetSyllabusApplication.class, args);
		Database db = new Database();
		db.getData("document");
	}


}
