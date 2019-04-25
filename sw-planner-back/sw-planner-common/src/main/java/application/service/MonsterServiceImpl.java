package application.service;

import application.dao.MonsterRepository;
import application.entity.Monster;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonsterServiceImpl implements MonsterService {

    @Autowired
    MonsterRepository monsterRepository;

    public Monster getMonsterFromName(@NotNull String name){
        Monster monster = monsterRepository.findByName(name);

        // TODO : Implements skills logic (as sw-planner-common should be a library usable elsewhere)
        return monster;
    }

    @Override
    public void createMonsterMock(Monster monster){
        monsterRepository.deleteAll();
        monsterRepository.save(monster);
    }

}
