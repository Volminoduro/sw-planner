package service;

import entity.Monster;
import enums.Attribute;
import enums.Family;

public interface MonsterService {

    Monster getMonsterFromName(String name);
    Monster getMonsterFromFamilyAndAttribute(Family family, Attribute attribute);

}
