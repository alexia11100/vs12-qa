package br.com.dbc.vemser;

public class Contato {
    private String descricao;
    private String telefone;
    private int tipo;

    public Contato(String descricao, String telefone, int tipo){
        this.descricao = descricao;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void imprimirContato(){
        System.out.printf("Descrição: %s\n", this.descricao);
        System.out.printf("Telefone: %s\n", this.telefone);
        switch (this.tipo) {
            case 1:
                System.out.println("Tipo: Residencial");
                break;
            case 2:
                System.out.println("Tipo: Comercial");
                break;
        }
    }
}
