import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Preço R$.: ");
        double valorProduto = scanner.nextDouble();

        double[] descontos = new double[10];

        for (int i = 0; i < descontos.length; i++) {
            descontos[i] = (i + 1) * 0.05;
        }

        System.out.println("Promoção: " + nomeProduto);

        double subtotal = 0;

        for (int quantidade = 1; quantidade <= 10; quantidade++) {
            double valorDesconto = valorProduto * descontos[quantidade - 1];
            double valorUnitario = valorProduto - valorDesconto;
            subtotal = valorUnitario * quantidade;

            System.out.printf("%d x R$ %.2f = R$ %.2f\n", quantidade, valorUnitario, subtotal);
        }
    }
}