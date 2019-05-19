package application.service;

import application.document.RestrictedMonsterDocument;
import application.entity.Monster;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface MonsterService {

    Monster getMonsterFromName(String name) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;

    @Transactional
    void createMonstersMock();

    List<RestrictedMonsterDocument> getAllRestrictedMonsters();

    List<Monster> getAllMonsters();

}
