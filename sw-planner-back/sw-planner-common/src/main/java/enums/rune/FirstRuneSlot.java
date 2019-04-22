package enums.rune;

import entity.Stat;
import enums.EvolvingStatType;
import enums.StatType;

import java.util.List;

public class FirstRuneSlot extends RuneSlot {

    public FirstRuneSlot() {
        super.mainStatsPossible.add(new Stat(EvolvingStatType.ATK, 0));
        super.prefixStatsPossible.addAll(generatePrefixStatsPossible());
        super.subStatsPossible.addAll(generateSubStatsPossible());
    }

    private List<Stat> generatePrefixStatsPossible(){
        return null;
    }

    private List<Stat> generateSubStatsPossible(){
        return null;
    }
}
