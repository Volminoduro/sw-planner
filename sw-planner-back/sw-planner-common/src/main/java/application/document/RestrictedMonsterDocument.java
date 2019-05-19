package application.document;

import application.enums.Attribute;
import application.enums.Family;
import application.enums.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "monster")
@FieldDefaults(level= AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
public class RestrictedMonsterDocument {

    @Id
    String name;
    Family family;
    Attribute attribute;
    Role role;
    String image;
    int firstStarGrade;
}
