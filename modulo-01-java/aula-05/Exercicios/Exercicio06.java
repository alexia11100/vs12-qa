import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}

public class Exercicio06 {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(new Pessoa("Alice", 25));
        listaPessoas.add(new Pessoa("Alice", 12));
        listaPessoas.add(new Pessoa("João", 20));
        listaPessoas.add(new Pessoa("Maria", 30));
        listaPessoas.add(new Pessoa("Zoe", 22));

        System.out.println("Ordenado por nome (crescente):");
        Collections.sort(listaPessoas, Comparator.comparing(Pessoa::getNome));
        listaPessoas.forEach(System.out::println);

        System.out.println("\nOrdenado por idade (do mais velho para o mais novo):");
        Collections.sort(listaPessoas, Comparator.comparing(Pessoa::getIdade).reversed());
        listaPessoas.forEach(System.out::println);

        System.out.println("\nOrdenado por nome e por idade caso nomes sejam iguais:");
        Collections.sort(listaPessoas, Comparator.comparing(Pessoa::getNome).thenComparing(Pessoa::getIdade));
        listaPessoas.forEach(System.out::println);
    }
}