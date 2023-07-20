import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Contato> contatos;
    private ArrayList<Endereco> enderecos;

    public Cliente(String nome, String cpf, ArrayList<Contato> contatos, ArrayList<Endereco> enderecos){
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

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void imprimirContatos(){
        if (this.contatos != null) {
            this.contatos.get(0).imprimirContato();
            this.contatos.get(1).imprimirContato();
        }
    }

    public void imprimirEnderecos(){
        if (this.enderecos != null) {
            this.enderecos.get(0).imprimirEndereco();
            this.enderecos.get(1).imprimirEndereco();
        }
    }

    public void imprimirCliente(){
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("CPF: %s\n", this.cpf);
    }
}
