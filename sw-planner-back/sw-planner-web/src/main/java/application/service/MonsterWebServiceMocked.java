package application.service;

import application.dao.MongoSampleRepository;
import application.entity.MongoDocument;
import application.entity.MongoSample;
import application.mapper.MonsterToMonsterViewMapper;
import application.view.LeaderSkillView;
import application.view.MonsterComboBoxView;
import application.view.MonsterView;
import application.entity.Monster;
import application.enums.Attribute;
import application.enums.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonsterWebServiceMocked implements MonsterWebService {

    @Autowired
    MonsterService monsterService;

    @Autowired
    MongoSampleRepository mongoSampleRepository;

    @Override
    public MonsterView getMonsterFromName(String name) {
        return MonsterToMonsterViewMapper.map(monsterService.getMonsterFromName(name));
    }

    @Override
    public MongoSample getMongoSample(){
        MongoSample mongoSample = new MongoSample("MonNom", 42, new MongoDocument("MonNomDocument", "MonContenu"));
        mongoSampleRepository.save(mongoSample);
        mongoSample = new MongoSample("essai", 42, new MongoDocument("MonNomDocument2", "MonContenu"));
        mongoSampleRepository.save(mongoSample);
        mongoSample = new MongoSample("essai2", 42, new MongoDocument("MonNomDocument", "MonContenu"));
        mongoSampleRepository.save(mongoSample);
        return mongoSampleRepository.findByNom("essai");
    }

    @Override
    public List<MonsterComboBoxView> getAllMonstersName() {
        return null;
    }

    @Override
    public List<LeaderSkillView> getAllLeadersSkill(){
        return null;
    }

    @Override
    public Monster getMonsterFromFamilyAndAttribute(Family family, Attribute attribute) {
        return null;
    }
}
