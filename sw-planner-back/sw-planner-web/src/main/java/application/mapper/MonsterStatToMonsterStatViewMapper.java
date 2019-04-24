package application.mapper;

import application.entity.MonsterEvolvingStats;
import application.entity.MonsterStaticStats;

import java.util.HashMap;
import java.util.Map;

public abstract class MonsterStatToMonsterStatViewMapper {

    public static Map<Boolean, HashMap<String, Integer>> map(MonsterStaticStats staticStats){
        Map<Boolean, HashMap<String, Integer>> stats = new HashMap<>();

        staticStats.getStaticStats().entrySet().forEach(entry -> {
            boolean currentAwaken = entry.getKey().getValue();
            HashMap<String, Integer> currentStatViewMap = new HashMap<>();
            entry.getValue().entrySet().forEach(statWithValue -> {
                String currentStatType = statWithValue.getKey().name();
                Integer currentStatAmount = statWithValue.getValue();
                currentStatViewMap.put(currentStatType, currentStatAmount);
            });
            stats.put(currentAwaken, currentStatViewMap);
        });

        return stats;
    }

    public static Map<Integer, HashMap<Boolean, HashMap<String, HashMap<Integer, Integer>>>> map(MonsterEvolvingStats evolvingStats){
        Map<Integer, HashMap<Boolean, HashMap<String, HashMap<Integer, Integer>>>> stats = new HashMap<>();

        evolvingStats.getEvolvingStats().entrySet().forEach(entry -> {
            int currentStarGrade = entry.getKey().getValue();
            HashMap<Boolean, HashMap<String, HashMap<Integer, Integer>>> currentAwakenMap = new HashMap<>();

            entry.getValue().entrySet().forEach(awakenWithStatType -> {

                boolean currentAwaken = awakenWithStatType.getKey().getValue();
                HashMap<String, HashMap<Integer, Integer>> currentStatTypeMap = new HashMap<>();

                awakenWithStatType.getValue().entrySet().forEach(statWithLevel -> {

                    String currentStatType = statWithLevel.getKey().name();
                    HashMap<Integer, Integer> currentLevelViewMap = new HashMap<>();

                    statWithLevel.getValue().entrySet().forEach(levelWithAmount -> {
                        Integer currentLevel = levelWithAmount.getKey().getLevel();
                        currentLevelViewMap.put(currentLevel, levelWithAmount.getValue());
                    });

                    currentStatTypeMap.put(currentStatType, currentLevelViewMap);
                });

                currentAwakenMap.put(currentAwaken, currentStatTypeMap);
            });

            stats.put(currentStarGrade, currentAwakenMap);
        });

        return stats;
    }
}
