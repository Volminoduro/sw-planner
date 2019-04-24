package application.controller;

import application.entity.MongoSample;
import application.service.MonsterWebService;
import application.view.LeaderSkillView;
import application.view.MonsterComboBoxView;
import application.view.MonsterView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    private MonsterWebService monsterWebService;

    @RequestMapping(value = "/")
    public String anyPoint() {
        return "Hello World !";
    }

    @GetMapping(value = "/mongo")
    public MongoSample essaiMongoDB() {
        return monsterWebService.getMongoSample();
    }

    @GetMapping(value = "/monster/get/{name}")
    public MonsterView getMonster(@PathVariable @NotNull String name) {
        return monsterWebService.getMonsterFromName(name);
    }

    @GetMapping(value = "/monster/getAllNames")
    public List<MonsterComboBoxView> getAllMonstersName() {
        return monsterWebService.getAllMonstersName();
    }

    @GetMapping(value = "/monster/getAllLeadersSkill")
    public List<LeaderSkillView> getAllsLeadersSkill() {
        return monsterWebService.getAllLeadersSkill();
    }

    // TODO : Runes getting

    // TODO : Simulate fight

}
