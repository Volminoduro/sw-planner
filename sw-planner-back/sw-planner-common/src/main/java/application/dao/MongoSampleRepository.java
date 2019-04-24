package application.dao;

import application.entity.MongoSample;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoSampleRepository extends MongoRepository<MongoSample, Integer> {
    MongoSample findByNom(String nom);
}