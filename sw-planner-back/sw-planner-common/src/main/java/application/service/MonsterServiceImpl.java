package application.service;

import application.dao.MonsterRepository;
import application.entity.Monster;
import application.entity.concreteMonster.inugami.RaoqMock;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Service
public class MonsterServiceImpl implements MonsterService {

    @Autowired
    MonsterRepository monsterRepository;

    public Monster getMonsterFromName(@NotNull String name) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Monster monster = monsterRepository.findByName(name);
        monster = (Monster) Class.forName("application.entity.concreteMonster."+monster.getFamily()+"."+name).getConstructor(Monster.class).newInstance(monster);
        // TODO : Implements skills logic (as sw-planner-common should be a library usable elsewhere)
        return monster;
    }

    @Override
    @Transactional
    public void createMonsterMock(String name){
        // TODO : Use monster name to inspect classes in order to create it
//        Monster monster = (Monster) Class.forName("application.entity.concreteMonster."+monster.getFamily()+"."+name).getConstructor().newInstance(monster);

        Monster monster = new RaoqMock();
        monsterRepository.delete(monster);
        monsterRepository.save(monster);
    }

    @Override
    public List<Monster> getAllMonstersSelection(){
        return monsterRepository.findAll();
    }

}
