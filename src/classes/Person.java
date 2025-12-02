package classes;

import enums.Emotion;

public abstract class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void watch(Person person, Emotion emotion);

}
