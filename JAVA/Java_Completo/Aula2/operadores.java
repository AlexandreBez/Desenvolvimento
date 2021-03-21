package Aula2;

public class operadores {
    public static void main(String[] args) {
        int numeroInteiro = 20;
        long numeroLong = 20000000L;

        double numeroDouble = 10d;
        float numeroFloat = 20f;
        numeroFloat = (float) - numeroDouble;
        int resto = 20 % 2;
        System.out.println("resto da divisao: "+ resto);
        System.out.println(numeroDouble);

        boolean maiorQue = 10 > 20;
        boolean menorQue = 10 > 20;
        boolean maiorIgual = 10 >= 20;
        boolean menorIgual = 10 <= 20;
        boolean negacao = 10 != 20;

        System.out.println(maiorQue);
        System.out.println(menorQue);
        System.out.println(maiorIgual);
        System.out.println(menorIgual);
        System.out.println(negacao);

    }

}
