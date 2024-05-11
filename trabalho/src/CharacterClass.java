public class CharacterClass {
    private String name;
    private Proficiency[] proficiencies;

    public CharacterClass(String name, Proficiency[] proficiencies) {
        this.name = name;
        this.proficiencies = proficiencies;
    }

    public String getName() {
        return name;
    }

    public Proficiency[] getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(Proficiency[] proficiencies) {
        this.proficiencies = proficiencies;
    }

    public void setName(String name) {
        this.name = name;
    }
}