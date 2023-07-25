package br.com.dbc.vemser;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> contasFulano = constroiClienteFulano();
        ArrayList<Conta> contasCicrano = constroiClienteCicrano();

        System.out.println("Testando conta de fulano");
        testaContaCorrenteFulano((ContaCorrente) contasFulano.get(0), contasCicrano.get(0));
        testaContaPagamentoFulano((ContaPagamento) contasFulano.get(1), contasCicrano.get(0));

        System.out.println("Testando conta de cicrano");
        testaContaPoupancaCicrano((ContaPoupanca) contasCicrano.get(0), contasFulano.get(1));
    }

    public static ArrayList<Conta> constroiClienteFulano() {
        Contato contatoFulano1 = new Contato("Telefone pessoal", "111111111", 1);
        Contato contatoFulano2 = new Contato("Telefone comercial", "222222222", 2);
        ArrayList<Contato> contatosFulano = new ArrayList<>();
        contatosFulano.add(contatoFulano1);
        contatosFulano.add(contatoFulano2);

        Endereco enderecoFulano1 = new Endereco(1, "Rua A", 1, "Apartamento", "11111111", "Fulanocity", "Fulanostate", "Fulanolandia");
        Endereco enderecoFulano2 = new Endereco(2, "Rua B", 2, "Casa", "22222222", "Fulanocity", "Fulanostate", "Fulanolandia");
        ArrayList<Endereco> enderecosFulano = new ArrayList<>();
        enderecosFulano.add(enderecoFulano1);
        enderecosFulano.add(enderecoFulano2);

        Cliente fulano = new Cliente("Fulano", "000.000.000-00", contatosFulano, enderecosFulano);

        ContaCorrente correnteFulano = new ContaCorrente();
        correnteFulano.setAgencia(1);
        correnteFulano.setNumeroConta("1111");
        correnteFulano.setCliente(fulano);
        correnteFulano.setChequeEspecial(200.00);
        correnteFulano.setSaldo(0.0);

        ContaPagamento pagamentoFulano = new ContaPagamento();
        pagamentoFulano.setAgencia(1);
        pagamentoFulano.setNumeroConta("2222");
        pagamentoFulano.setCliente(fulano);
        pagamentoFulano.setSaldo(0.0);

        ArrayList<Conta> contasFulano = new ArrayList<>();
        contasFulano.add(correnteFulano);
        contasFulano.add(pagamentoFulano);

        return contasFulano;
    }

    public static void testaContaCorrenteFulano(ContaCorrente correnteFulano, Conta contaCicrano) {
        correnteFulano.imprimir();
        System.out.printf("%.2f\n", correnteFulano.retornarSaldoComChequeEspecial());

        correnteFulano.depositar(500);
        System.out.printf("%.2f\n", correnteFulano.retornarSaldoComChequeEspecial());

        correnteFulano.transferir(contaCicrano, 400);
        System.out.printf("%.2f\n", correnteFulano.retornarSaldoComChequeEspecial());

        correnteFulano.sacar(200);
        System.out.printf("%.2f\n", correnteFulano.retornarSaldoComChequeEspecial());
    }

    public static void testaContaPagamentoFulano(ContaPagamento pagamentoFulano, Conta contaCicrano) {
        pagamentoFulano.imprimir();
        System.out.printf("%.2f\n", pagamentoFulano.getSaldo());

        pagamentoFulano.depositar(50);
        System.out.printf("%.2f\n", pagamentoFulano.getSaldo());

        pagamentoFulano.transferir(contaCicrano, 20);
        System.out.printf("%.2f\n", pagamentoFulano.getSaldo());

        pagamentoFulano.sacar(20);
        System.out.printf("%.2f\n", pagamentoFulano.getSaldo());
    }

    public static ArrayList<Conta> constroiClienteCicrano(){
        Contato contatoCicrano1 = new Contato("Telefone pessoal", "333333333", 1);
        Contato contatoCicrano2 = new Contato("Telefone comercial", "444444444", 2);
        ArrayList<Contato> contatosCicrano = new ArrayList<>();
        contatosCicrano.add(contatoCicrano1);
        contatosCicrano.add(contatoCicrano2);

        Endereco enderecoCicrano1 = new Endereco(1, "Rua C", 3, "Apartamento", "33333333", "Fulanocity", "Fulanostate", "Fulanolandia");
        Endereco enderecoCicrano2 = new Endereco(2, "Rua D", 4, "Casa", "44444444", "Fulanocity", "Fulanostate", "Fulanolandia");
        ArrayList<Endereco> enderecosCicrano = new ArrayList<>();
        enderecosCicrano.add(enderecoCicrano1);
        enderecosCicrano.add(enderecoCicrano2);

        Cliente cicrano = new Cliente("Cicrano", "111.111.111-11", contatosCicrano, enderecosCicrano);

        ContaPoupanca poupancaCicrano = new ContaPoupanca();
        poupancaCicrano.setAgencia(2);
        poupancaCicrano.setNumeroConta("1111");
        poupancaCicrano.setCliente(cicrano);
        poupancaCicrano.setSaldo(0.0);

        ArrayList<Conta> contasCicrano = new ArrayList<>();
        contasCicrano.add(poupancaCicrano);

        return contasCicrano;
    }

    public static void testaContaPoupancaCicrano(ContaPoupanca contaCicrano, Conta contaFulano){
        contaCicrano.imprimir();
        System.out.printf("%.2f\n", contaCicrano.getSaldo());

        contaCicrano.depositar(200);
        System.out.printf("%.2f\n", contaCicrano.getSaldo());

        contaCicrano.creditarTaxa();
        System.out.printf("%.2f\n", contaCicrano.getSaldo());

        contaCicrano.transferir(contaFulano, 100);
        System.out.printf("%.2f\n", contaCicrano.getSaldo());

        contaCicrano.sacar(100);
        System.out.printf("%.2f\n", contaCicrano.getSaldo());
    }
}
