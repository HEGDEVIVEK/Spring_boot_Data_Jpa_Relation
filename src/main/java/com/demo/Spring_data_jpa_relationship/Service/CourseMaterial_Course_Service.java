package com.demo.Spring_data_jpa_relationship.Service;

import com.demo.Spring_data_jpa_relationship.error.InfoNotFound;
import com.demo.Spring_data_jpa_relationship.model.Course;
import com.demo.Spring_data_jpa_relationship.model.CourseMaterial;
import com.demo.Spring_data_jpa_relationship.model.Student;

import java.util.List;

public interface CourseMaterial_Course_Service
{

    void Insert_CourseMaterial_Course(CourseMaterial courseMaterial);

    List<CourseMaterial> Get_CourseMaterial_CourseInfo() throws InfoNotFound;

    List<Course> Get_OnlyCourseInfo();
}
