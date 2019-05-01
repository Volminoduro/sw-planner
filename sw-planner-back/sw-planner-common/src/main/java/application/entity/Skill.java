package application.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Collections;
import java.util.List;

@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
public class Skill {

    String name;
    String description;
    String formula;
    // TODO string for debuffs or buffs with the spells
    int slot;
    boolean awakened;
    int cooldown;
    // TODO image
    List<SkillLevel> skillLevelList;

    public Skill() {
        skillLevelList = Collections.EMPTY_LIST;
    }

}
