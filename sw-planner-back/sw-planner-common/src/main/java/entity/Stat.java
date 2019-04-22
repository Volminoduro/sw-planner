package entity;

import enums.StatType;

public class Stat {

    private StatType statType;
    private int amount;

    public Stat(StatType statType, int amount) {
        this.statType = statType;
        this.amount = amount;
    }

    public StatType getStatType() {
        return statType;
    }

    public void setStatType(StatType statType) {
        this.statType = statType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Stat{" +
                "statType=" + statType +
                ", amount=" + amount +
                '}';
    }
}
