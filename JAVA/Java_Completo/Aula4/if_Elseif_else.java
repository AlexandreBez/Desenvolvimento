package Aula4;

public class if_Elseif_else {
    public static void main(String[] args) {
        
        int a = 2;
        int b = 4;
        int c = 3;

        if((a % b) == 0) {
            System.out.println("Verdade");
       }else if((c % b) != 0) {
        System.out.println("Verdade");
       }else {
        System.out.println("Falso");
       }
    }
}
