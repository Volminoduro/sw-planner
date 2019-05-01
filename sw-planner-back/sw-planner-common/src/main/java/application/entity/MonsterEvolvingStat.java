package application.entity;

import application.enums.EvolvingStatType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
public class MonsterEvolvingStat {

    int starGrade;
    boolean awaken;
    EvolvingStatType evolvingStatType;
    int level;
    int amount;
}
