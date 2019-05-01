package application.entity;

import application.enums.SkillLevelBonus;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
public class SkillLevel {

    int skillLevel;
    SkillLevelBonus skillLevelBonus;
    int skillLevelBonusAmount;
}
