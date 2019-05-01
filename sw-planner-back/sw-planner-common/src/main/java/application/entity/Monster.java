package application.entity;

import application.enums.Attribute;
import application.enums.Family;
import application.enums.Role;
import application.enums.StarGrade;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.TreeSet;

@Document(collection = "monster")
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
public class Monster implements Comparable<Monster> {

    // TODO : lazy loading not working

    @Id
    String name;
    Family family;
    Attribute attribute;
    Role role;
    StarGrade starGrade;
    Level level;
    Boolean awakened;
    List<MonsterStaticStat> staticStats;
    List<MonsterEvolvingStat> evolvingStats;
    // TODO : Everything, excepts skills' logic should be saved into database
    List<Skill> skills;
    // TODO
    LeaderSkill leaderSkill;

    public Monster(Monster monster) {
        this.name = monster.name;
        this.family = monster.family;
        this.attribute = monster.attribute;
        this.role = monster.role;
        this.starGrade = monster.starGrade;
        this.level = monster.level;
        this.awakened = monster.awakened;
        this.staticStats = monster.staticStats;
        this.evolvingStats = monster.evolvingStats;
        this.skills = monster.skills;
    }

    public int getFirstStarGrade(){
        // TODO : Check its in boudaries, unless throw exception
        TreeSet<Integer> allStarsGrade = new TreeSet<>();
        this.evolvingStats.forEach(evolvingStat -> allStarsGrade.add(evolvingStat.getStarGrade()));
        return allStarsGrade.first();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monster)) return false;
        Monster monster = (Monster) o;
        return (this.family.equals(monster.family) && this.attribute.equals(monster.attribute)) || this.name.equals(monster.name);
    }

    @Override
    public int compareTo(@NotNull Monster o) {
        return 0;
    }
}
