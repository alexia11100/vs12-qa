public class Exercicio02 {
    public static void main (String[] args){
        int [][] numeros = {
                {4,5},
                {7,9}
        };
        int somaLinhaUm = 0;
        int somaLinhaDois = 0;

        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++){
                System.out.println(numeros[linha][coluna]);
                if (linha == 0){
                    somaLinhaUm += numeros[linha][coluna];
                }
                else if (linha == 1){
                    somaLinhaDois += numeros[linha][coluna];
                }
            }
        }

        System.out.println("Soma todas linhas "+ (somaLinhaUm+somaLinhaDois));
        System.out.println("Soma linha um "+ somaLinhaUm);
        System.out.println("Soma linha dois "+ somaLinhaDois);
        System.out.println("Soma linha um - soma linha dois "+ (somaLinhaUm-somaLinhaDois));
    }
}
