package service;

import com.sun.istack.internal.NotNull;
import dao.MonsterDAO;
import entity.Monster;
import enums.Attribute;
import enums.Family;

@Service
public class MonsterServiceImpl implements MonsterService {

    @Autowired
    MonsterDAO monsterDAO;

    public Monster getMonsterFromName(@NotNull String name){
        return null;
    }

    @Override
    public Monster getMonsterFromFamilyAndAttribute(@NotNull Family family, @NotNull Attribute attribute) {
        return null;
    }
}
