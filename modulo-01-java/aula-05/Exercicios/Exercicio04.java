import java.util.Scanner;
import java.util.Stack;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();

        System.out.println("Digite 15 números:");

        for (int i = 0; i < 15; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pilha.push(numero);
            } else {
                if (!pilha.isEmpty()) {
                    pilha.pop();
                }
            }
        }

        while (!pilha.isEmpty()) {
            System.out.println("Elemento retirado da pilha: " + pilha.pop());
        }
    }
}
