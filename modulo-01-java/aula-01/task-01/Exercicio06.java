import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o número total de eleitores: ");
        int eleitores = scanner.nextInt();

        System.out.print("Votos em branco: ");
        int votosEmBranco = scanner.nextInt();

        System.out.print("Votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Votos válidos: ");
        int votosValidos = scanner.nextInt();

        double percentualEmBranco = (double) votosEmBranco / eleitores;
        double percentualNulos = (double) votosNulos / eleitores;
        double percentualValidos = (double) votosValidos / eleitores;

        System.out.printf("Percentual votos em branco: %.2f%%\n", percentualEmBranco * 100);
        System.out.printf("Percentual votos nulos: %.2f%%\n", percentualNulos * 100);
        System.out.printf("Percentual votos válidos: %.2f%%\n", percentualValidos * 100);
    }
}