package utils;

import entity.Level;
import enums.EvolvingStatType;

import java.util.HashMap;

public abstract class StatUtils {



    public static HashMap<Boolean, HashMap<EvolvingStatType, HashMap<Level, Integer>>> generateEntryForEvolvingStat(boolean awakened, EvolvingStatType evolvingStatType, int level, int amount){
        HashMap<Boolean, HashMap<EvolvingStatType, HashMap<Level, Integer>>> stat = new HashMap<>();
        HashMap<EvolvingStatType, HashMap<Level, Integer>> evolvingStatTypeMap = new HashMap<>();
        HashMap<Level, Integer> amountMap = new HashMap<>();

        amountMap.put(new Level(level), amount);
        evolvingStatTypeMap.put(evolvingStatType, amountMap);
        stat.put(awakened, evolvingStatTypeMap);
        return stat;
    }

    public static HashMap<Boolean, HashMap<EvolvingStatType, HashMap<Level, Integer>>> generateEntryForEvolvingStat(boolean awakened, EvolvingStatType evolvingStatType, Level level, int amount){
        return generateEntryForEvolvingStat(awakened, evolvingStatType, level.getLevel(), amount);
    }

    public static HashMap<Boolean, Integer> generateEntryForStaticStat(boolean awakened, int amount){
        HashMap<Boolean, Integer> stat = new HashMap<>();
        stat.put(awakened, amount);
        return stat;
    }
}
