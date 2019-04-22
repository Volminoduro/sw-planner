package utils;

import entity.Level;
import enums.CommonConstantes;
import enums.StarGrade;

public abstract class LevelUtils {

    public static Level getMaxLevelPossible(StarGrade starGrade){
        return new Level(starGrade.getValue()*CommonConstantes.GRADE_LEVEL_MONSTER_INCREMENT+ CommonConstantes.NO_GRADE_MAX_LEVEL_MONSTER);
    }
}
