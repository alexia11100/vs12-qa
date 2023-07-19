public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String whatsapp;

    public Pessoa() {}

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setWhatsapp(String whatsapp) {
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