package entity;

public class Level {

    private int level;

    public Level(int level) {
        // TODO : Check limits and throw Exception in case
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
