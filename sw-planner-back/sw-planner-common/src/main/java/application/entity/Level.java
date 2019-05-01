package application.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
public class Level {

    int level;

    public Level(int level) {
        // TODO : Check limits and throw Exception in case
        this.level = level;
    }
}
