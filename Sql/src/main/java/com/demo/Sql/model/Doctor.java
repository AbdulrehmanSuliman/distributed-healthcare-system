package com.demo.Sql.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "doctor")
@NoArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue
    private Long doctorID;
    private String firstName;
    private String lastName;
    private String specialization;
    private String certificate;


    public Doctor(String First_Name, String Last_Name,String Specialization,String Certificate) {
        this.firstName=First_Name;
        this.lastName = Last_Name;
        this.specialization = Specialization;
        this.certificate = Certificate;
    }

    public Doctor(Long Doctor_ID, String First_Name, String Last_Name, String Specialization,String Certificate) {
        this.doctorID = Doctor_ID;
        this.firstName=First_Name;
        this.lastName = Last_Name;
        this.specialization = Specialization;
        this.certificate = Certificate;
    }
}
