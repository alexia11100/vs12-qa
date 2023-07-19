public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro.late());
        System.out.println(cachorro.caminha());

        Gato gato = new Gato();
        System.out.println(gato.mia());
        System.out.println(gato.caminha());
    }
}
