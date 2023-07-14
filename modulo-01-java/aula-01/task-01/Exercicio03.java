import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Português para inglês");
        System.out.println("2 - Inglês para português");

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            System.out.print("Agora digite a palavra em português: ");
            String palavra = scanner.nextLine();

            switch (palavra) {
                case "Cachorro":
                    System.out.println("Dog");
                    break;
                case "Tempo":
                    System.out.println("Time");
                    break;
                case "Amor":
                    System.out.println("Love");
                    break;
                case "Cidade":
                    System.out.println("City");
                    break;
                case "Feliz":
                    System.out.println("Happy");
                    break;
                case "Triste":
                    System.out.println("Sad");
                    break;
                case "Deveria":
                    System.out.println("Should");
                    break;
                case "Poderia":
                    System.out.println("Could");
                    break;
                default:
                    System.out.println("Palavra não encontrada.");
            }
        }

        else if (opcao == 2) {
            System.out.print("Now type the word in english: ");
            String word = scanner.nextLine();

            switch (word) {
                case "Dog":
                    System.out.println("Cachorro");
                    break;
                case "Time":
                    System.out.println("Tempo");
                    break;
                case "Love":
                    System.out.println("Amor");
                    break;
                case "City":
                    System.out.println("Cidade");
                    break;
                case "Happy":
                    System.out.println("Feliz");
                    break;
                case "Sad":
                    System.out.println("Triste");
                    break;
                case "Should":
                    System.out.println("Deveria");
                    break;
                case "Could":
                    System.out.println("Poderia");
                    break;
                default:
                    System.out.println("Word not found.");
            }
        }

        else{
            System.out.println("Palavra não encontrada.");
        }
    }
}
