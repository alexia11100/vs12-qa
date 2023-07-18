public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    String whatsapp;

    public Pessoa(String nome, String sobrenome, int idade, String whatsapp) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.whatsapp = whatsapp;
    }

    public void conversar(Pessoa pessoa) {
        System.out.println(this.nome + " conversou com " + pessoa.nome);
    }

    public String retornarNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    public boolean ehMaiorIdade() {
        return this.idade > 18;
    }

    public void mandarWhatsApp(Pessoa pessoa, String mensagem) {
        System.out.println(this.nome + " enviou: " + mensagem + " para " + pessoa.nome);
    }
}