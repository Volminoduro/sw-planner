package application.mapper;

import application.view.MonsterView;
import entity.Monster;

public abstract class MonsterToMonsterViewMapper {

    public static MonsterView map(Monster monster){
        return new MonsterView(monster.getName(),
                monster.getFamily().name(),
                monster.getAttribute().name(),
                monster.getRole().name(),
                monster.getStarGrade().getValue(),
                monster.getLevel().getLevel(),
                monster.isAwakened(),
                MonsterStatToMonsterStatViewMapper.map(monster.getStaticStats()),
                MonsterStatToMonsterStatViewMapper.map(monster.getEvolvingStats()),
                MonsterRuneToMonsterRuneViewMap.map(monster.getRunes().getRunes()),
                MonsterSkillToMonsterSkillViewMapper.map(monster.getSkills()),
                monster.getLeaderSkill());
    }
}
