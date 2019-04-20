package service;

import entity.Monster;
import enums.Attribute;
import enums.Family;
import view.MonsterView;

import java.util.List;

public interface MonsterWebService {

    MonsterView getMonsterFromName(String name);

    List<Monster> getAllMonstersName();

    Monster getMonsterFromFamilyAndAttribute(Family family, Attribute attribute);
}
