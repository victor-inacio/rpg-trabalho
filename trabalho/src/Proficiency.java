import java.util.Objects;

public class Proficiency {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;

    public Proficiency(String name) {
        this.name = name;
        this.value = 0;
    }

    public Proficiency(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void transfer(Proficiency proficiency) {
        proficiency.value += value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proficiency that)) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
