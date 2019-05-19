package application.dao;

import application.entity.MonsterEvolvingStat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class CustomRepositoryImpl implements CustomRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public int getFirstStarGradeAvailable(String monsterName) {
        Query query = new Query();
        query.with(new Sort(Sort.Direction.ASC, "starGrade"));
        query.addCriteria(Criteria.where("_id").is(monsterName));

        // TODO : Just get first row of evolving stats
        MonsterEvolvingStat monsterEvolvingStat = mongoTemplate.findOne(query,MonsterEvolvingStat.class);
        return monsterEvolvingStat.getStarGrade();
    }
}
