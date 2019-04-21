package entity.monster;

import entity.Level;
import entity.Monster;
import entity.Skill;
import enums.*;
import utils.LevelUtils;
import utils.StatUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class RaoqMocked extends Monster {

    public RaoqMocked(){
        this.setName("Raoq");
        this.setRole(Role.ATTACK);
        this.setAttribute(Attribute.FIRE);
        this.setFamily(Family.INUGAMI);
        this.setAwakened(false);
        this.setLevel(new Level(CommonConstantes.MINIMAL_LEVEL_MONSTER));
        this.setStaticStats(this.createStaticStats());
        this.setEvolvingStats(this.createEvolvingStats());
        this.setSkills(this.createSkills());
        this.setLeaderSkill(null);
    }

    private SortedMap<StaticStatType, HashMap<Boolean, Integer>> createStaticStats(){
        SortedMap<StaticStatType, HashMap<Boolean, Integer>> stats = new TreeMap<>();

        // TODO : Optimization to not duplicate entries with same value
        /**
         * Unawakened stats
         */
        stats.put(StaticStatType.SPD, StatUtils.generateEntryForStaticStat(false, 107));
        stats.put(StaticStatType.CR, StatUtils.generateEntryForStaticStat(false, 15));
        stats.put(StaticStatType.CD, StatUtils.generateEntryForStaticStat(false, 50));
        stats.put(StaticStatType.RES, StatUtils.generateEntryForStaticStat(false, 15));
        stats.put(StaticStatType.ACC, StatUtils.generateEntryForStaticStat(false, 0));
        /**
         * Awakened stats
         */
        stats.put(StaticStatType.SPD, StatUtils.generateEntryForStaticStat(false, 108));
        stats.put(StaticStatType.CR, StatUtils.generateEntryForStaticStat(false, 15));
        stats.put(StaticStatType.CD, StatUtils.generateEntryForStaticStat(false, 50));
        stats.put(StaticStatType.RES, StatUtils.generateEntryForStaticStat(false, 15));
        stats.put(StaticStatType.ACC, StatUtils.generateEntryForStaticStat(false, 0));

        return stats;
    }

    private SortedMap<StarGrade, HashMap<Boolean, HashMap<EvolvingStatType, HashMap<Level, Integer>>>> createEvolvingStats(){
        SortedMap<StarGrade, HashMap<Boolean, HashMap<EvolvingStatType, HashMap<Level, Integer>>>> stats = new TreeMap<>();

        /**
         * Unawakened stats
         */
        stats.put(StarGrade.THREE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 1860));
        stats.put(StarGrade.THREE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 3345));
        stats.put(StarGrade.THREE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 136));
        stats.put(StarGrade.THREE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 244));
        stats.put(StarGrade.THREE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 104));
        stats.put(StarGrade.THREE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 188));

        stats.put(StarGrade.FOUR_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 2670));
        stats.put(StarGrade.FOUR_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 4545));
        stats.put(StarGrade.FOUR_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 196));
        stats.put(StarGrade.FOUR_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 333));
        stats.put(StarGrade.FOUR_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 150));
        stats.put(StarGrade.FOUR_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 255));

        stats.put(StarGrade.FIVE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 3630));
        stats.put(StarGrade.FIVE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 6180));
        stats.put(StarGrade.FIVE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 266));
        stats.put(StarGrade.FIVE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 452));
        stats.put(StarGrade.FIVE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 204));
        stats.put(StarGrade.FIVE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 347));

        stats.put(StarGrade.SIX_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 4935));
        stats.put(StarGrade.SIX_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 8400));
        stats.put(StarGrade.SIX_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 362));
        stats.put(StarGrade.SIX_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 615));
        stats.put(StarGrade.SIX_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 178));
        stats.put(StarGrade.SIX_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 472));

        /**
         * Awakened stats
         */
        stats.put(StarGrade.THREE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 1995));
        stats.put(StarGrade.THREE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 3600));
        stats.put(StarGrade.THREE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 150));
        stats.put(StarGrade.THREE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 271));
        stats.put(StarGrade.THREE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 116));
        stats.put(StarGrade.THREE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 209));

        stats.put(StarGrade.FOUR_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 2880));
        stats.put(StarGrade.FOUR_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 4905));
        stats.put(StarGrade.FOUR_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 216));
        stats.put(StarGrade.FOUR_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 368));
        stats.put(StarGrade.FOUR_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 209));
        stats.put(StarGrade.FOUR_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 168));

        stats.put(StarGrade.FIVE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 3915));
        stats.put(StarGrade.FIVE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 6660));
        stats.put(StarGrade.FIVE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 295));
        stats.put(StarGrade.FIVE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 500));
        stats.put(StarGrade.FIVE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 228));
        stats.put(StarGrade.FIVE_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 387));

        stats.put(StarGrade.SIX_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 5325));
        stats.put(StarGrade.SIX_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.HP, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 9060));
        stats.put(StarGrade.SIX_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, CommonConstantes.MINIMAL_LEVEL_MONSTER, 400));
        stats.put(StarGrade.SIX_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.ATK, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 681));
        stats.put(StarGrade.SIX_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, CommonConstantes.MINIMAL_LEVEL_MONSTER, 310));
        stats.put(StarGrade.SIX_STARS_GRADE, StatUtils.generateEntryForEvolvingStat(false, EvolvingStatType.DEF, LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 527));

        return stats;
    }

    private Collection<Skill> createSkills(){
        return null;
    }

    @Override
    public int compareTo(Monster o) {
        return 0;
    }


}
