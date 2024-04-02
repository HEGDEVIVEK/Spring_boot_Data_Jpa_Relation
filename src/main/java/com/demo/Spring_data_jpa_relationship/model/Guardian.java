package com.demo.Spring_data_jpa_relationship.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class Guardian
{
    @Column(name="guardian_name")
    private String Name;

    @Column(name="guardian_email")
    private String Email;

    @Column(name="guardian_mobile")
    private String Mobile;

}


//// Change attribute name that is no problem, but make sure that give @column(correct data base name correctly)