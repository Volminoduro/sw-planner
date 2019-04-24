package application.enums.rune;

import application.entity.Stat;

import java.util.List;

public abstract class RuneSlot {

    protected List<Stat> mainStatsPossible;
    protected List<Stat> prefixStatsPossible;
    protected List<Stat> subStatsPossible;

    public List<Stat> getMainStatsPossible() {
        return mainStatsPossible;
    }

    public void setMainStatsPossible(List<Stat> mainStatsPossible) {
        this.mainStatsPossible = mainStatsPossible;
    }

    public List<Stat> getPrefixStatsPossible() {
        return prefixStatsPossible;
    }

    public void setPrefixStatsPossible(List<Stat> prefixStatsPossible) {
        this.prefixStatsPossible = prefixStatsPossible;
    }

    public List<Stat> getSubStatsPossible() {
        return subStatsPossible;
    }

    public void setSubStatsPossible(List<Stat> subStatsPossible) {
        this.subStatsPossible = subStatsPossible;
    }
}
