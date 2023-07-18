import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 2, 4, 6, 6, 24, 5, 2, 10};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Diga um número: ");
        int numeroUsuario = scanner.nextInt();

        int contadorIgual = 0;
        int contadorMenor = 0;
        int contadorMaior = 0;
        for (int numero : numeros) {
            if (numero == numeroUsuario) {
                contadorIgual += 1;
            }

            else if (numero < numeroUsuario) {
                contadorMenor += 1;
            }

            else if (numero > numeroUsuario) {
                contadorMaior += 1;
            }
        }

        System.out.printf("Quantidade de numeros iguais %d\n", contadorIgual);
        System.out.printf("Quantidade de numeros menores %d\n", contadorMenor);
        System.out.printf("Quantidade de numeros maiores %d\n", contadorMaior);
    }
}