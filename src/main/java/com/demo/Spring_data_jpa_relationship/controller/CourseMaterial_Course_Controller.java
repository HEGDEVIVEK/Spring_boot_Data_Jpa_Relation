package com.demo.Spring_data_jpa_relationship.controller;

import com.demo.Spring_data_jpa_relationship.Service.CourseMaterial_Course_Service;
import com.demo.Spring_data_jpa_relationship.error.InfoNotFound;
import com.demo.Spring_data_jpa_relationship.model.Course;
import com.demo.Spring_data_jpa_relationship.model.CourseMaterial;
import com.demo.Spring_data_jpa_relationship.model.Student;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseMaterial_Course_Controller {

    @Autowired
    public CourseMaterial_Course_Service courseMaterialCourseService;


    @PostMapping("/Insert_CourseMaterial_Course")
    public  void Insert_CourseMaterial_Course(@Valid @RequestBody CourseMaterial courseMaterial)
    {

        courseMaterialCourseService.Insert_CourseMaterial_Course(courseMaterial);
    }

    @GetMapping("/Get_CourseMaterial_CourseInfo")
    public List<CourseMaterial> Get_CourseMaterial_CourseInfo() throws InfoNotFound {
        return  courseMaterialCourseService.Get_CourseMaterial_CourseInfo();
    }

    @GetMapping("/Get_OnlyCourseInfo")
    public List<Course> Get_OnlyCourseInfo() throws InfoNotFound {
        return  courseMaterialCourseService.Get_OnlyCourseInfo();
    }


}
