package application.service;

import application.dao.MonsterRepository;
import application.entity.Monster;
import application.utils.ClassesUtils;
import ch.qos.logback.core.joran.action.Action;
import org.jetbrains.annotations.NotNull;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
    public void createMonstersMock(){
        // Scan all classes in mockMonster package and save it
        Reflections reflections = new Reflections("application.entity.mockMonster");
        Set<Class<? extends Monster>> allClasses =
                reflections.getSubTypesOf(Monster.class);
        List<Monster> monsters = new ArrayList<>();
        allClasses.forEach(monster ->
                {
                    try {
                        Monster monsterMock = monster.newInstance();
                        monsters.add((Monster) Class.forName("application.entity.concreteMonster."+monsterMock.getFamily()+"."+monsterMock.getName()).getConstructor(Monster.class).newInstance(monsterMock));
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
        );
        monsterRepository.deleteAll(monsters);
        monsterRepository.saveAll(monsters);
    }

    @Override
    public List<Monster> getAllMonsters(){
        return monsterRepository.findAll();
    }

    @Override
    public List<Monster> getAllMonstersSelection(){
        return monsterRepository.findAll();
    }

}
