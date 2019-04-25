package application.dao;

import application.entity.Monster;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MonsterRepository extends MongoRepository<Monster, String> {

    Monster findByName(String name);
}
