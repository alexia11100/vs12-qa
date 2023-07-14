public class Exercicio04 {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int temporaria;

        temporaria = A;
        A = B;
        B = temporaria;

        System.out.printf("Valor de A: %d\nValor de B: %d", A, B);

    }
}
