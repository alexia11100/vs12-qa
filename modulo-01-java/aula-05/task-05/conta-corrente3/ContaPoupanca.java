public class ContaPoupanca extends Conta implements Impressao {
    static final double JUROS_MENSAL = 1.01;

    public void imprimir() {
        System.out.printf("Cliente: %s\n", super.getCliente().getNome());
        System.out.printf("Conta: %s\n", super.getNumeroConta());
        System.out.printf("Agencia: %d\n", super.getAgencia());
        System.out.println("Tipo Conta: Poupança");
    }
    public void creditarTaxa(){
        super.setSaldo(super.getSaldo() * JUROS_MENSAL);
    }
}
