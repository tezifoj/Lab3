package classes;

import enums.Emotion;
import interfaces.Finable;

import java.util.Objects;

public class Lawyer extends Person implements Finable {
    public Lawyer(String name) {
        super(name);
    }
    @Override
    public String fined() {
        return getName();
    }

    @Override
    public void watch(Person person, Emotion emotion) {
        System.out.println(getName() + " посмотрел на " + person + " " + emotion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Lawyer that)) return false;
        if (!super.equals(obj)) return false;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return getName();
    }

}
