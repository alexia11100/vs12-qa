import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de identificação do aluno: ");
        int alunoID = Integer.parseInt(scanner.nextLine());

        System.out.print("Nota número 1: ");
        double notaUm = Double.parseDouble(scanner.nextLine());

        System.out.print("Nota número 2: ");
        double notaDois = Double.parseDouble(scanner.nextLine());

        System.out.print("Nota número 3: ");
        double notaTres = Double.parseDouble(scanner.nextLine());

        System.out.print("Média exercícios: ");
        double mediaExercicios = Double.parseDouble(scanner.nextLine());

        double mediaAproveitamento = (notaUm + notaDois*2 + notaTres*3 + mediaExercicios)/7;

        if (mediaAproveitamento < 4.0) {
            System.out.printf("Identificação Aluno: %d\n", alunoID);
            System.out.printf("Notas: %.2f %.2f %.2f\n", notaUm, notaDois, notaTres);
            System.out.printf("Média dos Exercícios: %.2f\n", mediaExercicios);
            System.out.printf("Média de Aproveitamento: %.2f\n", mediaAproveitamento);
            System.out.print("Conceito: E\n");
            System.out.print("Resultado Final: REPROVADO\n");
        }

        else if(mediaAproveitamento < 6.0) {
            System.out.printf("Identificação Aluno: %d\n", alunoID);
            System.out.printf("Notas: %.2f %.2f %.2f\n", notaUm, notaDois, notaTres);
            System.out.printf("Média dos Exercícios: %.2f\n", mediaExercicios);
            System.out.printf("Média de Aproveitamento: %.2f\n", mediaAproveitamento);
            System.out.print("Conceito: D\n");
            System.out.print("Resultado Final: REPROVADO\n");
        }

        else if(mediaAproveitamento < 7.5) {
            System.out.printf("Identificação Aluno: %d\n", alunoID);
            System.out.printf("Notas: %.2f %.2f %.2f\n", notaUm, notaDois, notaTres);
            System.out.printf("Média dos Exercícios: %.2f\n", mediaExercicios);
            System.out.printf("Média de Aproveitamento: %.2f\n", mediaAproveitamento);
            System.out.print("Conceito: C\n");
            System.out.print("Resultado Final: APROVADO\n");
        }

        else if(mediaAproveitamento < 9.0) {
            System.out.printf("Identificação Aluno: %d\n", alunoID);
            System.out.printf("Notas: %.2f %.2f %.2f\n", notaUm, notaDois, notaTres);
            System.out.printf("Média dos Exercícios: %.2f\n", mediaExercicios);
            System.out.printf("Média de Aproveitamento: %.2f\n", mediaAproveitamento);
            System.out.print("Conceito: B\n");
            System.out.print("Resultado Final: APROVADO\n");
        }

        else {
            System.out.printf("Identificação Aluno: %d\n", alunoID);
            System.out.printf("Notas: %.2f %.2f %.2f\n", notaUm, notaDois, notaTres);
            System.out.printf("Média dos Exercícios: %.2f\n", mediaExercicios);
            System.out.printf("Média de Aproveitamento: %.2f\n", mediaAproveitamento);
            System.out.print("Conceito: A\n");
            System.out.print("Resultado Final: APROVADO\n");
        }
    }
}