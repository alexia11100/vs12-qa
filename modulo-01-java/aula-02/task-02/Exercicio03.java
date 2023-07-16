import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        double altura, maiorAltura = 0;
        int idade, maiorIdade = 0, quantidadeJogadores = 0;
        double peso, maiorPeso = 0;
        double somaAlturas = 0;

        System.out.println("Cadastro de Jogadores de Basquete");
        System.out.println("Digite SAIR no nome para encerrar o cadastro.");

        while (true) {
            System.out.print("Nome do jogador: ");
            nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Altura (ex: 1,92): ");
            altura = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Idade: ");
            idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Peso (ex: 87,40): ");
            peso = scanner.nextDouble();
            scanner.nextLine();

            quantidadeJogadores++;
            somaAlturas += altura;

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (peso > maiorPeso) {
                maiorPeso = peso;
            }
        }

        double mediaAlturas = somaAlturas / quantidadeJogadores;

        System.out.println("\n----- Informações dos Jogadores -----");
        System.out.println("Quantidade de jogadores cadastrados: " + quantidadeJogadores);
        System.out.println("Altura do maior jogador: " + maiorAltura + " metros");
        System.out.println("Jogador mais velho: " + maiorIdade + " anos");
        System.out.println("Jogador mais pesado: " + maiorPeso + " kg");
        System.out.println("Média das alturas dos jogadores: " + mediaAlturas + " metros");
    }
}