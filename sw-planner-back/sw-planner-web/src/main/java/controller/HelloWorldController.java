package controller;

import entity.Monster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.MonsterWebService;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    private MonsterWebService monsterWebService;

    @GetMapping(value = "/Monsters/get/{name}")
    public Monster getMonster(@PathVariable @NotNull String name) {
        return monsterWebService.getMonsterFromName(name);
    }

    @GetMapping(value = "/Monsters/getAllNames")
    public List<Monster> getAllMonstersName() {
        return monsterWebService.getAllMonstersName();
    }

}
