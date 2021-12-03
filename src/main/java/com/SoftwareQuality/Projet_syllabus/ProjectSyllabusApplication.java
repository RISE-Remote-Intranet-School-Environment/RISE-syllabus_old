package com.SoftwareQuality.Projet_syllabus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

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

		db.printWaitingOrders();
	}

}
