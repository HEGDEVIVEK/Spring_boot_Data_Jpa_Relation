package com.demo.Spring_data_jpa_relationship.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
@Table(name = "Student_info")
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1
    )
    @GeneratedValue(
            //strategy = GenerationType.AUTO
            strategy = GenerationType.SEQUENCE,generator = "student_sequence"
            )
    private Long studentId;

    @Column(name = "student_firstname")
    private String firstName;

    @Column(name = "student_lastname")
    private String lastName;

    @Column(
            name="student_email",
            nullable = false,
            unique = true
    )
    private String emailId;

    @Embedded
    private Guardian guardian;



}
