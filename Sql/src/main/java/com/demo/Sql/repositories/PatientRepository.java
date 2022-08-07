package com.demo.Sql.repositories;

import com.demo.Sql.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
    List<Patient> findByFirstName(String firstName);
    Patient findByPatientID(int patientID);
}
