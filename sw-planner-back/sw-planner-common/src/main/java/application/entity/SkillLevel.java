package application.entity;

public class SkillLevel {

    private int skillLevel;
    private SkillLevelBonus skillLevelBonus;
    private int skillLevelBonusAmount;

    public SkillLevel(int skillLevel, SkillLevelBonus skillLevelBonus, int skillLevelBonusAmount) {
        this.skillLevel = skillLevel;
        this.skillLevelBonus = skillLevelBonus;
        this.skillLevelBonusAmount = skillLevelBonusAmount;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public SkillLevelBonus getSkillLevelBonus() {
        return skillLevelBonus;
    }

    public void setSkillLevelBonus(SkillLevelBonus skillLevelBonus) {
        this.skillLevelBonus = skillLevelBonus;
    }

    public int getSkillLevelBonusAmount() {
        return skillLevelBonusAmount;
    }

    public void setSkillLevelBonusAmount(int skillLevelBonusAmount) {
        this.skillLevelBonusAmount = skillLevelBonusAmount;
    }
}
