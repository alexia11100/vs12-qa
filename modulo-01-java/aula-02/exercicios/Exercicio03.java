import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de inteiros que deseja adicionar: ");
        int quantidadeNumeros = scanner.nextInt();

        int[] listaNumeros = new int[quantidadeNumeros];

        double mediaNumeros = 0;
        for (int posicao = 0; posicao < listaNumeros.length; posicao++) {
            System.out.print("Digite um novo número: ");
            int novoNumero = scanner.nextInt();

            listaNumeros[posicao] = novoNumero;
            mediaNumeros += novoNumero;
        }

        mediaNumeros /= listaNumeros.length;
        System.out.println("A média dos valores é " + mediaNumeros);
    }
}
