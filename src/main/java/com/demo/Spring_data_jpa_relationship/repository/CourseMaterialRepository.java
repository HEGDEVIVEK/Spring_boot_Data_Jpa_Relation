package com.demo.Spring_data_jpa_relationship.repository;

import com.demo.Spring_data_jpa_relationship.model.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long>
{

}
