public class Exercicio01 {
    public static void main(String[] args){
        Soma soma = new Soma();
        System.out.println(soma.calcula(5, 5));
        System.out.println(soma.calcula(5, 5, 5));

        Subtracao subtracao = new Subtracao();
        System.out.println(subtracao.calcula(5, 5));
        System.out.println(subtracao.calcula(5, 5, 5));

        Multiplicacao multiplicacao = new Multiplicacao();
        System.out.println(multiplicacao.calcula(5, 5));
        System.out.println(multiplicacao.calcula(5, 5, 5));

        Divisao divisao = new Divisao();
        System.out.println(divisao.calcula(5, 5));
        System.out.println(divisao.calcula(5, 5, 5));
    }
}

interface OperacaoMatematica{
    int calcula(int a, int b);
}

class Soma implements OperacaoMatematica{
    @Override
    public int calcula(int a, int b){
        return a + b;
    }

    public int calcula(int a, int b, int c){
        return a + b + c;
    }
}

class Subtracao implements OperacaoMatematica{
    @Override
    public int calcula(int a, int b){
        return a - b;
    }

    public int calcula(int a, int b, int c){
        return a - b - c;
    }
}

class Multiplicacao implements OperacaoMatematica{
    @Override
    public int calcula(int a, int b){
        return a * b;
    }

    public int calcula(int a, int b, int c){
        return a * b * c;
    }
}

class Divisao implements OperacaoMatematica{
    @Override
    public int calcula(int a, int b){
        return a / b;
    }

    public int calcula(int a, int b, int c){
        return a / b / c;
    }
}