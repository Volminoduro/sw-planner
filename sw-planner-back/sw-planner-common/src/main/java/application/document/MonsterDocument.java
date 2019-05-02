package application.document;

import application.entity.LeaderSkill;
import application.entity.MonsterEvolvingStat;
import application.entity.MonsterStaticStat;
import application.entity.Skill;
import application.enums.Attribute;
import application.enums.Family;
import application.enums.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "monster")
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
public class MonsterDocument {

    @Id
    String name;
    Family family;
    Attribute attribute;
    Role role;
    List<MonsterStaticStat> staticStats;
    List<MonsterEvolvingStat> evolvingStats;
    List<Skill> skills;
    // TODO
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
}
