package com.demo.Spring_data_jpa_relationship.repository;

import com.demo.Spring_data_jpa_relationship.model.Guardian;
import com.demo.Spring_data_jpa_relationship.model.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

class StudentRepositoryTest {

    @Autowired
    private StudentGuardianRepository studentGuardianRepository;

    @Autowired
    private Student student;

    @Autowired
    private Guardian guardian;


    @Test
    public void StudentwithGaurdian()
    {
        guardian.setName("tej");
        guardian.setEmail("tej@gmail.com");
        guardian.setMobile("12345678");


        student.setFirstName("Kirtin");
        student.setLastName("bhat");
        student.setEmailId("kirtinaa2001@gmail.com");
        student.setGuardian(guardian);

        studentGuardianRepository.save(student);
    }


    @Test
    @DisplayName("All student information is printing")
    public void gettallStudent()
    {
        List<Student> studentList=studentGuardianRepository.findAll();

        for(int i=0; i<studentList.size(); i++)
        {
            System.out.println(studentList.get(i));
        }
    }

    @Test
    @DisplayName("Printing student details based on their name")
    public void NameStudent()
    {
        //Only see the student_firstname attribute in database
        String text= "kirtin";
        List<Student> studentList = studentGuardianRepository.findByFirstNameIgnoreCase(text);
        for(int i=0; i<studentList.size(); i++)
        {
            System.out.println(studentList.get(i));
            student=studentList.get(i);
            assertEquals("Kirtin",student.getFirstName());
        }
    }

    @Test
    @DisplayName("Searching the student")
    public void SearchStudent()
    {
        String text="k";
        String text1="b";
        List<Student> studentList=studentGuardianRepository.findByFirstNameIgnoreCaseContainingAndLastNameIgnoreCaseContaining(text,text1);
        for(int i=0; i<studentList.size(); i++)
        {
            System.out.println(studentList.get(i));
        }
    }

  @Test
    public void GetEmail()
  {
      String text="rahul";
      String mail= studentGuardianRepository.getEmailIdByFirstName(text);
      System.out.println(mail);
  }

  @Test
  public void updateName()
  {
      int id=1;
      String name="Nandan";
      String email="nandan2001@gmail.com";
      studentGuardianRepository.UpdateStudent(id,name,email);


  }

}
