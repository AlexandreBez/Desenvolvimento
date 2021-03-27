package Aula5;

public class ternario {

    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        String status;

        status = a < b ? "Verdade" :  b >= a && a < b ? "Verdade2" : "Falso";

        System.out.println(status);
    }
}
