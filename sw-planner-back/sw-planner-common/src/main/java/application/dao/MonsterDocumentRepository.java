package application.dao;

import application.document.MonsterDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MonsterDocumentRepository extends MongoRepository<MonsterDocument, String> {

    MonsterDocument findByName(String name);

}
