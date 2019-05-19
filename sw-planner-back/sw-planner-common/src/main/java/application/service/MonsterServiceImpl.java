package application.service;

import application.dao.CustomRepository;
import application.dao.MonsterDocumentRepository;
import application.dao.RestrictedMonsterDocumentRepository;
import application.document.MonsterDocument;
import application.document.RestrictedMonsterDocument;
import application.entity.Monster;
import org.jetbrains.annotations.NotNull;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
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
    @Autowired
    RestrictedMonsterDocumentRepository restrictedMonsterDocumentRepository;
    @Autowired
    CustomRepository customRepository;

    public Monster getMonsterFromName(@NotNull String name) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        MonsterDocument monsterDocument = monsterDocumentRepository.findByName(name);
        Monster monster = (Monster) Class.forName("application.entity.concreteMonster."+monsterDocument.getFamily()
                +"."+monsterDocument.getName()).getConstructor(MonsterDocument.class).newInstance(monsterDocument);
        // TODO : Checks skills exists ?
        return monster;
    }

    @Override
    @Transactional
    public void createMonstersMock(){
        // TODO : https://stackoverflow.com/questions/34088780/how-to-get-bean-using-application-context-in-spring-boot Get bean instead of reflection
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
    public List<RestrictedMonsterDocument> getAllRestrictedMonsters(){
        List<RestrictedMonsterDocument> restrictedMonsterDocuments = restrictedMonsterDocumentRepository.findAll();
        restrictedMonsterDocuments.forEach(restrictedMonsterDocument ->
                restrictedMonsterDocument.setFirstStarGrade(customRepository.getFirstStarGradeAvailable(restrictedMonsterDocument.getName())));
        return restrictedMonsterDocuments;
    }

    @Override
    public List<Monster> getAllMonsters(){
        List<MonsterDocument> monstersDocument = monsterDocumentRepository.findAll();
        List<Monster> monsters = new ArrayList<>();
        // TODO : Instead of inspection, what should be nice is method like : getConcreteMonster with its name who will find it with a bean containing a name value, smth like this.
        monstersDocument.forEach(monsterDocument -> {
            try {
                monsters.add((Monster) Class.forName("application.entity.concreteMonster."+monsterDocument.getFamily()
                        +"."+monsterDocument.getName()).getConstructor(MonsterDocument.class).newInstance(monsterDocument));
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
