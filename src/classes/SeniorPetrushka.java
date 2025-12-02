package classes;

import enums.Emotion;
import enums.RecordType;
import interfaces.PresentWithReproach;

import java.util.ArrayList;
import java.util.Objects;

public class SeniorPetrushka extends Person implements PresentWithReproach {

    public SeniorPetrushka(String name) {
        super(name);
    }

    @Override
    public void watch(Person person, Emotion emotion) {
        System.out.println(getName() + " посмотрел на " + person + " " + emotion);
    }

    @Override
    public void present() {
        System.out.println(getName() + " оглядел " + getReproachText());
    }

    @Override
    public void presentWithReproach(Emotion emotion, RecordType book) {
        System.out.println(getName() + " записал в " + book + " " + getReproachText() + " " + emotion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        SeniorPetrushka that = (SeniorPetrushka) obj;
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
