package application.entity.monster;

import application.entity.*;
import application.enums.*;
import application.enums.rune.MonsterRuneSlot;
import application.utils.LevelUtils;
import application.utils.StatUtils;

import java.util.List;

import static application.utils.StatUtils.*;

public class RaoqMocked extends Monster {

    public RaoqMocked(){
        this.setName("Raoq");
        this.setRole(Role.ATTACK);
        this.setAttribute(Attribute.FIRE);
        this.setFamily(Family.INUGAMI);
        this.setStarGrade(StarGrade.THREE_STARS_GRADE);
        this.setAwakened(false);
        this.setLevel(new Level(CommonConstantes.MINIMAL_LEVEL_MONSTER));
        this.setStaticStats(this.createStaticStats());
        this.setEvolvingStats(this.createEvolvingStats());
        this.setRunes(this.createRunes());
        this.setSkills(this.createSkills());
        this.setLeaderSkill(null);
    }

    private MonsterRunes createRunes() {
        // TODO
        MonsterRunes monsterRunes = new MonsterRunes();

        Rune rune = new Rune();
        rune.setMainBonusStat(new BonusStat(new Stat(EvolvingStatType.ATK, 50), false));
        rune.setName("Durable");
        rune.setPrefixBonusStat(new BonusStat(new Stat(EvolvingStatType.DEF, 5), true));
        rune.getSubBonusStats().add(new BonusStat(new Stat(EvolvingStatType.HP, 5), true));
        rune.getSubBonusStats().add(new BonusStat(new Stat(EvolvingStatType.HP, 360), false));

        monsterRunes.getRunes().put(MonsterRuneSlot.FIRST_SLOT, rune);

        rune = new Rune();
        rune.setMainBonusStat(new BonusStat(new Stat(EvolvingStatType.ATK, 15), true));
        rune.getSubBonusStats().add(new BonusStat(new Stat(StaticStatType.SPD, 5), false));
        rune.getSubBonusStats().add(new BonusStat(new Stat(EvolvingStatType.HP, 360), false));

        monsterRunes.getRunes().put(MonsterRuneSlot.FOURTH_SLOT, rune);

        return monsterRunes;
    }

    private MonsterStaticStats createStaticStats(){
        MonsterStaticStats stats = new MonsterStaticStats();

        /**
         * Unawakened stats
         */
        stats.getStaticStats().put(Awaken.UNAWAKENED, StatUtils.generateEntryForStaticStat(StaticStatType.SPD, 107));
        stats.getStaticStats().get(Awaken.UNAWAKENED).put(StaticStatType.CR, 15);
        stats.getStaticStats().get(Awaken.UNAWAKENED).put(StaticStatType.CD, 50);
        stats.getStaticStats().get(Awaken.UNAWAKENED).put(StaticStatType.RES, 15);
        stats.getStaticStats().get(Awaken.UNAWAKENED).put(StaticStatType.ACC, 0);
        /**
         * Awakened stats
         */
        stats.getStaticStats().put(Awaken.AWAKENED, StatUtils.generateEntryForStaticStat(StaticStatType.SPD, 108));
//        stats.getStaticStats().get(Awaken.AWAKENED).put(StaticStatType.CR, 15);
//        stats.getStaticStats().get(Awaken.AWAKENED).put(StaticStatType.CD, 50);
//        stats.getStaticStats().get(Awaken.AWAKENED).put(StaticStatType.RES, 15);
//        stats.getStaticStats().get(Awaken.AWAKENED).put(StaticStatType.ACC, 0);

        return stats;
    }

    private MonsterEvolvingStats createEvolvingStats(){
        MonsterEvolvingStats stats = new MonsterEvolvingStats();

        /**
         * Unawakened stats
         */
        stats.getEvolvingStats().put(StarGrade.THREE_STARS_GRADE, generateCompleteEntryForEvolvingStat(Awaken.UNAWAKENED, EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 1860));
        stats.getEvolvingStats().get(StarGrade.THREE_STARS_GRADE).get(Awaken.UNAWAKENED).get(EvolvingStatType.HP).put(LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 3345);
        stats.getEvolvingStats().get(StarGrade.THREE_STARS_GRADE).get(Awaken.UNAWAKENED).put(EvolvingStatType.ATK, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 136));
        stats.getEvolvingStats().get(StarGrade.THREE_STARS_GRADE).get(Awaken.UNAWAKENED).get(EvolvingStatType.ATK).put(LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 244);
        stats.getEvolvingStats().get(StarGrade.THREE_STARS_GRADE).get(Awaken.UNAWAKENED).put(EvolvingStatType.DEF, StatUtils.generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 104));
        stats.getEvolvingStats().get(StarGrade.THREE_STARS_GRADE).get(Awaken.UNAWAKENED).get(EvolvingStatType.DEF).put(LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 188);

        stats.getEvolvingStats().put(StarGrade.FOUR_STARS_GRADE, generateCompleteEntryForEvolvingStat(Awaken.UNAWAKENED, EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 2670));
        stats.getEvolvingStats().get(StarGrade.FOUR_STARS_GRADE).get(Awaken.UNAWAKENED).get(EvolvingStatType.HP).put(LevelUtils.getMaxLevelPossible(StarGrade.FOUR_STARS_GRADE), 4545);
        stats.getEvolvingStats().get(StarGrade.FOUR_STARS_GRADE).get(Awaken.UNAWAKENED).put(EvolvingStatType.ATK, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 196));
        stats.getEvolvingStats().get(StarGrade.FOUR_STARS_GRADE).get(Awaken.UNAWAKENED).get(EvolvingStatType.ATK).put(LevelUtils.getMaxLevelPossible(StarGrade.FOUR_STARS_GRADE), 333);
        stats.getEvolvingStats().get(StarGrade.FOUR_STARS_GRADE).get(Awaken.UNAWAKENED).put(EvolvingStatType.DEF, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 150));
        stats.getEvolvingStats().get(StarGrade.FOUR_STARS_GRADE).get(Awaken.UNAWAKENED).get(EvolvingStatType.DEF).put(LevelUtils.getMaxLevelPossible(StarGrade.FOUR_STARS_GRADE), 255);

        stats.getEvolvingStats().put(StarGrade.FIVE_STARS_GRADE, generateCompleteEntryForEvolvingStat(Awaken.UNAWAKENED, EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 3630));
        stats.getEvolvingStats().get(StarGrade.FIVE_STARS_GRADE).get(Awaken.UNAWAKENED).get(EvolvingStatType.HP).put(LevelUtils.getMaxLevelPossible(StarGrade.FIVE_STARS_GRADE), 6180);
        stats.getEvolvingStats().get(StarGrade.FIVE_STARS_GRADE).get(Awaken.UNAWAKENED).put(EvolvingStatType.ATK, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 266));
        stats.getEvolvingStats().get(StarGrade.FIVE_STARS_GRADE).get(Awaken.UNAWAKENED).get(EvolvingStatType.ATK).put(LevelUtils.getMaxLevelPossible(StarGrade.FIVE_STARS_GRADE), 452);
        stats.getEvolvingStats().get(StarGrade.FIVE_STARS_GRADE).get(Awaken.UNAWAKENED).put(EvolvingStatType.DEF, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 204));
        stats.getEvolvingStats().get(StarGrade.FIVE_STARS_GRADE).get(Awaken.UNAWAKENED).get(EvolvingStatType.DEF).put(LevelUtils.getMaxLevelPossible(StarGrade.FIVE_STARS_GRADE), 347);

        stats.getEvolvingStats().put(StarGrade.SIX_STARS_GRADE, generateCompleteEntryForEvolvingStat(Awaken.UNAWAKENED, EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 4935));
        stats.getEvolvingStats().get(StarGrade.SIX_STARS_GRADE).get(Awaken.UNAWAKENED).get(EvolvingStatType.HP).put(LevelUtils.getMaxLevelPossible(StarGrade.SIX_STARS_GRADE), 8400);
        stats.getEvolvingStats().get(StarGrade.SIX_STARS_GRADE).get(Awaken.UNAWAKENED).put(EvolvingStatType.ATK, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 362));
        stats.getEvolvingStats().get(StarGrade.SIX_STARS_GRADE).get(Awaken.UNAWAKENED).get(EvolvingStatType.ATK).put(LevelUtils.getMaxLevelPossible(StarGrade.SIX_STARS_GRADE), 615);
        stats.getEvolvingStats().get(StarGrade.SIX_STARS_GRADE).get(Awaken.UNAWAKENED).put(EvolvingStatType.DEF, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 278));
        stats.getEvolvingStats().get(StarGrade.SIX_STARS_GRADE).get(Awaken.UNAWAKENED).get(EvolvingStatType.DEF).put(LevelUtils.getMaxLevelPossible(StarGrade.SIX_STARS_GRADE), 472);

        /**
         * Awakened stats
         */
        stats.getEvolvingStats().get(StarGrade.THREE_STARS_GRADE).put(Awaken.AWAKENED, generatePartialEntryForEvolvingStat(EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 1995));
        stats.getEvolvingStats().get(StarGrade.THREE_STARS_GRADE).get(Awaken.AWAKENED).get(EvolvingStatType.HP).put(LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 3600);
        stats.getEvolvingStats().get(StarGrade.THREE_STARS_GRADE).get(Awaken.AWAKENED).put(EvolvingStatType.ATK, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 150));
        stats.getEvolvingStats().get(StarGrade.THREE_STARS_GRADE).get(Awaken.AWAKENED).get(EvolvingStatType.ATK).put(LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 271);
        stats.getEvolvingStats().get(StarGrade.THREE_STARS_GRADE).get(Awaken.AWAKENED).put(EvolvingStatType.DEF, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 116));
        stats.getEvolvingStats().get(StarGrade.THREE_STARS_GRADE).get(Awaken.AWAKENED).get(EvolvingStatType.DEF).put(LevelUtils.getMaxLevelPossible(StarGrade.THREE_STARS_GRADE), 209);

        stats.getEvolvingStats().get(StarGrade.FOUR_STARS_GRADE).put(Awaken.AWAKENED, generatePartialEntryForEvolvingStat(EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 2880));
        stats.getEvolvingStats().get(StarGrade.FOUR_STARS_GRADE).get(Awaken.AWAKENED).get(EvolvingStatType.HP).put(LevelUtils.getMaxLevelPossible(StarGrade.FOUR_STARS_GRADE), 4905);
        stats.getEvolvingStats().get(StarGrade.FOUR_STARS_GRADE).get(Awaken.AWAKENED).put(EvolvingStatType.ATK, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 216));
        stats.getEvolvingStats().get(StarGrade.FOUR_STARS_GRADE).get(Awaken.AWAKENED).get(EvolvingStatType.ATK).put(LevelUtils.getMaxLevelPossible(StarGrade.FOUR_STARS_GRADE), 368);
        stats.getEvolvingStats().get(StarGrade.FOUR_STARS_GRADE).get(Awaken.AWAKENED).put(EvolvingStatType.DEF, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 168));
        stats.getEvolvingStats().get(StarGrade.FOUR_STARS_GRADE).get(Awaken.AWAKENED).get(EvolvingStatType.DEF).put(LevelUtils.getMaxLevelPossible(StarGrade.FOUR_STARS_GRADE), 285);

        stats.getEvolvingStats().get(StarGrade.FIVE_STARS_GRADE).put(Awaken.AWAKENED, generatePartialEntryForEvolvingStat(EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 3915));
        stats.getEvolvingStats().get(StarGrade.FIVE_STARS_GRADE).get(Awaken.AWAKENED).get(EvolvingStatType.HP).put(LevelUtils.getMaxLevelPossible(StarGrade.FIVE_STARS_GRADE), 6660);
        stats.getEvolvingStats().get(StarGrade.FIVE_STARS_GRADE).get(Awaken.AWAKENED).put(EvolvingStatType.ATK, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 295));
        stats.getEvolvingStats().get(StarGrade.FIVE_STARS_GRADE).get(Awaken.AWAKENED).get(EvolvingStatType.ATK).put(LevelUtils.getMaxLevelPossible(StarGrade.FIVE_STARS_GRADE), 500);
        stats.getEvolvingStats().get(StarGrade.FIVE_STARS_GRADE).get(Awaken.AWAKENED).put(EvolvingStatType.DEF, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 228));
        stats.getEvolvingStats().get(StarGrade.FIVE_STARS_GRADE).get(Awaken.AWAKENED).get(EvolvingStatType.DEF).put(LevelUtils.getMaxLevelPossible(StarGrade.FIVE_STARS_GRADE), 387);

        stats.getEvolvingStats().get(StarGrade.SIX_STARS_GRADE).put(Awaken.AWAKENED, generatePartialEntryForEvolvingStat(EvolvingStatType.HP, CommonConstantes.MINIMAL_LEVEL_MONSTER, 5325));
        stats.getEvolvingStats().get(StarGrade.SIX_STARS_GRADE).get(Awaken.AWAKENED).get(EvolvingStatType.HP).put(LevelUtils.getMaxLevelPossible(StarGrade.SIX_STARS_GRADE), 9060);
        stats.getEvolvingStats().get(StarGrade.SIX_STARS_GRADE).get(Awaken.AWAKENED).put(EvolvingStatType.ATK, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 400));
        stats.getEvolvingStats().get(StarGrade.SIX_STARS_GRADE).get(Awaken.AWAKENED).get(EvolvingStatType.ATK).put(LevelUtils.getMaxLevelPossible(StarGrade.SIX_STARS_GRADE), 681);
        stats.getEvolvingStats().get(StarGrade.SIX_STARS_GRADE).get(Awaken.AWAKENED).put(EvolvingStatType.DEF, generateVeryPartialEntryForEvolvingStat(CommonConstantes.MINIMAL_LEVEL_MONSTER, 310));
        stats.getEvolvingStats().get(StarGrade.SIX_STARS_GRADE).get(Awaken.AWAKENED).get(EvolvingStatType.DEF).put(LevelUtils.getMaxLevelPossible(StarGrade.SIX_STARS_GRADE), 527);

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
