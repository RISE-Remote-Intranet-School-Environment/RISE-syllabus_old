package com.SoftwareQuality.Projet_syllabus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class ProjectSyllabusApplication {

	public ProjectSyllabusApplication()  {
	}

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(ProjectSyllabusApplication.class, args);
		Database db = new Database();
		db.getData("document");
	}

}
