public class Main {
    public static void main(String[] args) {
        Contato contatoFulano1 = new Contato("Telefone pessoal", "111111111", 1);
        Contato contatoFulano2 = new Contato("Telefone comercial", "222222222", 2);
        Endereco enderecoFulano1 = new Endereco(1, "Rua A", 1, "Apartamento", "11111111", "Fulanocity", "Fulanostate", "Fulanolandia");
        Endereco enderecoFulano2 = new Endereco(2, "Rua B", 2, "Casa", "22222222", "Fulanocity", "Fulanostate", "Fulanolandia");
        Contato[] contatosFulano = {contatoFulano1, contatoFulano2};
        Endereco[] enderecosFulano = {enderecoFulano1, enderecoFulano2};
        Cliente fulano = new Cliente("Fulano", "000.000.000-00", contatosFulano, enderecosFulano);

        ContaCorrente contaFulano = new ContaCorrente(fulano, "1111", 1);

        Contato contatoCicrano1 = new Contato("Telefone pessoal", "333333333", 1);
        Contato contatoCicrano2 = new Contato("Telefone comercial", "444444444", 2);
        Endereco enderecoCicrano1 = new Endereco(1, "Rua C", 3, "Apartamento", "33333333", "Fulanocity", "Fulanostate", "Fulanolandia");
        Endereco enderecoCicrano2 = new Endereco(2, "Rua D", 4, "Casa", "44444444", "Fulanocity", "Fulanostate", "Fulanolandia");
        Contato[] contatosCicrano = {contatoCicrano1, contatoCicrano2};
        Endereco[] enderecosCicrano = {enderecoCicrano1, enderecoCicrano2};
        Cliente cicrano = new Cliente("Cicrano", "111.111.111-11", contatosCicrano, enderecosCicrano);

        ContaCorrente contaCicrano = new ContaCorrente(cicrano, "2222", 2);

        System.out.println("Testando conta de fulano");
        contaFulano.imprimirContaCorrente();
        System.out.println(contaFulano.retornarSaldoComChequeEspecial());
        contaFulano.depositar(500);
        System.out.println(contaFulano.retornarSaldoComChequeEspecial());
        contaFulano.sacar(300);
        System.out.println(contaFulano.retornarSaldoComChequeEspecial());
        contaFulano.tranferir(contaCicrano, 400);
        System.out.println(contaFulano.retornarSaldoComChequeEspecial());

        System.out.println("Testando conta de cicrano");
        contaCicrano.imprimirContaCorrente();
        System.out.println(contaCicrano.retornarSaldoComChequeEspecial());
        contaCicrano.depositar(200);
        System.out.println(contaCicrano.retornarSaldoComChequeEspecial());
        contaCicrano.sacar(300);
        System.out.println(contaCicrano.retornarSaldoComChequeEspecial());
        contaCicrano.tranferir(contaFulano, 500);
        System.out.println(contaCicrano.retornarSaldoComChequeEspecial());
    }
}
