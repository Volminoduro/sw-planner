package application.view;

import application.entity.Monster;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
public class MonsterSelectionBoxView {

    String name;
    String family;
    String attribute;
    String role;
    // TODO image
    Integer startingStarGrade;

    public MonsterSelectionBoxView(Monster monster){
        this.name = monster.getName();
        this.family = monster.getFamily().name();
        this.attribute = monster.getAttribute().name();
        this.role = monster.getRole().name();
        this.startingStarGrade = monster.getFirstStarGrade();
    }
}
