package application.enums.rune;

import application.entity.Stat;
import application.enums.EvolvingStatType;

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
