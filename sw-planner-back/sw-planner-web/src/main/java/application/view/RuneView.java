package application.view;

import application.entity.Rune;
import application.enums.StarGrade;

import java.util.List;

public class RuneView {

    private String name;
    private StarGrade starGrade;
    private BonusStatsView mainBonusStat;
    private BonusStatsView prefixBonusStat;
    // TODO : RuneSet
    private List<BonusStatsView> subBonusStats;

    public RuneView(Rune rune) {
        this.name = rune.getName();
        this.starGrade = rune.getStarGrade();
        this.mainBonusStat = new BonusStatsView(rune.getMainBonusStat());
        this.prefixBonusStat = new BonusStatsView(rune.getPrefixBonusStat());
        rune.getSubBonusStats().forEach(bonusStat -> this.subBonusStats.add(new BonusStatsView(bonusStat)));
    }

    public RuneView(String name, StarGrade starGrade, BonusStatsView mainBonusStat, BonusStatsView prefixBonusStat, List<BonusStatsView> subBonusStats) {
        this.name = name;
        this.starGrade = starGrade;
        this.mainBonusStat = mainBonusStat;
        this.prefixBonusStat = prefixBonusStat;
        this.subBonusStats = subBonusStats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StarGrade getStarGrade() {
        return starGrade;
    }

    public void setStarGrade(StarGrade starGrade) {
        this.starGrade = starGrade;
    }

    public BonusStatsView getMainBonusStat() {
        return mainBonusStat;
    }

    public void setMainBonusStat(BonusStatsView mainBonusStat) {
        this.mainBonusStat = mainBonusStat;
    }

    public BonusStatsView getPrefixBonusStat() {
        return prefixBonusStat;
    }

    public void setPrefixBonusStat(BonusStatsView prefixBonusStat) {
        this.prefixBonusStat = prefixBonusStat;
    }

    public List<BonusStatsView> getSubBonusStats() {
        return subBonusStats;
    }

    public void setSubBonusStats(List<BonusStatsView> subBonusStats) {
        this.subBonusStats = subBonusStats;
    }
}
