import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jogador1 digite um número para o Jogador2 adivinhar(ele não pode ver): ");
        int numeroEscolhido = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

        int numeroPalpite;
        do {
            System.out.print("Jogador2 adivinhe o número escolhido pelo Jogador1: ");
            numeroPalpite = scanner.nextInt();

            if (numeroPalpite < numeroEscolhido) {
                System.out.println("O número a ser encontrado é maior do que você digitou.");
            } else if (numeroPalpite > numeroEscolhido) {
                System.out.println("O número a ser encontrado é menor do que você digitou.");
            }
        } while (numeroPalpite!=numeroEscolhido);

        System.out.println("O número palpitado está correto, parabéns!");
    }
}