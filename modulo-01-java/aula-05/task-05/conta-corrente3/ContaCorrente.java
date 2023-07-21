public class ContaCorrente extends Conta implements Impressao {
    private double chequeEspecial = 200.0;

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void imprimir(){
        System.out.printf("Cliente: %s\n", super.getCliente().getNome());
        System.out.printf("Conta: %s\n", super.getNumeroConta());
        System.out.printf("Agencia: %d\n", super.getAgencia());
        System.out.println("Tipo Conta: Corrente");
    }

    @Override
    public boolean sacar(double valor){
        if (this.retornarSaldoComChequeEspecial() < valor){
            return false;
        }

        else if (valor < 0) {
            return false;
        }

        else {
            super.setSaldo(super.getSaldo() - valor);
        }

        return true;
    }

    public double retornarSaldoComChequeEspecial(){
        return super.getSaldo() + this.chequeEspecial;
    }
}
