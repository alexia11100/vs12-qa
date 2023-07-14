import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("1 - Bahia");
        System.out.println("2 - Amazonas");
        System.out.println("3 - Acre");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha uma das opção listada acima: ");
        String estado = scanner.nextLine();

        if (estado.equals("1")){
            System.out.println("1 - Salvador");
            System.out.println("2 - Utinga");

            System.out.print("Escolha uma das opção listada acima: ");
            String cidade = scanner.nextLine();

            if (cidade.equals("1")){
                System.out.println("População: 2.418.005 habitantes");
                System.out.println("Principal festa: Carnaval");
                System.out.println("IDH: 0,759");
            }

            else if (cidade.equals("2")){
                System.out.println("População: 19.256 habitantes");
                System.out.println("Principal festa: Aniversário da cidade (dias 27 e 30 de abril)");
                System.out.println("IDH: 0,590");
            }

            else{
                System.out.println("Opção não identificada.");
            }
        }

        else if (estado.equals("2")) {
            System.out.println("1 - Manaus");
            System.out.println("2 - Manacapuru");

            System.out.print("Escolha uma das opção listada acima: ");
            String cidade = scanner.nextLine();

            if (cidade.equals("1")) {
                System.out.println("População: 2.063.547 habitantes");
                System.out.println("Principal festa: Festival Folclórico de Parintins (último fim de semana de junho)");
                System.out.println("IDH: 0,737");
            }

            else if (cidade.equals("2")) {
                System.out.println("População: 98.502 habitantes");
                System.out.println("Principal festa: Festival de Cirandas");
                System.out.println("IDH: 0,614");
            }

            else {
                System.out.println("Opção não identificada.");
            }
        }

        else if (estado.equals("3")){
            System.out.println("1 - Rio Branco");
            System.out.println("2 - Brasiléia");

            System.out.print("Escolha uma das opção listada acima: ");
            String cidade = scanner.nextLine();

            if (cidade.equals("1")){
                System.out.println("População: 413.418 habitantes");
                System.out.println("Principal festa: Festa de São Sebastião (11 a 20 de janeiro)");
                System.out.println("IDH: 0,754");
            }

            else if (cidade.equals("2")){
                System.out.println("População:  26.702 habitantes");
                System.out.println("Principal festa: Aniversário da cidade (dias 1 e 2 de julho)");
                System.out.println("IDH: 0,590");
            }

            else{
                System.out.println("Opção não identificada.");
            }
        }

        else{
            System.out.println("Opção não identificada");
        }
    }
}
