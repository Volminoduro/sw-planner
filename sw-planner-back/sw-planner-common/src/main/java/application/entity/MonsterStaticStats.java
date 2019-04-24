package application.entity;

import application.enums.Awaken;
import application.enums.StaticStatType;

import java.util.HashMap;
import java.util.Map;

public class MonsterStaticStats {

    private Map<Awaken, HashMap<StaticStatType, Integer>> staticStats;

    public MonsterStaticStats() {
        staticStats = new HashMap<>();
    }

    public Map<Awaken, HashMap<StaticStatType, Integer>> getStaticStats() {
        return staticStats;
    }

    public void setStaticStats(Map<Awaken, HashMap<StaticStatType, Integer>> staticStats) {
        this.staticStats = staticStats;
    }
}
