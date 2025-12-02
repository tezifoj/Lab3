package classes;

import java.util.Arrays;

public class Thunderstorm {
    private final String[] componentNames;

    public Thunderstorm(String[] componentNames) {
        this.componentNames = componentNames;
    }

    public void rage() {
        if (componentNames == null || componentNames.length == 0) {
            throw new IllegalStateException("Гроза не может бушевать без компонентов!");
        }

        for (int i = componentNames.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            String temp = componentNames[i];
            componentNames[i] = componentNames[j];
            componentNames[j] = temp;
        }

        StringBuilder gale = new StringBuilder("Разразилась гроза с ");

        for (int i = 0; i < componentNames.length; i++) {
            if (i > 0) {
                if (i == componentNames.length - 1) {
                    gale.append(" и ");
                } else {
                    gale.append(", ");
                }
            }
            gale.append(componentNames[i]);
        }

        System.out.println(gale);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        // TODO instaceof
        if (!(obj instanceof Thunderstorm that)) return false;
        return Arrays.equals(componentNames, that.componentNames);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(componentNames);
    }

    @Override
    public String toString() {
        return "Thunderstorm{componentNames=" + Arrays.toString(componentNames) + "}";
    }
}
