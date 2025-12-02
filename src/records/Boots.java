package records;

import interfaces.Lookable;

public record Boots(String name) implements Lookable {
    @Override
    public String lookAt() {
        return "ботинки";
    }

    @Override
    public String toString() {
        return this.lookAt();
    }
}