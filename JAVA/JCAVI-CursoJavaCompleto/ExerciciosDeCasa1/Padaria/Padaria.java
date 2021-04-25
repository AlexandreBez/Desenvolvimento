package Padaria;

public class Padaria {

    public static double venda(float x, float y) {
        final double pao = 0.12;
        final double broa = 1.50;

        double somaPao = x * pao;
        double somaBroa = y * broa;

        return somaPao + somaBroa;
    }
}
