package com.demo.Sql.controllers;

import com.demo.Sql.model.Patient;
import com.demo.Sql.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> findAllPatients() {
        return patientRepository.findAll();
    }

    @GetMapping("/patients/{firstName}")
    public ResponseEntity<List<Patient>> findFirstName(@PathVariable(value = "firstName") String firstName) {
        List<Patient> patients = patientRepository.findByFirstName(firstName);
        return ResponseEntity.ok().body(patients);
    }
    @PostMapping("/patient/save")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient){
        return ResponseEntity.ok().body(patientRepository.save(patient));
    }
}