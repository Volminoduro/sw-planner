package application.entity;

import application.enums.EvolvingStatType;

public class MonsterEvolvingStat {

    private int starGrade;
    private boolean awaken;
    private EvolvingStatType evolvingStatType;
    private int level;
    private int amount;

    public MonsterEvolvingStat(int starGrade, boolean awaken, EvolvingStatType evolvingStatType, int level, int amount) {
        this.starGrade = starGrade;
        this.awaken = awaken;
        this.evolvingStatType = evolvingStatType;
        this.level = level;
        this.amount = amount;
    }

    public int getStarGrade() {
        return starGrade;
    }

    public void setStarGrade(int starGrade) {
        this.starGrade = starGrade;
    }

    public boolean isAwaken() {
        return awaken;
    }

    public void setAwaken(boolean awaken) {
        this.awaken = awaken;
    }

    public EvolvingStatType getEvolvingStatType() {
        return evolvingStatType;
    }

    public void setEvolvingStatType(EvolvingStatType evolvingStatType) {
        this.evolvingStatType = evolvingStatType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
