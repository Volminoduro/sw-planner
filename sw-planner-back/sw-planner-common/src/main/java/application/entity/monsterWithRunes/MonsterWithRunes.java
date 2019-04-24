package application.entity.monsterWithRunes;

import application.entity.Monster;
import org.jetbrains.annotations.NotNull;

public class MonsterWithRunes extends Monster {

    private MonsterRunes runes;

    public MonsterWithRunes(Monster monster){
        super(monster);
    }

    public MonsterRunes getRunes() {
        return runes;
    }

    public void setRunes(MonsterRunes runes) {
        this.runes = runes;
    }

    @Override
    public int compareTo(@NotNull Monster o) {
        return 0;
    }
}
