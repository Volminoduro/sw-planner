package application.entity.concreteMonster.inugami;

import application.entity.*;
import application.enums.*;
import application.utils.LevelUtils;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "monster")
public class RaoqMock extends Monster {

    public RaoqMock(){
        this.setName("Raoq");
        this.setRole(Role.ATTACK);
        this.setAttribute(Attribute.FIRE);
        this.setFamily(Family.inugami);
        this.setStarGrade(StarGrade.THREE_STARS_GRADE);
        this.setAwakened(false);
        this.setLevel(new Level(CommonConstantes.MINIMAL_LEVEL_MONSTER));
        this.setStaticStats(this.createStaticStats());
        this.setEvolvingStats(this.createEvolvingStats());
        // TODO
        this.setSkills(this.createSkills());
        this.setLeaderSkill(null);
    }

    private List<MonsterStaticStat> createStaticStats(){
        List<MonsterStaticStat> stats = new ArrayList<>();

        stats.add(new MonsterStaticStat(Awaken.UNAWAKENED.getValue(), StaticStatType.SPD, 107));
        stats.add(new MonsterStaticStat(Awaken.UNAWAKENED.getValue(), StaticStatType.CR, 15));
        stats.add(new MonsterStaticStat(Awaken.UNAWAKENED.getValue(), StaticStatType.CD, 50));
        stats.add(new MonsterStaticStat(Awaken.UNAWAKENED.getValue(), StaticStatType.RES, 15));
        stats.add(new MonsterStaticStat(Awaken.UNAWAKENED.getValue(), StaticStatType.ACC, 0));

        stats.add(new MonsterStaticStat(Awaken.AWAKENED.getValue(), StaticStatType.SPD, 108));

        return stats;
    }

    private List<MonsterEvolvingStat> createEvolvingStats(){
        List<MonsterEvolvingStat> stats = new ArrayList<>();

        stats.add(new MonsterEvolvingStat(StarGrade.THREE_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 1860));
        stats.add(new MonsterEvolvingStat(StarGrade.THREE_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE).getLevel(), 3345));
        stats.add(new MonsterEvolvingStat(StarGrade.THREE_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 136));
        stats.add(new MonsterEvolvingStat(StarGrade.THREE_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE).getLevel(), 244));
        stats.add(new MonsterEvolvingStat(StarGrade.THREE_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 104));
        stats.add(new MonsterEvolvingStat(StarGrade.THREE_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE).getLevel(), 188));

        stats.add(new MonsterEvolvingStat(StarGrade.FOUR_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 2670));
        stats.add(new MonsterEvolvingStat(StarGrade.FOUR_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.FOUR_STARS_GRADE).getLevel(), 4545));
        stats.add(new MonsterEvolvingStat(StarGrade.FOUR_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 196));
        stats.add(new MonsterEvolvingStat(StarGrade.FOUR_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.FOUR_STARS_GRADE).getLevel(), 333));
        stats.add(new MonsterEvolvingStat(StarGrade.FOUR_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 150));
        stats.add(new MonsterEvolvingStat(StarGrade.FOUR_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.FOUR_STARS_GRADE).getLevel(), 255));

        stats.add(new MonsterEvolvingStat(StarGrade.FIVE_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 3630));
        stats.add(new MonsterEvolvingStat(StarGrade.FIVE_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.FIVE_STARS_GRADE).getLevel(), 6180));
        stats.add(new MonsterEvolvingStat(StarGrade.FIVE_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 266));
        stats.add(new MonsterEvolvingStat(StarGrade.FIVE_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.FIVE_STARS_GRADE).getLevel(), 452));
        stats.add(new MonsterEvolvingStat(StarGrade.FIVE_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 204));
        stats.add(new MonsterEvolvingStat(StarGrade.FIVE_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.FIVE_STARS_GRADE).getLevel(), 347));

        stats.add(new MonsterEvolvingStat(StarGrade.SIX_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 4935));
        stats.add(new MonsterEvolvingStat(StarGrade.SIX_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.SIX_STARS_GRADE).getLevel(), 8400));
        stats.add(new MonsterEvolvingStat(StarGrade.SIX_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 362));
        stats.add(new MonsterEvolvingStat(StarGrade.SIX_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.SIX_STARS_GRADE).getLevel(), 615));
        stats.add(new MonsterEvolvingStat(StarGrade.SIX_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 278));
        stats.add(new MonsterEvolvingStat(StarGrade.SIX_STARS_GRADE.getValue(), Awaken.UNAWAKENED.getValue(), EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.SIX_STARS_GRADE).getLevel(), 472));


        stats.add(new MonsterEvolvingStat(StarGrade.THREE_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 1995));
        stats.add(new MonsterEvolvingStat(StarGrade.THREE_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE).getLevel(), 3600));
        stats.add(new MonsterEvolvingStat(StarGrade.THREE_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 150));
        stats.add(new MonsterEvolvingStat(StarGrade.THREE_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE).getLevel(), 271));
        stats.add(new MonsterEvolvingStat(StarGrade.THREE_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 116));
        stats.add(new MonsterEvolvingStat(StarGrade.THREE_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE).getLevel(), 209));

        stats.add(new MonsterEvolvingStat(StarGrade.FOUR_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 2880));
        stats.add(new MonsterEvolvingStat(StarGrade.FOUR_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.FOUR_STARS_GRADE).getLevel(), 4905));
        stats.add(new MonsterEvolvingStat(StarGrade.FOUR_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 216));
        stats.add(new MonsterEvolvingStat(StarGrade.FOUR_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.FOUR_STARS_GRADE).getLevel(), 368));
        stats.add(new MonsterEvolvingStat(StarGrade.FOUR_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 168));
        stats.add(new MonsterEvolvingStat(StarGrade.FOUR_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.FOUR_STARS_GRADE).getLevel(), 285));

        stats.add(new MonsterEvolvingStat(StarGrade.FIVE_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 3915));
        stats.add(new MonsterEvolvingStat(StarGrade.FIVE_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.FIVE_STARS_GRADE).getLevel(), 6660));
        stats.add(new MonsterEvolvingStat(StarGrade.FIVE_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 295));
        stats.add(new MonsterEvolvingStat(StarGrade.FIVE_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.FIVE_STARS_GRADE).getLevel(), 500));
        stats.add(new MonsterEvolvingStat(StarGrade.FIVE_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 228));
        stats.add(new MonsterEvolvingStat(StarGrade.FIVE_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.FIVE_STARS_GRADE).getLevel(), 387));

        stats.add(new MonsterEvolvingStat(StarGrade.SIX_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 5325));
        stats.add(new MonsterEvolvingStat(StarGrade.SIX_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.SIX_STARS_GRADE).getLevel(), 9060));
        stats.add(new MonsterEvolvingStat(StarGrade.SIX_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 400));
        stats.add(new MonsterEvolvingStat(StarGrade.SIX_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.SIX_STARS_GRADE).getLevel(), 681));
        stats.add(new MonsterEvolvingStat(StarGrade.SIX_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 310));
        stats.add(new MonsterEvolvingStat(StarGrade.SIX_STARS_GRADE.getValue(), Awaken.AWAKENED.getValue(), EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.SIX_STARS_GRADE).getLevel(), 527));

        return stats;
    }

    private List<Skill> createSkills(){
        return null;
    }

    @Override
    public int compareTo(Monster o) {
        return 0;
    }


}
