package com.demo.Sql.repositories;

import com.demo.Sql.model.Diagnosis;
import com.demo.Sql.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiagnosisRepository extends JpaRepository<Diagnosis, Integer> {
    Diagnosis findByVisitId(int visitId);
    List<Diagnosis> findByPatientID(int patientID);
    List<Diagnosis> findByDoctorID(int doctorID);
}
