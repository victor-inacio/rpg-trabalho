import java.util.Objects;

public class Proficiency {

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;

    public ProficiencyType getType() {
        return type;
    }

    public void setType(ProficiencyType type) {
        this.type = type;
    }

    public String getTypeName() {
        return type.toString();
    }

    private ProficiencyType type;

    public Proficiency(ProficiencyType type) {
        this.type = type;
        this.value = 0;
    }

    public Proficiency(ProficiencyType type, int value) {
        this.type = type;
        this.value = value;
    }

    public void transfer(Proficiency proficiency) {
        proficiency.value += value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proficiency that)) return false;
        return type == that.type;
    }
}
