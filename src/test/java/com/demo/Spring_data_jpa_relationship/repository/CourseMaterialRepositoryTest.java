package com.demo.Spring_data_jpa_relationship.repository;

import com.demo.Spring_data_jpa_relationship.model.Course;
import com.demo.Spring_data_jpa_relationship.model.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;
    @Autowired
    private CourseMaterial courseMaterial;
    @Autowired
    private Course course;


    @Test
    public void InsertCourseMaterial()
    {

        course.setCourseTitle("JAVA");
        course.setCourseCredit(4);

        courseMaterial.setCourseMaterialTitle("JAVA BY VIVEK");
        courseMaterial.setCourseMaterialUrl("www.google.com");
        courseMaterial.setCourse(course);

        courseMaterialRepository.save(courseMaterial);
    }

    @Test
    public void  printCourseMaterial()
    {
        List<CourseMaterial> courseMaterialList= courseMaterialRepository.findAll();
        System.out.println(courseMaterialList);
    }


}