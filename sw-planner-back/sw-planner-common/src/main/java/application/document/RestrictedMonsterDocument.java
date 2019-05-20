package application.document;

import application.entity.MonsterEvolvingStat;
import application.enums.Attribute;
import application.enums.Family;
import application.enums.Role;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.TreeSet;

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
    // TODO : Optimize to get only the firstStarGrade from evolvingStats
    List<MonsterEvolvingStat> evolvingStats;

    public int getFirstStarGrade(){
        // TODO : Check its in boudaries, unless throw exception
        TreeSet<Integer> allStarsGrade = new TreeSet<>();
        this.evolvingStats.forEach(evolvingStat -> allStarsGrade.add(evolvingStat.getStarGrade()));
        return allStarsGrade.first();
    }
}