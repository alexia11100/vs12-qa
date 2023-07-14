import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora de início do jogo: ");
        int horaInicio = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o minuto de início do jogo: ");
        int minutoInicio = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a hora de termino do jogo: ");
        int horaTermino = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o minuto de termino do jogo: ");
        int minutoTermino = scanner.nextInt();
        scanner.nextLine();

        int duracaoHoras;
        int duracaoMinutos;

        if (horaInicio <= horaTermino) {
            duracaoHoras = horaTermino - horaInicio;
            duracaoMinutos = minutoTermino - minutoInicio;
        }

        else {
            duracaoHoras = 24 - horaInicio + horaTermino;
            duracaoMinutos = minutoTermino - minutoInicio;
        }

        if (duracaoMinutos < 0) {
            duracaoHoras--;
            duracaoMinutos += 60;
        }

        if (duracaoHoras <= 24) {
            System.out.println("Duração do jogo: " + duracaoHoras + " horas e " + duracaoMinutos + " minutos.");
        }

        else {
            System.out.println("A duração de 24h foi excedida.");
        }
    }
}