package com.demo.Sql.repositories;

import com.demo.Sql.model.Doctor;
import com.demo.Sql.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    List<Doctor> findByFirstName(String firstName);
    Doctor findByDoctorID(int doctorID);
}
