package application.service;

import dao.MonsterDAO;
import entity.Monster;
import enums.Attribute;
import enums.Family;
import org.jetbrains.annotations.NotNull;


public class MonsterServiceImpl implements MonsterService {

    MonsterDAO monsterDAO;

    public Monster getMonsterFromName(@NotNull String name){
        return null;
    }

    @Override
    public Monster getMonsterFromFamilyAndAttribute(@NotNull Family family, @NotNull Attribute attribute) {
        return null;
    }
}
