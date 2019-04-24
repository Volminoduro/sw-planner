package application.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mongodocument")
public class MongoDocument {

    @Id
    private String name;
    private String content;

    public MongoDocument(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MongoDocument{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
