package com.SoftwareQuality.Projet_syllabus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SoftwareQuality.Projet_syllabus.model.userModel;

@Repository
public interface userRepository extends JpaRepository<userModel, Long> {

}