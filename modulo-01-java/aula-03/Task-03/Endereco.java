public class Endereco {
    int tipo;
    String logradouro;
    int numero;
    String complemento;
    String cep;
    String cidade;
    String estado;
    String pais;

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

    public void imprimirEndereco(){
        System.out.printf("Tipo: %d\n", this.tipo);
        System.out.printf("Logradouro: %s\n", this.logradouro);
        System.out.printf("Número: %d\n", this.numero);
        System.out.printf("Complemento: %s\n", this.complemento);
        System.out.printf("CEP: %s\n", this.cep);
        System.out.printf("Cidade: %s\n", this.cidade);
        System.out.printf("Estado: %s\n", this.estado);
        System.out.printf("País: %s\n", this.pais);
    }
}
