package application.service;

import application.view.LeaderSkillView;
import application.view.MonsterSelectionBoxView;
import application.view.MonsterView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MonsterWebServiceImpl implements MonsterWebService {

    @Autowired
    MonsterService monsterService;

    @Override
    public MonsterView getMonsterFromName(String name) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // TODO : First, check it's not already load (by name)
        // TODO : If it's already loaded, we should check the id of modification of the monster on the database to check it's the same thing
        // TODO : If the id of modification is the same : we shouldn't even sent a monster back, just a OK message telling
        // TODO : https://medium.com/@igorkosandyak/spring-boot-caching-d74591abe117
        return new MonsterView(monsterService.getMonsterFromName(name));
    }

    @Override
    // TODO : Cacheable ?
    public List<MonsterSelectionBoxView> getAllMonstersSelection() {
        List<MonsterSelectionBoxView> monsterSelectionBoxViewList = new ArrayList<>();
        // TODO : Optimization with stream ?
        monsterService.getAllMonsters().forEach(monster -> monsterSelectionBoxViewList.add(new MonsterSelectionBoxView(monster)));
        return monsterSelectionBoxViewList;
    }

    @Override
    public List<LeaderSkillView> getAllLeadersSkill(){
        return null;
    }

    @Override
    public List<MonsterView> createAllMonstersMock() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        monsterService.createMonstersMock();
        List<MonsterView> monstersView = new ArrayList<>();
        monsterService.getAllMonsters().forEach(monster -> monstersView.add(new MonsterView(monster)));
        return monstersView;
    }

}
