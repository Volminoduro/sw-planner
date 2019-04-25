package application.entity;

import application.enums.Attribute;
import application.enums.Family;
import application.enums.Role;
import application.enums.StarGrade;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "monster")
public abstract class Monster implements Comparable<Monster> {

    private String name;
    private Family family;
    private Attribute attribute;
    private Role role;
    private StarGrade starGrade;
    private Level level;
    private boolean awakened;
    private MonsterStaticStats staticStats;
    private MonsterEvolvingStats evolvingStats;
    // TODO : Everything, excepts skills' logic should be saved into database
    private List<Skill> skills;
    // TODO
    private LeaderSkill leaderSkill;

    public Monster() {
    }

    protected Monster(Monster monster) {
        this.name = monster.name;
        this.family = monster.family;
        this.attribute = monster.attribute;
        this.role = monster.role;
        this.starGrade = monster.starGrade;
        this.level = monster.level;
        this.awakened = monster.awakened;
        this.staticStats = monster.staticStats;
        this.evolvingStats = monster.evolvingStats;
        this.skills = monster.skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public StarGrade getStarGrade() {
        return starGrade;
    }

    public void setStarGrade(StarGrade starGrade) {
        this.starGrade = starGrade;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public boolean isAwakened() {
        return awakened;
    }

    public void setAwakened(boolean awakened) {
        this.awakened = awakened;
    }

    public MonsterStaticStats getStaticStats() {
        return staticStats;
    }

    public void setStaticStats(MonsterStaticStats staticStats) {
        this.staticStats = staticStats;
    }

    public MonsterEvolvingStats getEvolvingStats() {
        return evolvingStats;
    }

    public void setEvolvingStats(MonsterEvolvingStats evolvingStats) {
        this.evolvingStats = evolvingStats;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public LeaderSkill getLeaderSkill() {
        return leaderSkill;
    }

    public void setLeaderSkill(LeaderSkill leaderSkill) {
        this.leaderSkill = leaderSkill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monster)) return false;
        Monster monster = (Monster) o;
        return (this.family.equals(monster.family) && this.attribute.equals(monster.attribute)) || this.name.equals(monster.name);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", family=" + family +
                ", attribute=" + attribute +
                ", role=" + role +
                ", level=" + level +
                ", awakened=" + awakened +
                ", staticStats=" + staticStats +
                ", evolvingStats=" + evolvingStats +
                ", skills=" + skills +
                ", leaderSkill=" + leaderSkill +
                '}';
    }
}
