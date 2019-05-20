package application.entity.mockMonster;

import application.document.MonsterDocument;
import application.document.MonsterMockDocument;
import application.entity.*;
import application.enums.*;
import application.utils.LevelUtils;

import java.util.ArrayList;
import java.util.List;

public class RaoqMock extends MonsterMockDocument {

    public RaoqMock(){
        this.setName("Raoq");
        this.setRole(Role.ATTACK);
        this.setAttribute(Attribute.FIRE);
        this.setFamily(Family.inugami);
        this.setStaticStats(this.createStaticStats());
        this.setEvolvingStats(this.createEvolvingStats());
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
        List<Skill> skills = new ArrayList<>();

        List<SkillLevel> skillLevels = new ArrayList<>();
        ActiveSkill firstSkill = new ActiveSkill(){

            @Override
            public void execute(){
                // What is supposed to do
            }
        };
        firstSkill.setName("Scratch");
        firstSkill.setAwakened(false);
        firstSkill.setFormula("370% ATK");
        firstSkill.setCooldown(1);
        firstSkill.setDescription("Attacks the enemy with razor-sharp claws and decreases their Defense for 2 turns with a 50% chance.");
        skillLevels.add(new SkillLevel(2, SkillLevelBonus.DAMAGE, 10));
        skillLevels.add(new SkillLevel(3, SkillLevelBonus.DAMAGE, 10));
        skillLevels.add(new SkillLevel(4, SkillLevelBonus.HARMFUL_EFFECT_RATE, 10));
        firstSkill.setSkillLevelList(skillLevels);

        skills.add(firstSkill);

        skillLevels = new ArrayList<>();
        ActiveSkill secondSkill = new ActiveSkill(){

            @Override
            public void execute(){
                // What is supposed to do
            }
        };
        secondSkill.setName("Scratch");
        secondSkill.setAwakened(true);
        secondSkill.setFormula("370% ATK xN");
        secondSkill.setCooldown(1);
        secondSkill.setDescription("Attacks the enemy with razor-sharp claws and decreases their Defense for 2 turns with a 50% chance and attacks consecutively with a 30% chance.");
        skillLevels.add(new SkillLevel(2, SkillLevelBonus.DAMAGE, 10));
        skillLevels.add(new SkillLevel(3, SkillLevelBonus.DAMAGE, 10));
        skillLevels.add(new SkillLevel(4, SkillLevelBonus.DAMAGE, 10));
        skillLevels.add(new SkillLevel(5, SkillLevelBonus.HARMFUL_EFFECT_RATE, 10));
        skillLevels.add(new SkillLevel(6, SkillLevelBonus.HARMFUL_EFFECT_RATE, 10));
        secondSkill.setSkillLevelList(skillLevels);

        skills.add(secondSkill);

        skillLevels = new ArrayList<>();
        ActiveSkill thirdSkill = new ActiveSkill(){

            @Override
            public void execute(){
                // What is supposed to do
            }
        };
        thirdSkill.setName("Team up");
        thirdSkill.setAwakened(false);
        thirdSkill.setFormula("370% ATK +?");
        thirdSkill.setCooldown(4);
        thirdSkill.setDescription("Teams up with another ally to attack an enemy.");
        skillLevels.add(new SkillLevel(2, SkillLevelBonus.COOLDOWN_REDUCTION, 1));
        thirdSkill.setSkillLevelList(skillLevels);

        skills.add(thirdSkill);

        PassiveSkill fourthSkill = new PassiveSkill();
        fourthSkill.setName("Annihilate");
        fourthSkill.setAwakened(false);
        fourthSkill.setFormula("");
        fourthSkill.setDescription("Get an extra turn if you kill the enemy.");

        skills.add(fourthSkill);

        return skills;
    }

}
