package application.entity;

import java.util.Collections;
import java.util.List;

public class Skill {

    private String name;
    private String description;
    private String formula;
    // TODO string for debuffs or buffs with the spells
    private int slot;
    private boolean awakened;
    // TODO image
    private List<SkillLevel> skillLevelList;

    public Skill() {
        skillLevelList = Collections.EMPTY_LIST;
    }

    public Skill(String name, String description, String formula, int slot, boolean awakened, List<SkillLevel> skillLevelList) {
        this.name = name;
        this.description = description;
        this.formula = formula;
        this.slot = slot;
        this.awakened = awakened;
        this.skillLevelList = skillLevelList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public boolean isAwakened() {
        return awakened;
    }

    public void setAwakened(boolean awakened) {
        this.awakened = awakened;
    }

    public List<SkillLevel> getSkillLevelList() {
        return skillLevelList;
    }

    public void setSkillLevelList(List<SkillLevel> skillLevelList) {
        this.skillLevelList = skillLevelList;
    }
}
