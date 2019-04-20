package entity;

import enums.Attribute;
import enums.Family;
import enums.Role;

import java.util.Collection;

public abstract class Monster implements Comparable<Monster> {

    private String name;
    private Family family;
    private Attribute attribute;
    private Role role;
    private int level;
    private boolean awakened;
    private Collection<Stat> stats;
    private Collection<Skill> skills;
    private LeaderSkill leaderSkill;

    // TODO : Everything, excepts skills' logic should be saved into database

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isAwakened() {
        return awakened;
    }

    public void setAwakened(boolean awakened) {
        this.awakened = awakened;
    }

    public Collection<Stat> getStats() {
        return stats;
    }

    public void setStats(Collection<Stat> stats) {
        this.stats = stats;
    }

    public Collection<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Collection<Skill> skills) {
        this.skills = skills;
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
                ", stats=" + stats +
                ", skills=" + skills +
                '}';
    }
}
