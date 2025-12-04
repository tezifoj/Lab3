package classes;

public abstract class Observable {
    private String name;

    public Observable(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract String getDescription();

    @Override
    public String toString() {
        return getDescription();
    }
}
