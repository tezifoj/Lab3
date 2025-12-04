package classes;

public abstract class Observable {

    public abstract String getDescription();

    @Override
    public String toString() {
        return getDescription();
    }
}

