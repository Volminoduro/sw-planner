package application.service;

import application.view.LeaderSkillView;
import application.view.MonsterComboBoxView;
import application.view.MonsterView;
import entity.Monster;
import enums.Attribute;
import enums.Family;

import java.util.List;

public interface MonsterWebService {

    MonsterView getMonsterFromName(String name);

    List<MonsterComboBoxView> getAllMonstersName();

    List<LeaderSkillView> getAllLeadersSkill();

    Monster getMonsterFromFamilyAndAttribute(Family family, Attribute attribute);
}
