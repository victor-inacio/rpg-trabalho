// ALUNOS: GABRIEL EDUARDO BARBOSA DA SILVA (UC22101937) e VICTOR INACIO FERREIRA SOARES (UC22200065)
public class RPGCharacter {
    private String name;
    private String mission;
    private String history;
    private CharacterClass characterClass;
    private Race race;
    private Power power;
    private Tool tool;

    private Proficiency[] proficiencies = new Proficiency[] {
        new Proficiency(ProficiencyType.FORCA),
        new Proficiency(ProficiencyType.VIDA),
        new Proficiency(ProficiencyType.INTELIGENCIA)
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getCharacterClass() {
        return characterClass.getName();
    }

    public void setCharacterClass(CharacterClass aCharacterClass) {
        this.characterClass = aCharacterClass;

        for (Proficiency proficiency : this.proficiencies) {
            for (Proficiency classProficiencies: aCharacterClass.getProficiencies()) {
                if (classProficiencies.equals(proficiency)) {
                    classProficiencies.transfer(proficiency);
                }
            }
        }
    }

    public String getRace() {
        return race.getName();
    }

    public void setRace(Race race) {
        this.race = race;

        for (Proficiency thisProficiency : this.proficiencies) {
            for (Proficiency raceProficiency: race.getProficiencies()) {
                if (raceProficiency.equals(thisProficiency)) {
                    raceProficiency.transfer(thisProficiency);
                }
            }
        }
    }

    public String getPower() {
        return power.getName();
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public String getTool() {
        return tool.getName();
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public Proficiency[] getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(Proficiency[] proficiencies) {
        this.proficiencies = proficiencies;
    }
}
