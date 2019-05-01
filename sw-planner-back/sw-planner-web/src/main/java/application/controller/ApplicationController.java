package application.controller;

import application.service.MonsterWebService;
import application.view.LeaderSkillView;
import application.view.MonsterSelectionBoxView;
import application.view.MonsterView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    private MonsterWebService monsterWebService;

    @GetMapping(value = "/monster/getAll")
    public List<MonsterSelectionBoxView> getAllMonstersName() {
        return monsterWebService.getAllMonstersSelection();
    }

    @GetMapping(value = "/monster/getAllLeadersSkill")
    public List<LeaderSkillView> getAllsLeadersSkill() {
        return monsterWebService.getAllLeadersSkill();
    }

    @GetMapping(value = "/monster/get/{name}")
    public MonsterView getMonster(@PathVariable @NotNull String name) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return monsterWebService.getMonsterFromName(name);
    }

    @GetMapping(value = "/monster/createAll")
    public List<MonsterView> createLastVersionOfMonsterMock() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return monsterWebService.createAllMonstersMock();
    }









}
