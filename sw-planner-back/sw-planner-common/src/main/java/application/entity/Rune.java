package application.entity;

import application.enums.StarGrade;

import java.util.ArrayList;
import java.util.List;

public class Rune {

    private String name;
    private StarGrade starGrade;
    private BonusStat mainBonusStat;
    private BonusStat prefixBonusStat;
    // TODO : RuneSet
    private List<BonusStat> subBonusStats;

    // TODO : A getRarity method to calculate quality of rune depending of the number of subBonusStats

    public Rune() {
        this.subBonusStats = new ArrayList<>();
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

    public BonusStat getMainBonusStat() {
        return mainBonusStat;
    }

    public void setMainBonusStat(BonusStat mainBonusStat) {
        this.mainBonusStat = mainBonusStat;
    }

    public BonusStat getPrefixBonusStat() {
        return prefixBonusStat;
    }

    public void setPrefixBonusStat(BonusStat prefixBonusStat) {
        this.prefixBonusStat = prefixBonusStat;
    }

    public List<BonusStat> getSubBonusStats() {
        return subBonusStats;
    }

    public void setSubBonusStats(List<BonusStat> subBonusStats) {
        this.subBonusStats = subBonusStats;
    }
}
