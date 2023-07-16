import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][4];

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Digite o número da matrícula: ");
            int matriculaNum = scanner.nextInt();

            matriz[i][0] = matriculaNum;

            System.out.print("Digite a média das provas: ");
            double mediaProvas = scanner.nextDouble();

            matriz[i][1] = (int) mediaProvas;

            System.out.print("Digite o média dos trabalhos: ");
            double mediaTrabalhos = scanner.nextDouble();

            matriz[i][2] = (int) mediaTrabalhos;

            double notaFinal = (mediaProvas * 0.6) + (mediaTrabalhos * 0.4);

            matriz[i][3] = (int) notaFinal;
        }

        int maiorNotaFinal = matriz[0][3];
        int matriculaMaiorNotaFinal = matriz[0][0];
        double mediaNotasFinais = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][3] > maiorNotaFinal) {
                maiorNotaFinal = matriz[i][3];
                matriculaMaiorNotaFinal = matriz[i][0];
            }

            mediaNotasFinais += matriz[i][3];
        }
        mediaNotasFinais /= 5;

        System.out.printf("A maior nota final foi %d da matrícula %d.\n", maiorNotaFinal, matriculaMaiorNotaFinal);
        System.out.println("A média das notas finais foi de " + mediaNotasFinais);
    }
}
