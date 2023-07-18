public class Cliente {
    String nome;
    String cpf;
    Contato[] contatos;
    Endereco[] enderecos;

    public Cliente(String nome, String cpf, Contato[] contatos, Endereco[] enderecos){
        this.nome = nome;
        this.cpf = cpf;
        this.contatos = contatos;
        this.enderecos = enderecos;
    }

    public void imprimirContatos(){
        this.contatos[0].imprimirContato();
        this.contatos[1].imprimirContato();
    }

    public void imprimirEnderecos(){
        this.enderecos[0].imprimirEndereco();
        this.enderecos[1].imprimirEndereco();
    }

    public void imprimirCliente(){
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("CPF: %s\n", this.cpf);
    }
}
