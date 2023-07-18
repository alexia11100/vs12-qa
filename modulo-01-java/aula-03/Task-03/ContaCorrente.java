public class ContaCorrente {
    Cliente cliente;
    String numeroConta;
    int agencia;
    double saldo = 0.0;
    double chequeEspecial = 200.0;

    public ContaCorrente(Cliente cliente, String numeroConta, int agencia){
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    public void imprimirContaCorrente(){
        System.out.printf("Cliente: %s\n", this.cliente.nome);
        System.out.printf("Conta: %s\n", this.numeroConta);
        System.out.printf("Agencia: %d\n", this.agencia);
    }

    public boolean sacar(double valor){
        if (this.saldo < valor){
            return false;
        }

        else if (valor < 0) {
            return false;
        }

        else {
            this.saldo -= valor;
        }

        return true;
    }

    public boolean depositar(double valor){
        if (valor < 0) {
            return false;
        }

        else {
            this.saldo += valor;
            return true;
        }
    }

    public double retornarSaldoComChequeEspecial(){
        return this.saldo + this.chequeEspecial;
    }

    public boolean tranferir(ContaCorrente contaDestino, double valor){
        if (this.saldo < valor){
            return false;
        }

        else if (valor < 0) {
            return false;
        }

        else {
            this.saldo -= valor;
            contaDestino.saldo += valor;
        }

        return true;
    }
}
