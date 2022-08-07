package com.demo.Sql.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "diagnosis")
@NoArgsConstructor
public class Diagnosis {
    @Id
    @GeneratedValue
    private int visitId;
    private int patientID;
    private int  doctorID;
    private String descriptions;
    private String temperature;
    private String systolicPressure;
    private String diastolicPressure;


    public Diagnosis(int Patient_ID,int Doctor_ID,String Description,String Temperature,
                     String SystolicPressure,String DiastolicPressure ) {
        this.patientID = Patient_ID;
        this.doctorID = Doctor_ID;
        this.descriptions = Description;
        this.temperature = Temperature;
        this.systolicPressure = SystolicPressure;
        this.diastolicPressure = DiastolicPressure;
    }

    public Diagnosis(int visitId, int Patient_ID,int Doctor_ID,String Description,String Temperature,
                     String SystolicPressure,String DiastolicPressure) {
        this.visitId = visitId;
        this.patientID = Patient_ID;
        this.doctorID = Doctor_ID;
        this.descriptions = Description;
        this.temperature = Temperature;
        this.systolicPressure = SystolicPressure;
        this.diastolicPressure = DiastolicPressure;
    }
}
