package application.view;

import application.entity.LeaderSkill;
import application.entity.Monster;
import application.entity.MonsterEvolvingStat;
import application.entity.MonsterStaticStat;
import application.mapper.MonsterSkillToMonsterSkillViewMapper;

import java.util.Collection;
import java.util.List;

public class MonsterView {

    private String name;
    private String family;
    private String attribute;
    private String role;
    private List<MonsterStaticStat> staticStats;
    private List<MonsterEvolvingStat> evolvingStats;
    private Collection<SkillView> skills;
    private LeaderSkill leaderSkill;

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

    public MonsterView(String name, String family, String attribute, String role, List<MonsterStaticStat> staticStats, List<MonsterEvolvingStat> evolvingStats, Collection<SkillView> skills, LeaderSkill leaderSkill) {
        this.name = name;
        this.family = family;
        this.attribute = attribute;
        this.role = role;
        this.staticStats = staticStats;
        this.evolvingStats = evolvingStats;
        this.skills = skills;
        this.leaderSkill = leaderSkill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<MonsterStaticStat> getStaticStats() {
        return staticStats;
    }

    public void setStaticStats(List<MonsterStaticStat> staticStats) {
        this.staticStats = staticStats;
    }

    public List<MonsterEvolvingStat> getEvolvingStats() {
        return evolvingStats;
    }

    public void setEvolvingStats(List<MonsterEvolvingStat> evolvingStats) {
        this.evolvingStats = evolvingStats;
    }

    public Collection<SkillView> getSkills() {
        return skills;
    }

    public void setSkills(Collection<SkillView> skills) {
        this.skills = skills;
    }

    public LeaderSkill getLeaderSkill() {
        return leaderSkill;
    }

    public void setLeaderSkill(LeaderSkill leaderSkill) {
        this.leaderSkill = leaderSkill;
    }

}
