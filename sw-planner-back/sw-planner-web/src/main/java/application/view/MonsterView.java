package application.view;

import application.entity.LeaderSkill;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class MonsterView {

    private String name;
    private String family;
    private String attribute;
    private String role;
    private int starGrade;
    private int level;
    private boolean awakened;
    private Map<Boolean, HashMap<String, Integer>> staticStats;
    private Map<Integer, HashMap<Boolean, HashMap<String, HashMap<Integer, Integer>>>> evolvingStats;
    private SortedMap<Integer, RuneView> runes;
    // TODO : Remove skill logic
    private Collection<SkillView> skills;
    private LeaderSkill leaderSkill;

    public MonsterView(String name, String family, String attribute, String role, int starGrade, int level, boolean awakened, Map<Boolean, HashMap<String, Integer>> staticStats, Map<Integer, HashMap<Boolean, HashMap<String, HashMap<Integer, Integer>>>> evolvingStats, SortedMap<Integer, RuneView> runes, Collection<SkillView> skills, LeaderSkill leaderSkill) {
        this.name = name;
        this.family = family;
        this.attribute = attribute;
        this.role = role;
        this.starGrade = starGrade;
        this.level = level;
        this.awakened = awakened;
        this.staticStats = staticStats;
        this.evolvingStats = evolvingStats;
        this.runes = runes;
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

    public int getStarGrade() {
        return starGrade;
    }

    public void setStarGrade(int starGrade) {
        this.starGrade = starGrade;
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

    public Map<Boolean, HashMap<String, Integer>> getStaticStats() {
        return staticStats;
    }

    public void setStaticStats(Map<Boolean, HashMap<String, Integer>> staticStats) {
        this.staticStats = staticStats;
    }

    public Map<Integer, HashMap<Boolean, HashMap<String, HashMap<Integer, Integer>>>> getEvolvingStats() {
        return evolvingStats;
    }

    public void setEvolvingStats(Map<Integer, HashMap<Boolean, HashMap<String, HashMap<Integer, Integer>>>> evolvingStats) {
        this.evolvingStats = evolvingStats;
    }

    public SortedMap<Integer, RuneView> getRunes() {
        return runes;
    }

    public void setRunes(SortedMap<Integer, RuneView> runes) {
        this.runes = runes;
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

    @Override
    public String toString() {
        return "MonsterView{" +
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
