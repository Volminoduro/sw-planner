package application.mapper;

import application.view.RuneView;
import application.entity.Rune;
import application.enums.rune.MonsterRuneSlot;

import java.util.SortedMap;
import java.util.TreeMap;

public abstract class MonsterRuneToMonsterRuneViewMap {

    public static SortedMap<Integer, RuneView> map(SortedMap<MonsterRuneSlot, Rune> runes){
        SortedMap<Integer, RuneView> runesView = new TreeMap<>();

        runes.entrySet().forEach(entry -> {
            runesView.put(entry.getKey().getValue(), new RuneView(entry.getValue()));
        });

        return runesView;
    }
}
