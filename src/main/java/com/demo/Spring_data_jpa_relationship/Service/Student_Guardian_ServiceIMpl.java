package com.demo.Spring_data_jpa_relationship.Service;

import com.demo.Spring_data_jpa_relationship.error.InfoNotFound;
import com.demo.Spring_data_jpa_relationship.model.Student;
import com.demo.Spring_data_jpa_relationship.repository.StudentGuardianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student_Guardian_ServiceIMpl implements Student_Guardian_Service {

    @Autowired
   public StudentGuardianRepository studentGuardianRepository;

    @Override
    public void Insert_Student_Guardian(Student student) {
        studentGuardianRepository.save(student);
    }

    @Override
    public List<Student> Get_studentsInfo() throws InfoNotFound {
        List<Student> students = studentGuardianRepository.findAll();

        if(students.isEmpty())
        {
            throw new InfoNotFound("There is no studentInfo available");
        }
        else
        {
            return students;
        }

    }
}
