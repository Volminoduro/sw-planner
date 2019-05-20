package application.mapper;

import application.entity.Skill;
import application.view.SkillView;

import java.util.ArrayList;
import java.util.List;

public abstract class MonsterSkillToMonsterSkillViewMapper {

    // TODO
    public static List<SkillView> map(List<Skill> skills){
        List<SkillView> skillsViews = new ArrayList<>();
        skills.stream().forEach(skill -> skillsViews.add(new SkillView(skill)));
        return skillsViews;
    }
}
