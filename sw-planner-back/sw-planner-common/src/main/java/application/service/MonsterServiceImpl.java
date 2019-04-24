package application.service;

import application.dao.MonsterDAO;
import application.entity.Monster;
import application.enums.Attribute;
import application.enums.Family;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;


public class MonsterServiceImpl implements MonsterService {

    @Autowired
    MonsterDAO monsterDAO;

    public Monster getMonsterFromName(@NotNull String name){
        return null;
    }

    @Override
    public Monster getMonsterFromFamilyAndAttribute(@NotNull Family family, @NotNull Attribute attribute) {
        return null;
    }
}
