package application.utils;

import application.entity.Level;
import application.enums.Awaken;
import application.enums.EvolvingStatType;
import application.enums.StaticStatType;

import java.util.HashMap;

public abstract class StatUtils {

    public static HashMap<StaticStatType, Integer> generateEntryForStaticStat(StaticStatType staticStatType, int amount){
        HashMap<StaticStatType, Integer> stat = new HashMap<>();
        stat.put(staticStatType, amount);
        return stat;
    }

    public static HashMap<Awaken, HashMap<EvolvingStatType, HashMap<Level, Integer>>> generateCompleteEntryForEvolvingStat(Awaken awakened, EvolvingStatType evolvingStatType, int level, int amount){
        HashMap<Awaken, HashMap<EvolvingStatType, HashMap<Level, Integer>>> stat = new HashMap<>();
        HashMap<EvolvingStatType, HashMap<Level, Integer>> evolvingStatTypeMap = new HashMap<>();
        HashMap<Level, Integer> amountMap = new HashMap<>();

        amountMap.put(new Level(level), amount);
        evolvingStatTypeMap.put(evolvingStatType, amountMap);
        stat.put(awakened, evolvingStatTypeMap);
        return stat;
    }

    public static HashMap<Awaken, HashMap<EvolvingStatType, HashMap<Level, Integer>>> generateCompleteEntryForEvolvingStat(Awaken awakened, EvolvingStatType evolvingStatType, Level level, int amount){
        return generateCompleteEntryForEvolvingStat(awakened, evolvingStatType, level.getLevel(), amount);
    }

    public static HashMap<EvolvingStatType, HashMap<Level, Integer>> generatePartialEntryForEvolvingStat(EvolvingStatType evolvingStatType, int level, int amount){
        HashMap<EvolvingStatType, HashMap<Level, Integer>> stat = new HashMap<>();
        HashMap<Level, Integer> amountMap = new HashMap<>();

        amountMap.put(new Level(level), amount);
        stat.put(evolvingStatType, amountMap);
        return stat;
    }

    public static HashMap<Level, Integer> generateVeryPartialEntryForEvolvingStat(int level, int amount){
        HashMap<Level, Integer> stat = new HashMap<>();
        stat.put(new Level(level), amount);
        return stat;
    }
}
