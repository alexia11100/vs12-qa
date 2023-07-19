public class ContaCorrente extends Conta implements Impressao {
    private double chequeEspecial = 200.0;

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void imprimir(){
        System.out.printf("Cliente: %s\n", super.getCliente().getNome());
        System.out.printf("Conta: %s\n", super.getNumeroConta());
        System.out.printf("Agencia: %d\n", this.getAgencia());
        System.out.println("Tipo Conta: Corrente");
    }

    public double retornarSaldoComChequeEspecial(){
        return super.getSaldo() + this.chequeEspecial;
    }
}
