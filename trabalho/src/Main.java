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

        characterClass[] characterClasses = new characterClass[] {
                new characterClass("Atirador", new Proficiency[] {
                    new Proficiency(ProficiencyType.VIDA,2),
                    new Proficiency(ProficiencyType.FORCA,3),
                    new Proficiency(ProficiencyType.INTELIGENCIA,4),
                }),
                new characterClass("Guerreiro", new Proficiency[] {
                        new Proficiency(ProficiencyType.VIDA,2),
                        new Proficiency(ProficiencyType.FORCA,3),
                        new Proficiency(ProficiencyType.INTELIGENCIA,4),
                }),
                new characterClass("Mago", new Proficiency[] {
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

        SheetCreator sheetCreator = new SheetCreator();
        sheetCreator.init();
    }
}