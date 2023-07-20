import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> cadastroPessoas = new HashMap<>();

        System.out.println("Cadastro de Pessoas");
        System.out.println("Digite 'sair' no CPF para encerrar o cadastro.");


        while (true) {
            System.out.print("Digite o CPF: ");
            String cpf = scanner.nextLine();

            if (cpf.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            cadastroPessoas.put(cpf, nome);
        }


        System.out.print("Digite o CPF que deseja consultar/remover: ");
        String cpfConsulta = scanner.nextLine();

        String nomePessoa = cadastroPessoas.get(cpfConsulta);

        if (nomePessoa != null) {
            System.out.println("Nome da pessoa com CPF " + cpfConsulta + ": " + nomePessoa);
            cadastroPessoas.remove(cpfConsulta);
            System.out.println("CPF removido do cadastro.");
        } else {
            System.out.println("CPF não encontrado no cadastro.");
        }


        System.out.println("Conteúdo do Mapa (Cadastro de Pessoas):");
        for (Map.Entry<String, String> entry : cadastroPessoas.entrySet()) {
            System.out.println("CPF: " + entry.getKey() + ", Nome: " + entry.getValue());
        }
    }
}
