package application.view;

import application.document.RestrictedMonsterDocument;
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
    String image;
    Integer startingStarGrade;

    public MonsterSelectionBoxView(RestrictedMonsterDocument restrictedMonsterDocument){
        this.name = restrictedMonsterDocument.getName();
        this.family = restrictedMonsterDocument.getFamily().name();
        this.attribute = restrictedMonsterDocument.getAttribute().name();
        this.role = restrictedMonsterDocument.getRole().name();
        this.image = restrictedMonsterDocument.getImage();
        this.startingStarGrade = restrictedMonsterDocument.getFirstStarGrade();
    }
}
