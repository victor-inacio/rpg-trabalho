public class Main {
    public static void main(String[] args) {
        Race race = new Race("Race", new Proficiency[]{
                new Proficiency("Força", 2),
                new Proficiency("Vida", 3),
                new Proficiency("Inteligência", 4),
        });

        Class aClass = new Class("Classe", new Proficiency[]{
                new Proficiency("Força", 2),
                new Proficiency("Vida", 3),
                new Proficiency("Inteligência", 4),
        });

        Tool tool = new Tool("Espada");
        Power power = new Power("Atirar fogo");
        String name = "Name";
        String mission = "Textao";
        String history = "History";

        Proficiency[] proficiencies = new Proficiency[] {
                new Proficiency("Força", 2),
                new Proficiency("Vida", 3),
                new Proficiency("Inteligência", 4),
        };

        RPGCharacter RPGCharacter = new RPGCharacter(name, mission, history, aClass, race, power, tool, proficiencies)
    }
}