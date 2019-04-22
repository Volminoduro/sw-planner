package entity;

import enums.Awaken;
import enums.EvolvingStatType;
import enums.StarGrade;

import java.util.HashMap;
import java.util.Map;

public class MonsterEvolvingStats {

    Map<StarGrade, HashMap<Awaken, HashMap<EvolvingStatType, HashMap<Level, Integer>>>> evolvingStats;

    public MonsterEvolvingStats() {
        this.evolvingStats = new HashMap<>();
    }

    public Map<StarGrade, HashMap<Awaken, HashMap<EvolvingStatType, HashMap<Level, Integer>>>> getEvolvingStats() {
        return evolvingStats;
    }

    public void setEvolvingStats(Map<StarGrade, HashMap<Awaken, HashMap<EvolvingStatType, HashMap<Level, Integer>>>> evolvingStats) {
        this.evolvingStats = evolvingStats;
    }
}
