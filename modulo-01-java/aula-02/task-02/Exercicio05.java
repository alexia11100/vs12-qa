import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] precosMercados = new double[10][3];

        for (int i = 0; i < precosMercados.length; i++) {
            System.out.print("Preço no mercado 1: ");
            double precoMercadoUm = scanner.nextDouble();

            precosMercados[i][0] = precoMercadoUm;

            System.out.print("Preço no mercado 2: ");
            double precoMercadoDois = scanner.nextDouble();

            precosMercados[i][1] = precoMercadoDois;

            System.out.print("Preço no mercado 3: ");
            double precoMercadoTres = scanner.nextDouble();

            precosMercados[i][2] = precoMercadoTres;
        }

        double somaPrecosMercadoUm = 0;
        double somaPrecosMercadoDois = 0;
        double somaPrecosMercadoTres = 0;
        for (int i = 0; i < precosMercados.length; i++) {
            for (int j = 0; j < precosMercados[i].length; j++) {
                switch (j) {
                    case 0:
                        somaPrecosMercadoUm += precosMercados[i][j];
                        break;
                    case 1:
                        somaPrecosMercadoDois += precosMercados[i][j];
                        break;
                    case 2:
                        somaPrecosMercadoTres += precosMercados[i][j];
                        break;
                }
            }
        }

        if ((somaPrecosMercadoUm <= somaPrecosMercadoDois) && (somaPrecosMercadoUm <= somaPrecosMercadoTres)) {
            System.out.println("O mercado mais barato para se comprar é o mercado 1.");
        }
        else if ((somaPrecosMercadoDois <= somaPrecosMercadoUm) && (somaPrecosMercadoDois <= somaPrecosMercadoTres)) {
            System.out.println("O mercado mais barato para se comprar é o mercado 2.");
        }
        else if ((somaPrecosMercadoTres <= somaPrecosMercadoDois) && (somaPrecosMercadoTres <= somaPrecosMercadoUm)) {
            System.out.println("O mercado mais barato para se comprar é o mercado 3.");
        }
    }
}
