package classes;

public class Boots extends Observable {
    public Boots(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "ботинки";
    }
}