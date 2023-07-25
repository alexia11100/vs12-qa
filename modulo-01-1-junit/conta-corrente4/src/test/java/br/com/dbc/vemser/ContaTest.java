package br.com.dbc.vemser;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    private static Cliente clienteTeste1;
    private static Cliente clienteTeste2;
    
    @BeforeAll
    public static void setUp() {
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

        clienteTeste1 = new Cliente("Fulano", "000.000.000-00", contatosFulano, enderecosFulano);

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

        clienteTeste2 = new Cliente("Cicrano", "111.111.111-11", contatosCicrano, enderecosCicrano);
    }

    @Test
    @DisplayName("Ao tentar sacar 100 da conta, o saldo deve ficar de -100")
    void deveTestarSaqueContaCorrenteEVerificarSaldoComSucesso() {
        ContaCorrente correnteFulano = new ContaCorrente();
        correnteFulano.setAgencia(1);
        correnteFulano.setNumeroConta("1111");
        correnteFulano.setCliente(clienteTeste1);
        correnteFulano.setChequeEspecial(200.00);
        correnteFulano.setSaldo(0.0);

        correnteFulano.sacar(100);
        assertEquals(-100, correnteFulano.getSaldo());
    }

    @Test
    @DisplayName("Ao tentar sacar 500 com um saldo + ce total de 200.0, deve retornar false")
    void deveTestarSaqueContaCorrenteSemSaldo() {
        ContaCorrente correnteFulano = new ContaCorrente();
        correnteFulano.setAgencia(1);
        correnteFulano.setNumeroConta("1111");
        correnteFulano.setCliente(clienteTeste1);
        correnteFulano.setChequeEspecial(200.00);
        correnteFulano.setSaldo(0.0);

        assertFalse(correnteFulano.sacar(500));
    }

    @Test
    @DisplayName("Ao tentar sacar 50 do saldo após creditar a taxa, deve ter 51.0 de saldo")
    void deveTestarSaqueContaPoupancaEVerificarSaldoComSucesso() {
        ContaPoupanca poupancaCicrano = new ContaPoupanca();
        poupancaCicrano.setAgencia(2);
        poupancaCicrano.setNumeroConta("1111");
        poupancaCicrano.setCliente(clienteTeste2);
        poupancaCicrano.setSaldo(100.0);
        poupancaCicrano.creditarTaxa();

        poupancaCicrano.sacar(50.0);
        assertEquals(51.0, poupancaCicrano.getSaldo());
    }

    @Test
    @DisplayName("Não pode sacar valor maior que saldo poupança")
    void deveTestarSaqueContaPoupancaSemSaldo() {
        ContaPoupanca poupancaCicrano = new ContaPoupanca();
        poupancaCicrano.setAgencia(2);
        poupancaCicrano.setNumeroConta("1111");
        poupancaCicrano.setCliente(clienteTeste2);
        poupancaCicrano.setSaldo(100.0);
        poupancaCicrano.creditarTaxa();
        
        assertFalse(poupancaCicrano.sacar(200));
    }

    @Test
    @DisplayName("Conta Pagamento deve sacar aplicando a taxa de saque corretamente")
    void deveTestarSaqueContaPagamentoEVerificarSaldoComSucesso() {
        ContaPagamento pagamentoFulano = new ContaPagamento();
        pagamentoFulano.setAgencia(1);
        pagamentoFulano.setNumeroConta("2222");
        pagamentoFulano.setCliente(clienteTeste1);
        pagamentoFulano.setSaldo(50.0);

        pagamentoFulano.sacar(10);
        assertEquals(35.75, pagamentoFulano.getSaldo());
    }

    @Test
    @DisplayName("Conta Pagamento não deve sacar valor acima do saldo + taxa")
    void deveTestarSaqueContaPagamentoSemSaldo() {
        ContaPagamento pagamentoFulano = new ContaPagamento();
        pagamentoFulano.setAgencia(1);
        pagamentoFulano.setNumeroConta("2222");
        pagamentoFulano.setCliente(clienteTeste1);
        pagamentoFulano.setSaldo(50.0);

        assertFalse(pagamentoFulano.sacar(48));
    }

    @Test
    @DisplayName("Verifica transferencia entre duas contas diferentes")
    void deveTestarTransferenciaEVerificarSaldoComSucesso() {
        ContaCorrente correnteFulano = new ContaCorrente();
        correnteFulano.setAgencia(1);
        correnteFulano.setNumeroConta("1111");
        correnteFulano.setCliente(clienteTeste1);
        correnteFulano.setChequeEspecial(200.00);
        correnteFulano.setSaldo(500.00);

        ContaPagamento pagamentoFulano = new ContaPagamento();
        pagamentoFulano.setAgencia(1);
        pagamentoFulano.setNumeroConta("2222");
        pagamentoFulano.setCliente(clienteTeste1);
        pagamentoFulano.setSaldo(50.0);

        correnteFulano.transferir(pagamentoFulano, 200);
        assertEquals(500 - 200, correnteFulano.getSaldo());
        assertEquals(50 + 200, pagamentoFulano.getSaldo());
    }

    @Test
    @DisplayName("Não pode transferir valor acima do saldo disponível")
    void deveTestarTransferenciaSemSaldo() {
        ContaCorrente correnteFulano = new ContaCorrente();
        correnteFulano.setAgencia(1);
        correnteFulano.setNumeroConta("1111");
        correnteFulano.setCliente(clienteTeste1);
        correnteFulano.setChequeEspecial(200.00);
        correnteFulano.setSaldo(500.00);

        ContaPagamento pagamentoFulano = new ContaPagamento();
        pagamentoFulano.setAgencia(1);
        pagamentoFulano.setNumeroConta("2222");
        pagamentoFulano.setCliente(clienteTeste1);
        pagamentoFulano.setSaldo(50.0);

        assertFalse(correnteFulano.transferir(pagamentoFulano, 800));
    }

    @Test
    @DisplayName("Realizando deposito e verificando se o valor foi somado ao saldo")
    void deveTestarDepositoEVerificarSaldoComSucesso() {
        ContaPoupanca poupancaCicrano = new ContaPoupanca();
        poupancaCicrano.setAgencia(2);
        poupancaCicrano.setNumeroConta("1111");
        poupancaCicrano.setCliente(clienteTeste2);
        poupancaCicrano.setSaldo(100.0);
        poupancaCicrano.creditarTaxa();

        poupancaCicrano.depositar(200);
        assertEquals(301, poupancaCicrano.getSaldo());
    }

    @Test
    @DisplayName("Não pode realizar depósito negativo")
    void deveTestarDepositoNegativo() {
        ContaPoupanca poupancaCicrano = new ContaPoupanca();
        poupancaCicrano.setAgencia(2);
        poupancaCicrano.setNumeroConta("1111");
        poupancaCicrano.setCliente(clienteTeste2);
        poupancaCicrano.setSaldo(100.0);
        poupancaCicrano.creditarTaxa();

        assertFalse(poupancaCicrano.depositar(-200));
    }
}