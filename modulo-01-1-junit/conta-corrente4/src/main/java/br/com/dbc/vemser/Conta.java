package br.com.dbc.vemser;

public class Conta implements Movimentacao{
    private Cliente cliente;
    private String numeroConta;
    private int agencia;
    private double saldo = 0.0;

    public Cliente getCliente() {
        return cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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

    public boolean transferir(Conta contaDestino, double valor){
        if (this.saldo < valor){
            return false;
        }

        else if (valor < 0) {
            return false;
        }

        else {
            this.saldo -= valor;
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        }

        return true;
    }
}
