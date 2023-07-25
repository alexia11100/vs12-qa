package br.com.dbc.vemser;

public class Endereco {
    private int tipo;
    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(int tipo, String logradouro, int numero, String complemento, String cep, String cidade, String estado, String pais){
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public int getTipo() {
        return tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void imprimirEndereco(){
        switch(this.tipo) {
            case 1:
                System.out.println("Tipo: Residencial");
                break;
            case 2:
                System.out.println("Tipo: Comercial");
                break;
        }
        System.out.printf("Logradouro: %s\n", this.logradouro);
        System.out.printf("Número: %d\n", this.numero);
        System.out.printf("Complemento: %s\n", this.complemento);
        System.out.printf("CEP: %s\n", this.cep);
        System.out.printf("Cidade: %s\n", this.cidade);
        System.out.printf("Estado: %s\n", this.estado);
        System.out.printf("País: %s\n", this.pais);
    }
}
