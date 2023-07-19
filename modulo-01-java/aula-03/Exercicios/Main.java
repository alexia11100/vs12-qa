public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setSobrenome("Silva");
        pessoa1.setIdade(25);
        pessoa1.setWhatsapp("+123456789");

        Pessoa pessoa2 = new Pessoa("Maria", "Santos");
        pessoa2.setIdade(30);
        pessoa2.setWhatsapp("+987654321");

        pessoa1.conversar(pessoa2);
        System.out.println("Nome completo: " + pessoa1.retornarNomeCompleto());
        System.out.println("É maior de idade? " + pessoa1.ehMaiorIdade());

        pessoa2.conversar(pessoa1);
        System.out.println("Nome completo: " + pessoa2.retornarNomeCompleto());
        System.out.println("É maior de idade? " + pessoa2.ehMaiorIdade());

        pessoa1.mandarWhatsApp(pessoa2, "Oi, como você está?");
        pessoa2.mandarWhatsApp(pessoa1, "Olá, estou bem! E você?");
    }
}