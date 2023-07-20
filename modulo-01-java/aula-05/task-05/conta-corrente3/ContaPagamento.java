public class ContaPagamento extends Conta implements Impressao{
    static final double TAXA_SAQUE = 4.25;

    @Override
    public boolean sacar(double valor){
        if (super.getSaldo() < (valor + TAXA_SAQUE)){
            return false;
        }

        else if (valor < 0) {
            return false;
        }

        else {
            super.setSaldo(super.getSaldo() - (valor + TAXA_SAQUE));
        }

        return true;
    }

    public void imprimir(){
        System.out.printf("Cliente: %s\n", super.getCliente().getNome());
        System.out.printf("Conta: %s\n", super.getNumeroConta());
        System.out.printf("Agencia: %d\n", super.getAgencia());
        System.out.println("Tipo Conta: Pagamento");
    }
}
