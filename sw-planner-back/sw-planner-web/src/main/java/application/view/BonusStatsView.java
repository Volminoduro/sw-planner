package application.view;

import application.entity.BonusStat;
import application.enums.StatType;
import org.jetbrains.annotations.NotNull;

public class BonusStatsView {

    private StatType statType;
    private int amount;
    private boolean multiplicative;

    public BonusStatsView(StatType statType, int amount, boolean multiplicative) {
        this.statType = statType;
        this.amount = amount;
        this.multiplicative = multiplicative;
    }

    public BonusStatsView(@NotNull BonusStat bonusStat){
        this.statType = bonusStat.getStat().getStatType();
        this.amount = bonusStat.getStat().getAmount();
        this.multiplicative = bonusStat.isMultiplicative();
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

    public boolean isMultiplicative() {
        return multiplicative;
    }

    public void setMultiplicative(boolean multiplicative) {
        this.multiplicative = multiplicative;
    }
}
