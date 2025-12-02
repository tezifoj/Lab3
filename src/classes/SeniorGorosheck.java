package classes;

import enums.Emotion;

import java.util.Objects;

public class SeniorGorosheck extends Person {
    public SeniorGorosheck(String name) {
        super(name);
    }

    @Override
    public void watch(Person person, Emotion emotion) {
        System.out.println(getName() + " посмотрел на " + person + " " + emotion);
    }

    public void wink(Emotion emotion, Person person) {
        System.out.println(getName() + " " + emotion + " подмигнул " + person);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SeniorGorosheck that)) return false;
        if (!super.equals(obj)) return false;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName());
    }

    @Override
    public String toString() {
        return getName();
    }
}