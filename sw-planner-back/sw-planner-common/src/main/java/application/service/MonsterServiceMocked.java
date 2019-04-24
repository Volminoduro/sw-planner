package application.service;

import application.entity.Monster;
import application.entity.concreteMonster.RaoqMocked;
import application.enums.Attribute;
import application.enums.Family;
import org.springframework.stereotype.Service;

@Service
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
