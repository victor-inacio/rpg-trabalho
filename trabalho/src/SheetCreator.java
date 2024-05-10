import java.util.*;

public class SheetCreator {
    private int opcao = 4;

    private Scanner scanner = new Scanner(System.in);;
    public void init() {
        System.out.println("Vamos criar sua ficha de RPG!");

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
                    escolherClasse();
                    break;
                case 2:
                    // Criar raça elfo
                    escolherClasse();
                    break;
                case 3:
                    // Criar raça Anão
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
                    escolherEquipamento();
                    break;
                case 2:
                    // Criar classe Mago
                    escolherEquipamento();
                    break;
                case 3:
                    // Criar classe Atirador
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
                    escolherPoder();
                    break;
                case 2:
                    // Criar equipamento Cajado
                    escolherPoder();
                    break;
                case 3:
                    // Criar equipamento Arco
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
                    break;
                case 2:
                    // Criar poder regeneração
                    break;
                case 3:
                    // Criar poder proteção
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while(opcao != 0);
    }
}
