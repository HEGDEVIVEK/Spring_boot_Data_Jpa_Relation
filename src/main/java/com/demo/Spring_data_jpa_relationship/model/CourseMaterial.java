package com.demo.Spring_data_jpa_relationship.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
public class CourseMaterial
{
    @Id
    @SequenceGenerator(name="course_material_sequence", sequenceName = "course_material_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_material_sequence")
    private Long courseMaterialId;

    @Column(nullable = false,unique = true)
    private String courseMaterialTitle;

    @NotBlank
    private String courseMaterialUrl;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="course_id",referencedColumnName = "courseId")
    private Course course;


}
