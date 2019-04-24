package application.service;

import application.view.LeaderSkillView;
import application.view.MonsterComboBoxView;
import application.view.MonsterView;
import application.entity.Monster;
import application.enums.Attribute;
import application.enums.Family;

import java.util.List;

public interface MonsterWebService {

    MonsterView getMonsterFromName(String name);

    List<MonsterComboBoxView> getAllMonstersName();

    List<LeaderSkillView> getAllLeadersSkill();

    Monster getMonsterFromFamilyAndAttribute(Family family, Attribute attribute);
}
