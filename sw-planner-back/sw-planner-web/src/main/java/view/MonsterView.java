package view;

import entity.LeaderSkill;
import entity.Monster;
import entity.Skill;
import entity.Stat;
import enums.Attribute;
import enums.Family;
import enums.Role;

import java.util.Collection;

public class MonsterView {

    private String name;
    private Family family;
    private Attribute attribute;
    private Role role;
    private int level;
    private boolean awakened;
    private Collection<Stat> stats;
    private Collection<Skill> skills;
    private LeaderSkill leaderSkill;

    public MonsterView(Monster monster){

    }
}
