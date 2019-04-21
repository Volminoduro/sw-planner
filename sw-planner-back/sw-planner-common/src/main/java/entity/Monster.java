package entity;

import enums.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.SortedMap;

public abstract class Monster implements Comparable<Monster> {

    private String name;
    private Family family;
    private Attribute attribute;
    private Role role;
    private Level level;
    private boolean awakened;
    private SortedMap<StaticStatType, HashMap<Boolean, Integer>> staticStats;
    private SortedMap<StarGrade, HashMap<Boolean, HashMap<EvolvingStatType, HashMap<Level, Integer>>>> evolvingStats;
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

    public SortedMap<StaticStatType, HashMap<Boolean, Integer>> getStaticStats() {
        return staticStats;
    }

    public void setStaticStats(SortedMap<StaticStatType, HashMap<Boolean, Integer>> staticStats) {
        this.staticStats = staticStats;
    }

    public SortedMap<StarGrade, HashMap<Boolean, HashMap<EvolvingStatType, HashMap<Level, Integer>>>> getEvolvingStats() {
        return evolvingStats;
    }

    public void setEvolvingStats(SortedMap<StarGrade, HashMap<Boolean, HashMap<EvolvingStatType, HashMap<Level, Integer>>>> evolvingStats) {
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
                ", evolvingStats=" + evolvingStats +
                ", skills=" + skills +
                '}';
    }
}
