package com.SoftwareQuality.Projet_syllabus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;
import java.time.LocalDate;

@SpringBootApplication
public class ProjectSyllabusApplication {
	public static Database db = new Database();
	public ProjectSyllabusApplication()  {
	}

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(ProjectSyllabusApplication.class, args);
		LocalDate date = LocalDate.of(2021, 10, 5);
		Document test = new Document("s", "Marti", date, 22, "v88", 999 );
		test.save();
	}

}
