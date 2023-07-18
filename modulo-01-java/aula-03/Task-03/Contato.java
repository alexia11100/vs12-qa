public class Contato {
    String descricao;
    String telefone;
    int tipo;

    public Contato(String descricao, String telefone, int tipo){
        this.descricao = descricao;
        this.telefone = telefone;
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
