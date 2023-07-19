public class Cliente {
    private String nome;
    private String cpf;
    private Contato[] contatos;
    private Endereco[] enderecos;

    public Cliente(String nome, String cpf, Contato[] contatos, Endereco[] enderecos){
        this.nome = nome;
        this.cpf = cpf;
        this.contatos = contatos;
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public Endereco[] getEnderecos() {
        return enderecos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }

    public void imprimirContatos(){
        if (this.contatos != null) {
            this.contatos[0].imprimirContato();
            this.contatos[1].imprimirContato();
        }
    }

    public void imprimirEnderecos(){
        if (this.enderecos != null) {
            this.enderecos[0].imprimirEndereco();
            this.enderecos[1].imprimirEndereco();
        }
    }

    public void imprimirCliente(){
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("CPF: %s\n", this.cpf);
    }
}
