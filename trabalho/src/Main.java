public class Main {
    public static void main(String[] args) {
        Race race = new Race("Race", new Proficiency[]{
                new Proficiency(ProficiencyType.VIDA,2),
                new Proficiency(ProficiencyType.FORCA,3),
                new Proficiency(ProficiencyType.INTELIGENCIA,4),
        });

        Tool[] tools = new Tool[]{
                new Tool("Cajado"),
                new Tool("Espada"),
                new Tool("Arco"),
        };

        Class[] classes = new Class[] {
                new Class("Atirador", new Proficiency[] {
                    new Proficiency(ProficiencyType.VIDA,2),
                    new Proficiency(ProficiencyType.FORCA,3),
                    new Proficiency(ProficiencyType.INTELIGENCIA,4),
                }),
                new Class("Guerreiro", new Proficiency[] {
                        new Proficiency(ProficiencyType.VIDA,2),
                        new Proficiency(ProficiencyType.FORCA,3),
                        new Proficiency(ProficiencyType.INTELIGENCIA,4),
                }),
                new Class("Mago", new Proficiency[] {
                        new Proficiency(ProficiencyType.VIDA,2),
                        new Proficiency(ProficiencyType.FORCA,3),
                        new Proficiency(ProficiencyType.INTELIGENCIA,4),
                }),
        };



        Tool tool = new Tool("Espada");
        Power power = new Power("Atirar fogo");
        String name = "Name";
        String mission = "Textao";
        String history = "History";
        
        Proficiency[] proficiencies = new Proficiency[] {
                new Proficiency(ProficiencyType.VIDA,2),
                new Proficiency(ProficiencyType.FORCA,3),
                new Proficiency(ProficiencyType.INTELIGENCIA,4),
        };

    }
}