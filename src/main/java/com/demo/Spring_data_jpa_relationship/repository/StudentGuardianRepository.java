package com.demo.Spring_data_jpa_relationship.repository;

import com.demo.Spring_data_jpa_relationship.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentGuardianRepository extends JpaRepository<Student,Long> {
}
