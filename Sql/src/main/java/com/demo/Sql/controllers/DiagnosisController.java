package com.demo.Sql.controllers;

import com.demo.Sql.model.*;
import com.demo.Sql.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DiagnosisController {

    @Autowired
    private DiagnosisRepository diagnosisRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private DoctorRepository doctorRepository;


    @GetMapping("/diagnosis")
    public List<Diagnosis> findAllModels() {
        return diagnosisRepository.findAll();
    }

    @GetMapping("/diagnosis/{visitId}")
    public ResponseEntity<Diagnosis> findUserById(@PathVariable(value = "visitId") int visitId) {
        Diagnosis diagnoses = diagnosisRepository.findByVisitId(visitId);
        return ResponseEntity.ok().body(diagnoses);
    }
    @PostMapping("/diagnosis/save")
    public ResponseEntity<Diagnosis> addDiagnosis(@RequestBody Diagnosis diagnosis){
        return ResponseEntity.ok().body(diagnosisRepository.save(diagnosis));
    }
    @GetMapping("/diagnosis/{visitId}/patient")
    public Patient getPatientWithDiagnosis(@PathVariable(value = "visitId") int visitId){
        Diagnosis diagnoses = diagnosisRepository.findByVisitId(visitId);
        Patient patient = patientRepository.findByPatientID(diagnoses.getPatientID());
        return patient;
    }
}