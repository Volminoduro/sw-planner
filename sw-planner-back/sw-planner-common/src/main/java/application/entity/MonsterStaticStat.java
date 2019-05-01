package application.entity;

import application.enums.StaticStatType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
public class MonsterStaticStat {

    boolean awaken;
    StaticStatType staticStatType;
    int amount;
}
