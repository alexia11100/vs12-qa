public class Exercicio01 {
    public static void main(String[] args){
        int[] numeros = {9, 4, 3};

        int soma = 0;
        double media;
        for (int contador = 0; contador < numeros.length; contador++){
            soma += numeros[contador];
        }

        media = (double) soma/numeros.length;
        System.out.printf("A soma dos numeros é: %d\n", soma);
        System.out.printf("A media dos numeros é: %.2f\n", media);

    }
}
