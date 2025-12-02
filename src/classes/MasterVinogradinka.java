package classes;

import enums.Emotion;
import exceptions.ChokingException;
import interfaces.Finable;
import interfaces.Lookable;

import java.util.Objects;

public class MasterVinogradinka extends Person {
    private boolean isChoked = false;

    public MasterVinogradinka(String name) {
        super(name);
    }

    @Override
    public void watch(Person person, Emotion emotion) {
        System.out.println(getName() + " посмотрел на " + person + " " + emotion);
    }

    public void breathing(Emotion emotion) throws ChokingException {
        checkChoked();
        // 20% шанс задохнуться
        if (Math.random() < 0.2) {
            isChoked = true;
            throw new ChokingException(getName() + " задохнулся от " + emotion + " и не может продолжать!");
        }
        System.out.println(getName() + " испытывает " + emotion + ", едва дышит");
    }

    public void see(Emotion emotion, Lookable item) throws ChokingException {
        checkChoked();
        System.out.println(getName() + " " + emotion + " рассматривает " + item.lookAt());
    }

    public void moreSee(Emotion emotion, Lookable item) throws ChokingException {
        checkChoked();
        System.out.println(getName() + " еще более " + emotion + " рассматривает " + item.lookAt());
    }

    public void afraid(Person person) throws ChokingException {
        checkChoked();
        if (person instanceof Finable finablePerson) {
            System.out.println(getName() + " боится, что " + finablePerson.getName() + " его оштрафует");
        } else {
            System.out.println(getName() + " не боится, что " + person.getName() + " его оштрафует");
        }
    }

    // Проверка состояния перед выполнением других методов
    private void checkChoked() throws ChokingException {
        if (isChoked) {
            throw new ChokingException(getName() + " задохнулся и не может выполнять действия");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MasterVinogradinka that)) return false;
        if (!super.equals(obj)) return false;
        return isChoked == that.isChoked && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), isChoked);
    }

    @Override
    public String toString() {
        return getName() + (isChoked ? " (задохнулся)" : "");
    }
}