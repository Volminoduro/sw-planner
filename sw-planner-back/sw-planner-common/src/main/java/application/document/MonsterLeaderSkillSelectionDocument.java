package application.document;

import application.entity.LeaderSkill;
import org.bson.BsonBinary;
import org.bson.BsonString;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "monster")
public class MonsterLeaderSkillSelectionDocument {

    private BsonString name;
    private BsonString family;
    private BsonString attribute;
    private BsonString role;
    private BsonBinary image;
    // TODO
    private LeaderSkill leaderSkill;

    public MonsterLeaderSkillSelectionDocument(BsonString name, BsonString family, BsonString attribute, BsonString role, BsonBinary image, LeaderSkill leaderSkill) {
        this.name = name;
        this.family = family;
        this.attribute = attribute;
        this.role = role;
        this.image = image;
    }

    public BsonString getName() {
        return name;
    }

    public void setName(BsonString name) {
        this.name = name;
    }

    public BsonString getFamily() {
        return family;
    }

    public void setFamily(BsonString family) {
        this.family = family;
    }

    public BsonString getAttribute() {
        return attribute;
    }

    public void setAttribute(BsonString attribute) {
        this.attribute = attribute;
    }

    public BsonString getRole() {
        return role;
    }

    public void setRole(BsonString role) {
        this.role = role;
    }

    public BsonBinary getImage() {
        return image;
    }

    public void setImage(BsonBinary image) {
        this.image = image;
    }

    public LeaderSkill getLeaderSkill() {
        return leaderSkill;
    }

    public void setLeaderSkill(LeaderSkill leaderSkill) {
        this.leaderSkill = leaderSkill;
    }

    @Override
    public String toString() {
        return "MonsterLeaderSkillSelectionDocument{" +
                "name=" + name +
                ", family=" + family +
                ", attribute=" + attribute +
                ", role=" + role +
                ", image=" + image +
                ", leaderSkill=" + leaderSkill +
                '}';
    }
}
