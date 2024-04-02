package com.demo.Spring_data_jpa_relationship.repository;

import com.demo.Spring_data_jpa_relationship.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Long> {
}
