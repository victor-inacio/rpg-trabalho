import java.util.Random;
import java.util.Scanner;

public class Game {
    private final RPGCharacter character;
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    public Game(RPGCharacter character) {
        this.character = character;
    }

    public void start() {
        System.out.println("Bem-vindo ao mundo de aventuras, " + character.getName() + "!");
        System.out.println("Você está em uma floresta mágica. À sua frente há três caminhos:");
        System.out.println("1. Caminho da Sabedoria");
        System.out.println("2. Caminho da Batalha");
        System.out.println("3. Caminho do Destino");

        int choice = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer

        switch (choice) {
            case 1:
                finalQuiz();
                break;
            case 2:
                finalBattle();
                break;
            case 3:
                finalRockPaperScissors();
                break;
            default:
                System.out.println("Escolha inválida. Fim de jogo.");
        }
    }

    private void finalQuiz() {
        System.out.println("Você escolheu o Caminho da Sabedoria. Prepare-se para um quiz!");
        String[][] questions = {
                {"Qual é a capital da França?", "Paris"},
                {"Quem escreveu 'Dom Quixote'?", "Miguel de Cervantes"},
                {"Qual é o maior planeta do sistema solar?", "Júpiter"}
        };

        int correctAnswers = 0;
        for (String[] question : questions) {
            System.out.println(question[0]);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(question[1])) {
                correctAnswers++;
            }
        }

        if (correctAnswers >= 2) {
            System.out.println("Parabéns! Você venceu o quiz e completou sua jornada com sucesso!");
        } else {
            System.out.println("Infelizmente, você não acertou perguntas suficientes. Fim de jogo.");
        }
    }

    private void finalBattle() {
        System.out.println("Você escolheu o Caminho da Batalha. Prepare-se para lutar!");
        int enemyLife = random.nextInt(10) + 1;
        int characterPower = character.getProficiencies()[0].getValue(); // Usando a força como poder

        while (enemyLife > 0 && characterPower > 0) {
            System.out.println("Você ataca o inimigo!");
            enemyLife -= characterPower;
            if (enemyLife <= 0) {
                System.out.println("Você venceu o inimigo! Parabéns!");
                return;
            }

            System.out.println("O inimigo ataca você!");
            characterPower -= random.nextInt(3); // Dano aleatório do inimigo
            if (characterPower <= 0) {
                System.out.println("Você foi derrotado pelo inimigo. Fim de jogo.");
                return;
            }
        }
    }

    private void finalRockPaperScissors() {
        System.out.println("Você escolheu o Caminho do Destino. Vamos jogar Pedra-Papel-Tesoura!");
        String[] choices = {"Pedra", "Papel", "Tesoura"};
        System.out.println("Escolha: 1. Pedra, 2. Papel, 3. Tesoura");
        int userChoice = scanner.nextInt() - 1;
        int computerChoice = random.nextInt(3);

        System.out.println("Você escolheu: " + choices[userChoice]);
        System.out.println("O computador escolheu: " + choices[computerChoice]);

        if (userChoice == computerChoice) {
            System.out.println("Empate! Vamos tentar novamente.");
            finalRockPaperScissors();
        } else if ((userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)) {
            System.out.println("Parabéns! Você venceu o jogo!");
        } else {
            System.out.println("Você perdeu o jogo. Fim de jogo.");
        }
    }
}
