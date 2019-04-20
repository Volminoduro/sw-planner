package service;

import entity.Monster;
import enums.Attribute;
import enums.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import view.MonsterView;

import java.util.Collections;
import java.util.List;

@Service
@CacheConfig(cacheNames={"monster"})
public class MonsterWebServiceImpl implements MonsterWebService {

    @Autowired
    MonsterService monsterService;

    @Override
    public MonsterView getMonsterFromName(String name) {
        // TODO : First, check it's not already load (by name)
        // TODO : If it's already loaded, we should check the id of modification of the monster on the database to check it's the same thing
        // TODO : If the id of modification is the same : we shouldn't even sent a monster back, just a OK message telling
        // TODO : https://medium.com/@igorkosandyak/spring-boot-caching-d74591abe117
        return new MonsterView(monsterService.getMonsterFromName(name));
    }

    @Override
    @Cacheable
    public List<Monster> getAllMonstersName(){
        // TODO
        return Collections.EMPTY_LIST;
    }

    @Override
    public Monster getMonsterFromFamilyAndAttribute(Family family, Attribute attribute) {
        return null;
    }
}