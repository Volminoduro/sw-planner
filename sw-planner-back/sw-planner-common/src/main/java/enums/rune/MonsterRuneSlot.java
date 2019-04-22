package enums.rune;

public enum MonsterRuneSlot {
    FIRST_SLOT(1),
    SECOND_SLOT(2),
    THIRD_SLOT(3),
    FOURTH_SLOT(4),
    FIFTH_SLOT(5),
    SIXTH_SLOT(6);

    private final int value;

    MonsterRuneSlot(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
}
