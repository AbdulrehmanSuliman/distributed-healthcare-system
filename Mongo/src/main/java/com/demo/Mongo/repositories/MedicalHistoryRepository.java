package com.demo.Mongo.repositories;

import com.demo.Mongo.models.collections.MedicalHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalHistoryRepository extends MongoRepository<MedicalHistory, String> {
}
