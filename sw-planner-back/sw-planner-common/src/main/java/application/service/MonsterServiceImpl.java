package application.service;

import application.dao.MonsterDocumentRepository;
import application.document.MonsterDocument;
import application.entity.Monster;
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
    MonsterDocumentRepository monsterDocumentRepository;

    public Monster getMonsterFromName(@NotNull String name) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        MonsterDocument monsterDocument = monsterDocumentRepository.findByName(name);
        Monster monster = (Monster) Class.forName("application.entity.concreteMonster."+monsterDocument.getFamily()+"."+name).getConstructor(Monster.class).newInstance(monsterDocument);
        // TODO : Checks skills exists ?
        return monster;
    }

    @Override
    @Transactional
    public void createMonstersMock(){
        // Scan all classes in mockMonster package and save it
        Reflections reflections = new Reflections("application.entity.mockMonster");
        Set<Class<? extends MonsterDocument>> allClasses =
                reflections.getSubTypesOf(MonsterDocument.class);
        List<MonsterDocument> monsters = new ArrayList<>();
        allClasses.forEach(monster ->
                {
                    try {
                        monsters.add(new MonsterDocument(monster.newInstance()));
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
        );
        monsterDocumentRepository.deleteAll(monsters);
        monsterDocumentRepository.saveAll(monsters);
    }

    @Override
    public List<Monster> getAllMonsters(){
        List<MonsterDocument> monstersDocument = monsterDocumentRepository.findAll();
        List<Monster> monsters = new ArrayList<>();
        monstersDocument.forEach(monsterDocument -> {
            try {
                monsters.add((Monster) Class.forName("application.entity.concreteMonster."+monsterDocument.getFamily()+"."+monsterDocument.getName()).getConstructor(Monster.class).newInstance(monsterDocument));
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });
        return monsters;
    }

}
