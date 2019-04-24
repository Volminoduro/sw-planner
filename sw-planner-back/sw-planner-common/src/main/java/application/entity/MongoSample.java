package application.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mongosample")
public class MongoSample {

    @Id
    private String nom;
    private int amount;
    private MongoDocument document;

    public MongoSample(String nom, int amount, MongoDocument document) {
        this.nom = nom;
        this.amount = amount;
        this.document = document;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public MongoDocument getDocument() {
        return document;
    }

    public void setDocument(MongoDocument document) {
        this.document = document;
    }
}
