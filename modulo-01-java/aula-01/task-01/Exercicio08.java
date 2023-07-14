import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o salário do funcionário: ");
        double salario = scanner.nextFloat();

        System.out.print("Escreva o código referente ao cargo do funcionário: ");
        int codigoCargo = scanner.nextInt();

        double novoSalario;
        switch (codigoCargo) {
            case 101:
                novoSalario = salario + (salario*0.10);
                System.out.printf("Salário Antigo: R$ %.2f\n", salario);
                System.out.printf("Novo Salário: R$ %.2f\n", novoSalario);
                System.out.printf("Diferença: R$ %.2f\n", novoSalario - salario);
                break;
            case 102:
                novoSalario = salario + (salario*0.20);
                System.out.printf("Salário Antigo: R$ %.2f\n", salario);
                System.out.printf("Novo Salário: R$ %.2f\n", novoSalario);
                System.out.printf("Diferença: R$ %.2f\n", novoSalario - salario);
                break;
            case 103:
                novoSalario = salario + (salario*0.30);
                System.out.printf("Salário Antigo: R$ %.2f\n", salario);
                System.out.printf("Novo Salário: R$ %.2f\n", novoSalario);
                System.out.printf("Diferença: R$ %.2f\n", novoSalario - salario);
                break;
            default:
                novoSalario = salario + (salario*0.40);
                System.out.printf("Salário Antigo: R$ %.2f\n", salario);
                System.out.printf("Novo Salário: R$ %.2f\n", novoSalario);
                System.out.printf("Diferença: R$ %.2f\n", novoSalario - salario);
                break;
        }
    }
}
