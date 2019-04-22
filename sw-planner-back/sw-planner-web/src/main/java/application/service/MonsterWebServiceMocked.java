package application.service;

import application.mapper.MonsterToMonsterViewMapper;
import application.view.LeaderSkillView;
import application.view.MonsterComboBoxView;
import application.view.MonsterView;
import entity.Monster;
import enums.Attribute;
import enums.Family;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonsterWebServiceMocked implements MonsterWebService {

    MonsterService monsterService = new MonsterServiceMocked();

    @Override
    public MonsterView getMonsterFromName(String name) {
        return MonsterToMonsterViewMapper.map(monsterService.getMonsterFromName(name));
    }

    @Override
    public List<MonsterComboBoxView> getAllMonstersName() {
        return null;
    }

    @Override
    public List<LeaderSkillView> getAllLeadersSkill(){
        return null;
    }

    @Override
    public Monster getMonsterFromFamilyAndAttribute(Family family, Attribute attribute) {
        return null;
    }
}
