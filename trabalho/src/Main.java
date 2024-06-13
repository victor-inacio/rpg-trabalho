public class Main {
    public static void main(String[] args) {
        SheetCreator sheetCreator = new SheetCreator();
        sheetCreator.init();

        RPGCharacter character = sheetCreator.getCharacter();
        Game game = new Game(character);
        game.start();
    }
}