import java.util.ArrayList;

public class Exercicio02{
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Breno");
        nomes.add("Alexia");
        nomes.add("Ted");
        nomes.add("Hanna");

        int tamanhoLista = nomes.size();

        System.out.println(nomes.get(tamanhoLista - 2));
        System.out.println(nomes.get(0));
        nomes.remove(tamanhoLista - 1);

        for (String nome : nomes){
            System.out.println(nome);
        }

        System.out.println(nomes.size());
    }
}