// ALUNOS: GABRIEL EDUARDO BARBOSA DA SILVA (UC22101937) e VICTOR INACIO FERREIRA SOARES (UC22200065)
public class Race {
    private String name;
    private Proficiency[] proficiencies;

    public Race(String name, Proficiency[] proficiencies) {
        this.name = name;
        this.proficiencies = proficiencies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, Proficiency[] proficiencies) {
        this.name = name;
        this.proficiencies = proficiencies;
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
