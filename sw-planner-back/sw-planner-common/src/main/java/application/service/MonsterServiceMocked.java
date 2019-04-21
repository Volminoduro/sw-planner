package application.service;

import entity.Monster;
import entity.monster.RaoqMocked;
import enums.Attribute;
import enums.Family;

public class MonsterServiceMocked implements MonsterService {

    @Override
    public Monster getMonsterFromName(String name) {
        // Create a Raoq
        return new RaoqMocked();
    }

    @Override
    public Monster getMonsterFromFamilyAndAttribute(Family family, Attribute attribute) {
        return null;
    }
}
