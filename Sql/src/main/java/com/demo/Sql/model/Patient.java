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
@Table(name = "patient")
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue
    private int patientID;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int age;
    private String address;


    public Patient(String firstName, String lastName, Date birthDate,int age,String address) {
        this.firstName=firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.age =age;
        this.address=address;
    }

    public Patient(int patientID,String firstName, String lastName, Date birthDate,int age,String address) {
        this.patientID = patientID;
        this.firstName=firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.age =age;
        this.address=address;
    }
}
