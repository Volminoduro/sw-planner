package application.entity;

public class BonusStat {

    private Stat stat;
    private boolean multiplicative;

    public BonusStat(Stat stat, boolean multiplicative) {
        this.stat = stat;
        this.multiplicative = multiplicative;
    }

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }

    public boolean isMultiplicative() {
        return multiplicative;
    }

    public void setMultiplicative(boolean multiplicative) {
        this.multiplicative = multiplicative;
    }
}
