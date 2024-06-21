// ALUNOS: GABRIEL EDUARDO BARBOSA DA SILVA (UC22101937) e VICTOR INACIO FERREIRA SOARES (UC22200065)
public class Main {
    public static void main(String[] args) {
        SheetCreator sheetCreator = new SheetCreator();
        sheetCreator.init();

        RPGCharacter character = sheetCreator.getCharacter();
        Game game = new Game(character);
        game.start();
    }
}