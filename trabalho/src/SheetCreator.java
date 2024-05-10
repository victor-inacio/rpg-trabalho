import java.util.*;

public class SheetCreator {
    private int opcao = 4;

    private RPGCharacter character = new RPGCharacter();

    private Scanner scanner = new Scanner(System.in);;
    public void init() {
        System.out.println("Vamos criar sua ficha de RPG!");

        escolherRaca();
    }

    public void escolherRaca() {
        do {

            System.out.println(
                    "\n1 - Humano (Força: +X; Vida: +Y; Inteligência: +Z) " +
                    "\n2 - Elfo (Força: +X; Vida: +Y; Inteligência: +Z) " +
                    "\n3 - Anão (Força: +X; Vida: +Y; Inteligência: +Z) " +
                    "\nEscolha uma das raças acima (0 para cancelar): ");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 0:
                    break;
                case 1:
                    // Criar raça humano
                    character.setRace(new Race("Humano"));

                    // Próximo passo
                    escolherClasse();
                    break;
                case 2:
                    // Criar raça elfo
                    character.setRace(new Race("Elfo"));

                    // Próximo passo
                    escolherClasse();
                    break;
                case 3:
                    // Criar raça Anão
                    character.setRace(new Race("Anão"));

                    // Próximo passo
                    escolherClasse();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while(opcao != 0);
    }

    public void escolherClasse() {
        do {

            System.out.println(
                    "\n1 - Guerreiro (Força: +X; Vida: +Y; Inteligência: +Z) " +
                    "\n2 - Mago (Força: +X; Vida: +Y; Inteligência: +Z) " +
                    "\n3 - Atirador (Força: +X; Vida: +Y; Inteligência: +Z) " +
                    "\nEscolha uma das classes acima (0 para cancelar): ");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 0:
                    break;
                case 1:
                    // Criar classe Guerreiro
                    character.setClasss(new characterClass("Guerreiro"));

                    // Próximo passo
                    escolherEquipamento();
                    break;
                case 2:
                    // Criar classe Mago
                    character.setClasss(new characterClass("Mago"));

                    // Próximo passo
                    escolherEquipamento();
                    break;
                case 3:
                    // Criar classe Atirador
                    character.setClasss(new characterClass("Atirador"));

                    // Próximo passo
                    escolherEquipamento();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while(opcao != 0);
    }

    public void escolherEquipamento() {
        do {

            System.out.println(
                    "\n1 - Espada " +
                    "\n2 - Cajado " +
                    "\n3 - Arco " +
                    "\nEscolha um dos equipamentos acima (0 para cancelar): ");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 0:
                    break;
                case 1:
                    // Criar equipamento Espada
                    character.setTool(new Tool("Espada"));

                    // Próximo passo
                    escolherPoder();
                    break;
                case 2:
                    // Criar equipamento Cajado
                    character.setTool(new Tool("Cajado"));

                    // Próximo passo
                    escolherPoder();
                    break;
                case 3:
                    // Criar equipamento Arco
                    character.setTool(new Tool("Arco"));

                    // Próximo passo
                    escolherPoder();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while(opcao != 0);
    }

    public void escolherPoder() {
        do {

            System.out.println(
                    "\n1 - Camuflagem " +
                    "\n2 - Regeneração " +
                    "\n3 - Proteção " +
                    "\nEscolha um dos poderes acima (0 para cancelar): ");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 0:
                    break;
                case 1:
                    // Criar poder camuflagem
                    character.setPower(new Power("Camuflagem"));
                    break;
                case 2:
                    // Criar poder regeneração
                    character.setPower(new Power("Regeneração"));
                    break;
                case 3:
                    // Criar poder proteção
                    character.setPower(new Power("Proteção"));
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while(opcao != 0);
    }
}
