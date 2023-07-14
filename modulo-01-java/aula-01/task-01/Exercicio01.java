import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite seu estado: ");
        String estado = scanner.nextLine();

        System.out.printf("Olá, seu nome é %s, você tem %d anos, é da cidade de %s, situada no estado de %s\n", nome, idade, cidade, estado);
    }
}
