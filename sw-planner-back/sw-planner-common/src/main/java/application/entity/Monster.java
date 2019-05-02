package application.entity;

import application.document.MonsterDocument;
import application.enums.*;
import application.utils.StarGradeUtils;
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
    Awaken awakened;
    List<MonsterStaticStat> staticStats;
    List<MonsterEvolvingStat> evolvingStats;
    // TODO : Everything, excepts skills' logic should be saved into database
    List<Skill> skills;
    // TODO
    LeaderSkill leaderSkill;

    public Monster(MonsterDocument monsterDocument){
        this.name = monsterDocument.getName();
        this.family = monsterDocument.getFamily();
        this.attribute = monsterDocument.getAttribute();
        this.role = monsterDocument.getRole();
        this.level = new Level(CommonConstantes.MINIMAL_LEVEL_MONSTER);
        this.awakened = Awaken.UNAWAKENED;
        this.staticStats = monsterDocument.getStaticStats();
        this.evolvingStats = monsterDocument.getEvolvingStats();
        this.skills = monsterDocument.getSkills();
        this.leaderSkill = monsterDocument.getLeaderSkill();
        this.starGrade = StarGradeUtils.getStarGrade(getFirstStarGrade());
    }

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
        this.leaderSkill = monster.leaderSkill;
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
