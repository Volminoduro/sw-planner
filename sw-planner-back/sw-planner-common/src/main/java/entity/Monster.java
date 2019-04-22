package entity;

import enums.Attribute;
import enums.Family;
import enums.Role;
import enums.StarGrade;

import java.util.Collection;

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
    private Collection<Skill> skills;
    private LeaderSkill leaderSkill;

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

    public Collection<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Collection<Skill> skills) {
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
