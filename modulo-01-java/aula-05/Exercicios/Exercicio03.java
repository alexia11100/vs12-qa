import java.util.LinkedList;
import java.util.Queue;

public class Exercicio03 {
    public static void main(String[] args) {
        Queue<Integer> filaSenhas = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            filaSenhas.add(i);
        }

        System.out.println("Fila de senhas inicial: " + filaSenhas);

        for (int i = 0; i < 2; i++) {
            int senhaAtendida = filaSenhas.poll();
            System.out.println("Pessoa atendida com senha: " + senhaAtendida);
        }

        int senhaAtendida = filaSenhas.poll();
        System.out.println("Pessoa atendida com senha: " + senhaAtendida);

        for (int i = 6; i <= 8; i++) {
            filaSenhas.add(i);
        }

        for (int i = 0; i < 3; i++) {
            senhaAtendida = filaSenhas.poll();
            System.out.println("Pessoa atendida com senha: " + senhaAtendida);
        }

        System.out.println("Fila de senhas final: " + filaSenhas);
    }
}