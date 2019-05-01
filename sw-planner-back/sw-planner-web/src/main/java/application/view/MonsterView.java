package application.view;

import application.entity.LeaderSkill;
import application.entity.Monster;
import application.entity.MonsterEvolvingStat;
import application.entity.MonsterStaticStat;
import application.mapper.MonsterSkillToMonsterSkillViewMapper;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Collection;
import java.util.List;

@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
public class MonsterView {

    String name;
    String family;
    String attribute;
    String role;
    List<MonsterStaticStat> staticStats;
    List<MonsterEvolvingStat> evolvingStats;
    Collection<SkillView> skills;
    LeaderSkill leaderSkill;

    public MonsterView(Monster monster){
        this.name = monster.getName();
        this.family = monster.getFamily().name();
        this.attribute = monster.getAttribute().name();
        this.role = monster.getRole().name();
        this.staticStats = monster.getStaticStats();
        this.evolvingStats = monster.getEvolvingStats();
        this.skills = MonsterSkillToMonsterSkillViewMapper.map(monster.getSkills());
        this.leaderSkill = monster.getLeaderSkill();
    }
}
