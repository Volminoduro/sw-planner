package application.enums;

public enum Awaken {
    AWAKENED(true),
    UNAWAKENED(false);

    private final boolean value;

    Awaken(final boolean newValue) {
        value = newValue;
    }

    public boolean getValue() { return value; }
}
