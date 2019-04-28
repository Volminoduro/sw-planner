package application.mapper;

import application.entity.Monster;
import application.view.MonsterView;

public abstract class MonsterToMonsterViewMapper {

    public static MonsterView map(Monster monster){
        return new MonsterView(monster.getName(),
                monster.getFamily().name(),
                monster.getAttribute().name(),
                monster.getRole().name(),
                monster.getStaticStats(),
                monster.getEvolvingStats(),
                MonsterSkillToMonsterSkillViewMapper.map(monster.getSkills()),
                monster.getLeaderSkill());
    }
}
