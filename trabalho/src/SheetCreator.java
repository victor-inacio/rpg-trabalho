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
                    "\n1 - Humano (Força: +1; Vida: +2; Inteligência: +2) " +
                    "\n2 - Elfo (Força: +0; Vida: +1; Inteligência: +4) " +
                    "\n3 - Anão (Força: +3; Vida: +2; Inteligência: +0) " +
                    "\nEscolha uma das raças acima (0 para cancelar): ");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 0:
                    break;
                case 1:
                    // Criar raça humano
                    Proficiency[] proficienciesHuman = new Proficiency[] {
                            new Proficiency(ProficiencyType.FORCA,1),
                            new Proficiency(ProficiencyType.VIDA, 2),
                            new Proficiency(ProficiencyType.INTELIGENCIA,2)
                    };
                    character.setRace(new Race("Humano", proficienciesHuman));

                    // Próximo passo
                    escolherClasse();
                    break;
                case 2:
                    // Criar raça elfo
                    Proficiency[] proficienciesElf = new Proficiency[] {
                            new Proficiency(ProficiencyType.FORCA,0),
                            new Proficiency(ProficiencyType.VIDA, 1),
                            new Proficiency(ProficiencyType.INTELIGENCIA,4)
                    };
                    character.setRace(new Race("Elfo", proficienciesElf));

                    // Próximo passo
                    escolherClasse();
                    break;
                case 3:
                    // Criar raça Anão
                    Proficiency[] proficienciesHalfling = new Proficiency[] {
                            new Proficiency(ProficiencyType.FORCA,3),
                            new Proficiency(ProficiencyType.VIDA, 2),
                            new Proficiency(ProficiencyType.INTELIGENCIA,0)
                    };
                    character.setRace(new Race("Anão", proficienciesHalfling));

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
                    "\n1 - Guerreiro (Força: +3; Vida: +2; Inteligência: +0) " +
                    "\n2 - Mago (Força: +1; Vida: +1; Inteligência: +3) " +
                    "\n3 - Atirador (Força: +1; Vida: +2; Inteligência: +2) " +
                    "\nEscolha uma das classes acima (0 para cancelar): ");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 0:
                    break;
                case 1:
                    // Criar classe Guerreiro
                    Proficiency[] proficienciesWarrior = new Proficiency[] {
                            new Proficiency(ProficiencyType.FORCA,3),
                            new Proficiency(ProficiencyType.VIDA, 2),
                            new Proficiency(ProficiencyType.INTELIGENCIA,0)
                    };
                    character.setClasss(new characterClass("Guerreiro", proficienciesWarrior));

                    // Próximo passo
                    escolherEquipamento();
                    break;
                case 2:
                    // Criar classe Mago
                    Proficiency[] proficienciesWizard = new Proficiency[] {
                            new Proficiency(ProficiencyType.FORCA,1),
                            new Proficiency(ProficiencyType.VIDA, 1),
                            new Proficiency(ProficiencyType.INTELIGENCIA,3)
                    };
                    character.setClasss(new characterClass("Mago", proficienciesWizard));

                    // Próximo passo
                    escolherEquipamento();
                    break;
                case 3:
                    // Criar classe Atirador
                    Proficiency[] proficienciesADC = new Proficiency[] {
                            new Proficiency(ProficiencyType.FORCA,1),
                            new Proficiency(ProficiencyType.VIDA, 2),
                            new Proficiency(ProficiencyType.INTELIGENCIA,2)
                    };
                    character.setClasss(new characterClass("Atirador", proficienciesADC));

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

                    // Próximo passo
                    escolherNome();
                    break;
                case 2:
                    // Criar poder regeneração
                    character.setPower(new Power("Regeneração"));

                    // Próximo passo
                    escolherNome();
                    break;
                case 3:
                    // Criar poder proteção
                    character.setPower(new Power("Proteção"));

                    // Próximo passo
                    escolherNome();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while(opcao != 0);
    }

    public void escolherNome() {
        System.out.println("Escolha um nome para seu personagem: ");
        character.setName(scanner.nextLine());

        // Próximo passo
        escolherMissao();
    }

    public void escolherMissao() {
        System.out.println("Informe a missão do seu personagem: ");
        character.setMission(scanner.nextLine());

        // Próximo passo

    }

    public void escolherHistoria() {
        System.out.println("Informe a história do seu personagem: ");
        character.setHistory(scanner.nextLine());

        // Próximo passo

    }

    public void exibir() {
        System.out.println("--- FICHA ---");
        System.out.println("Nome: " + character.getName());
        System.out.println("Raça: " + character.getRace());
        System.out.println("Classe: " + character.getClass());
        System.out.println("Equipamento: " + character.getTool());
        System.out.println("Poder: " + character.getPower());
        System.out.println("História: " + character.getPower());
        System.out.println("Missão: " + character.getPower());


        break;
    }

}
