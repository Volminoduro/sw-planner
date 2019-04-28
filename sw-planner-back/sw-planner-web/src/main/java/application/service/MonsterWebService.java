package application.service;

import application.view.LeaderSkillView;
import application.view.MonsterSelectionBoxView;
import application.view.MonsterView;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface MonsterWebService {

    MonsterView getMonsterFromName(String name) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;

    List<MonsterSelectionBoxView> getAllMonstersSelection();

    List<LeaderSkillView> getAllLeadersSkill();

    MonsterView createMonsterMock(String name) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException;
}
