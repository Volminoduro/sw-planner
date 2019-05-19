package application.view;

import application.entity.Skill;
import application.entity.SkillLevel;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
public class SkillView {

    String name;
    String description;
    String formula;
    String image;
    // TODO string for debuffs or buffs with the spells
    int slot;
    boolean awakened;
    int cooldown;
    List<SkillLevel> skillLevelList;

    public SkillView(Skill skill){
        this.name = skill.getName();
        this.description = skill.getDescription();
        this.formula = skill.getFormula();
        this.image = skill.getImage();
        this.slot = skill.getSlot();
        this.awakened = skill.isAwakened();
        this.cooldown = skill.getCooldown();
        this.skillLevelList = skill.getSkillLevelList();
    }
}
