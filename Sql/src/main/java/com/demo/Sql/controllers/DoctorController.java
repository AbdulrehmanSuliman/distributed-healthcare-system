package com.demo.Sql.controllers;

import com.demo.Sql.model.Doctor;
import com.demo.Sql.model.Patient;
import com.demo.Sql.repositories.DoctorRepository;
import com.demo.Sql.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping("/doctors")
    public List<Doctor> findAllDoctors() {
        return doctorRepository.findAll();
    }

    @GetMapping("/doctor/{firstName}")
    public ResponseEntity<List<Doctor>> findFirstName(@PathVariable(value = "firstName") String firstName) {
        List<Doctor> doctors = doctorRepository.findByFirstName(firstName);
        return ResponseEntity.ok().body(doctors);
    }
    @PostMapping("/doctors/save")
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor){
        return ResponseEntity.ok().body(doctorRepository.save(doctor));
    }


}