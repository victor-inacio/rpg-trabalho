public class RPGCharacter {
    private String name;

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

    public characterClass getClasss() {
        return classs;
    }

    public void setClasss(characterClass aCharacterClass) {
        this.classs = aCharacterClass;

        for (Proficiency proficiency : this.proficiencies) {
            for (Proficiency classProficiencies: aCharacterClass.getProficiencies()) {
                if (classProficiencies.equals(proficiency)) {
                    classProficiencies.transfer(proficiency);
                }
            }
        }
    }

    public Race getRace() {
        return race;
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

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public Tool getTool() {
        return tool;
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

    private String mission;
    private String history;
    private characterClass classs;
    private Race race;
    private Power power;
    private Tool tool;

    private Proficiency[] proficiencies = new Proficiency[] {
        new Proficiency(ProficiencyType.FORCA),
        new Proficiency(ProficiencyType.INTELIGENCIA),
        new Proficiency(ProficiencyType.VIDA),
    };
}
