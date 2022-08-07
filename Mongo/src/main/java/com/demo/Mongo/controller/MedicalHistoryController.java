package com.demo.Mongo.controller;

import com.demo.Mongo.models.RadiologyRecords;
import com.demo.Mongo.models.collections.MedicalHistory;
import com.demo.Mongo.repositories.MedicalHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class MedicalHistoryController {

    @Autowired
    private MedicalHistoryRepository MedicalHistoryRepository;

    @GetMapping("/histories")
    public List<MedicalHistory> findAllHistories() {
        return MedicalHistoryRepository.findAll();
    }

    @PostMapping("/history/save")
    public MedicalHistory saveHistory(@RequestBody MedicalHistory history) {
        return MedicalHistoryRepository.save(history);
    }

    @GetMapping("/history/{id}")
    public ResponseEntity<MedicalHistory> findById(@PathVariable(value = "id") String id) {
        Optional<MedicalHistory> history = MedicalHistoryRepository.findById(id);
        if (history.isPresent()) {
            return ResponseEntity.ok().body(history.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("hist/ory/{id}/editAllergies")
    public ResponseEntity<MedicalHistory> editAllergies(@PathVariable(value = "id") String id,@RequestBody String Allergies){
        Optional<MedicalHistory> optionalhistory = MedicalHistoryRepository.findById(id);
        if (optionalhistory.isPresent()){
            MedicalHistory medicalHistory = optionalhistory.get();
            medicalHistory.setAllergies(Allergies);
            return ResponseEntity.ok().body(MedicalHistoryRepository.save(medicalHistory));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/delete/{id}")
    public void findNoRadiology(@PathVariable(value = "id") String id) {
        MedicalHistoryRepository.deleteById(id);
    }
    @PostMapping("/add/{id}/RadiologyRecord")
    public ResponseEntity<MedicalHistory> addRadiologyRecord(@PathVariable(value = "id") String id
    ,@RequestBody RadiologyRecords radRecord){
        Optional<MedicalHistory> optionalhistory = MedicalHistoryRepository.findById(id);
        if (optionalhistory.isPresent()) {
            MedicalHistory medicalHistory = optionalhistory.get();
            List<RadiologyRecords> radiologyRecords = medicalHistory.getRadiology_Records();
            if (radiologyRecords == null){
                radiologyRecords = new ArrayList<>();
            }
            radiologyRecords.add(radRecord);
            medicalHistory.setRadiology_Records(radiologyRecords);
            return ResponseEntity.ok().body(MedicalHistoryRepository.save(medicalHistory));
        }
        else{
            return ResponseEntity.notFound().build();
        }

    }
}