package application.document;

import application.entity.LeaderSkill;
import application.entity.MonsterStaticStat;
import application.entity.Skill;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "monster")
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
public class MonsterDocument extends RestrictedMonsterDocument {

    @DBRef(lazy = true)
    List<MonsterStaticStat> staticStats;
    @DBRef(lazy = true)
    List<Skill> skills;
    // TODO
    @DBRef(lazy = true)
    LeaderSkill leaderSkill;

    public MonsterDocument(MonsterDocument monsterDocument){
        this.name = monsterDocument.getName();
        this.family = monsterDocument.getFamily();
        this.attribute = monsterDocument.getAttribute();
        this.role = monsterDocument.getRole();
        this.staticStats = monsterDocument.getStaticStats();
        this.evolvingStats = monsterDocument.getEvolvingStats();
        this.skills = monsterDocument.getSkills();
        this.leaderSkill = monsterDocument.getLeaderSkill();
    }

    public MonsterDocument(MonsterMockDocument monsterMockDocument){
        this.name = monsterMockDocument.getName();
        this.family = monsterMockDocument.getFamily();
        this.attribute = monsterMockDocument.getAttribute();
        this.role = monsterMockDocument.getRole();
        this.staticStats = monsterMockDocument.getStaticStats();
        this.evolvingStats = monsterMockDocument.getEvolvingStats();
        this.skills = monsterMockDocument.getSkills();
        this.leaderSkill = monsterMockDocument.getLeaderSkill();
    }
}
