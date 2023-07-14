import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        String codigoProduto = scanner.nextLine();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        switch (codigoProduto) {
            case "ABCD":
                System.out.printf("Preço Total: R$ %.2f", quantidade*5.30);
                break;
            case "XYPK":
                System.out.printf("Preço Total: R$ %.2f", quantidade*6.00);
                break;
            case "KLMP":
                System.out.printf("Preço Total: R$ %.2f", quantidade*3.20);
                break;
            case "QRST":
                System.out.printf("Preço Total: R$ %.2f", quantidade*2.50);
                break;
            default:
                System.out.println("O código do produto requisitado não está no sistema.");
        }
    }
}
