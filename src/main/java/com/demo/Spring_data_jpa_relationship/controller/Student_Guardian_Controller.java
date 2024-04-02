package com.demo.Spring_data_jpa_relationship.controller;

import com.demo.Spring_data_jpa_relationship.Service.Student_Guardian_Service;
import com.demo.Spring_data_jpa_relationship.error.InfoNotFound;
import com.demo.Spring_data_jpa_relationship.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Student_Guardian_Controller
{
    @Autowired
    Student_Guardian_Service studentGuardianService;
    @PostMapping("/Insert_Student_Guardian")
    public  void Insert_Student_Guardian(@RequestBody Student student)
    {

        studentGuardianService.Insert_Student_Guardian(student);
    }

    @GetMapping("/Get_studentsInfo")
    public List<Student> Get_studentsInfo() throws InfoNotFound {
        return  studentGuardianService.Get_studentsInfo();
    }


}
