package application.entity;

import application.enums.StaticStatType;

public class MonsterStaticStat {

    private boolean awaken;
    private StaticStatType staticStatType;
    private int amount;

    public MonsterStaticStat(boolean awaken, StaticStatType staticStatType, int amount) {
        this.awaken = awaken;

        this.staticStatType = staticStatType;
        this.amount = amount;
    }

    public boolean isAwaken() {
        return awaken;
    }

    public void setAwaken(boolean awaken) {
        this.awaken = awaken;
    }

    public StaticStatType getStaticStatType() {
        return staticStatType;
    }

    public void setStaticStatType(StaticStatType staticStatType) {
        this.staticStatType = staticStatType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "MonsterStaticStat{" +
                "awaken=" + awaken +
                ", amount=" + amount +
                ", staticStatType=" + staticStatType +
                '}';
    }
}
