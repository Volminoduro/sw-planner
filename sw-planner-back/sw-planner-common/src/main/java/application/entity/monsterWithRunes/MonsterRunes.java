package application.entity.monsterWithRunes;

import application.enums.rune.*;

import java.util.SortedMap;
import java.util.TreeMap;

public class MonsterRunes {

    private SortedMap<MonsterRuneSlot, Rune> runes;

    public MonsterRunes(){
        this.runes = new TreeMap<>();

        this.runes.put(MonsterRuneSlot.FIRST_SLOT, null);
        this.runes.put(MonsterRuneSlot.SECOND_SLOT, null);
        this.runes.put(MonsterRuneSlot.THIRD_SLOT, null);
        this.runes.put(MonsterRuneSlot.FOURTH_SLOT, null);
        this.runes.put(MonsterRuneSlot.FIFTH_SLOT, null);
        this.runes.put(MonsterRuneSlot.SIXTH_SLOT, null);
    }

    public SortedMap<MonsterRuneSlot, Rune> getRunes() {
        return runes;
    }

    public void setRunes(SortedMap<MonsterRuneSlot, Rune> runes) {
        this.runes = runes;
    }
}
