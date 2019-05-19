package application.dao;

import application.document.RestrictedMonsterDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestrictedMonsterDocumentRepository extends MongoRepository<RestrictedMonsterDocument, String> {
}
