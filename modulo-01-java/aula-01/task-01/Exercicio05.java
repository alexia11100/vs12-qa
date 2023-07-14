import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base: ");
        int base = scanner.nextInt();

        System.out.print("Altura: ");
        int altura = scanner.nextInt();

        System.out.printf("Area: %d\n", base*altura);
    }
}
