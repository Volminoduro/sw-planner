package application.entity;

import application.entity.monsterWithRunes.Stat;
import application.enums.LeaderBuffContext;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
public class LeaderSkill {

    LeaderBuffContext leaderBuffContext;
    Stat statBoosted;
    int boostAmount;
}
