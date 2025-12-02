package enums;

public enum Emotion {
    HATE("ненавистно"),
    JOYFULLY("весело"),
    RABIES("бешенство"),
    INTENTLY("пристально"),
    REPROACH("с укором в глазах");

    private final String description;

    Emotion(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return this.description;
    }
}
