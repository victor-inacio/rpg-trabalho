public class RPGCharacter {
    private String name;
    private String mission;
    private String history;
    private Class classs;
    private Race race;
    private Power power;
    private Tool tool;

    private Proficiency[] proficiencies = new Proficiency[] {
        new Proficiency("Força"),
        new Proficiency("Vida"),
        new Proficiency("Inteligência"),
    };


    public RPGCharacter(String name, String mission, String history, Class aClass, Race race, Power power, Tool tool, Proficiency[] proficiencies) {
        this.name = name;
        this.mission = mission;
        this.history = history;
        this.classs = aClass;
        this.race = race;
        this.power = power;
        this.tool = tool;

        for (Proficiency proficiency: proficiencies) {
            for (Proficiency proficiency2: this.proficiencies) {
                if (proficiency.equals(proficiency2)) {
                    proficiency.transfer(proficiency2);
                }
            }
        }

        for (Proficiency proficiency : this.proficiencies) {
            for (Proficiency raceProficiency: race.getProficiencies()) {
                if (raceProficiency.equals(proficiency)) {
                    raceProficiency.transfer(proficiency);
                }
            }

            for (Proficiency classProficiencies: aClass.getProficiencies()) {
                if (classProficiencies.equals(proficiency)) {
                    classProficiencies.transfer(proficiency);
                }
            }
        }
    }
}
