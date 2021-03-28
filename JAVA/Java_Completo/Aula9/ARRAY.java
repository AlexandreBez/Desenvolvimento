package Aula9;

public class ARRAY {
 
    public static void main(String[] args) {
        
        int[] idade = new int[3];
        idade[0] = 20;
        idade[1] = 43;
        idade[2] = 26;

        System.out.println(idade[0]);
        System.out.println(idade[1]);
        System.out.println(idade[2]);

        System.out.println("=====================");

        int[] valor = new int[3];

        valor[0] = 340;
        valor[1] = 6542;
        valor[2] = 85;

        for(int i = 0; i < 3; i++) {
            System.out.println("=====================");
            System.out.println(valor[i]);
        }

        char[] letras = new char[3];
        char[] letras1 = {1, 2, 3, 4, 5};
        char[] letras2 = new char[]{1, 2, 3, 4, 5};
    }
}
