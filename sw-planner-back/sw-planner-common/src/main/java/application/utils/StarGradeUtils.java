package application.utils;

import application.enums.StarGrade;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class StarGradeUtils {

    public static StarGrade getStarGrade(int starGradeExcepted){
        return Arrays.stream(StarGrade.values()).filter(starGrade -> starGrade.getValue()==starGradeExcepted).collect(Collectors.toList()).get(0);
    }
}
