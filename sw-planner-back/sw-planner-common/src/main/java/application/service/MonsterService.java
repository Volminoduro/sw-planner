package application.service;

import application.entity.Monster;

public interface MonsterService {

    Monster getMonsterFromName(String name);

    void createMonsterMock(Monster monster);
}
