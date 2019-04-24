package application.enums;

public enum StarGrade {
    THREE_STARS_GRADE(3),
    FOUR_STARS_GRADE(4),
    FIVE_STARS_GRADE(5),
    SIX_STARS_GRADE(6);

    private final int value;

    StarGrade(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
}
