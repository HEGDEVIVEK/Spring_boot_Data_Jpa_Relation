package com.demo.Spring_data_jpa_relationship.Service;

import com.demo.Spring_data_jpa_relationship.error.InfoNotFound;
import com.demo.Spring_data_jpa_relationship.model.Student;

import java.util.List;

public interface Student_Guardian_Service {
    void Insert_Student_Guardian(Student student);

    List<Student> Get_studentsInfo() throws InfoNotFound;
}
