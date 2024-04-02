package com.demo.Spring_data_jpa_relationship.Service;

import com.demo.Spring_data_jpa_relationship.error.InfoNotFound;
import com.demo.Spring_data_jpa_relationship.model.Course;
import com.demo.Spring_data_jpa_relationship.model.CourseMaterial;
import com.demo.Spring_data_jpa_relationship.repository.CourseMaterialRepository;
import com.demo.Spring_data_jpa_relationship.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseMaterial_Course_ServiceIMpl implements CourseMaterial_Course_Service{

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Autowired
    private CourseRepo courseRepo;
    @Override
    public void Insert_CourseMaterial_Course(CourseMaterial courseMaterial) {
        courseMaterialRepository.save(courseMaterial);


    }

    @Override
    public List<CourseMaterial> Get_CourseMaterial_CourseInfo() throws InfoNotFound {
        List<CourseMaterial> courseMaterials = courseMaterialRepository.findAll();

        if(courseMaterials.isEmpty())
        {
            throw new InfoNotFound("There is no Course and CourseMaterial Information not found");
        }
        else
        {
            return courseMaterials;
        }


    }

    @Override
    public List<Course> Get_OnlyCourseInfo() {
        return courseRepo.findAll();
    }
}
