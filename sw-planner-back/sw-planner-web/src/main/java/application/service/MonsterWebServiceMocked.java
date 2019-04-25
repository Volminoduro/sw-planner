package application.service;

import application.entity.concreteMonster.inugami.RaoqMocked;
import application.mapper.MonsterToMonsterViewMapper;
import application.view.LeaderSkillView;
import application.view.MonsterComboBoxView;
import application.view.MonsterView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonsterWebServiceMocked implements MonsterWebService {

    @Autowired
    MonsterService monsterService;

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
    public MonsterView createRaoqMock(){
        monsterService.createMonsterMock(new RaoqMocked());
        return this.getMonsterFromName("Raoq");
    }

}
