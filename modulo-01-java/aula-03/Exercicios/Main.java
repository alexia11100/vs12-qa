public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", "Silva", 25, "+123456789");
        Pessoa pessoa2 = new Pessoa("Maria", "Santos", 30, "+987654321");

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