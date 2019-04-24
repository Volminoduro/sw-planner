package application.service;

import application.entity.Monster;
import application.enums.Attribute;
import application.enums.Family;

public interface MonsterService {

    Monster getMonsterFromName(String name);
    Monster getMonsterFromFamilyAndAttribute(Family family, Attribute attribute);

}
