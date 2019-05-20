package application.document;

import application.entity.LeaderSkill;
import application.entity.MonsterEvolvingStat;
import application.entity.MonsterStaticStat;
import application.entity.Skill;
import application.enums.Attribute;
import application.enums.Family;
import application.enums.Role;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
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
public class MonsterMockDocument {

    @Id
    String name;
    Family family;
    Attribute attribute;
    Role role;
    String image;
    List<MonsterStaticStat> staticStats;
    List<MonsterEvolvingStat> evolvingStats;
    List<Skill> skills;
    LeaderSkill leaderSkill;
}
