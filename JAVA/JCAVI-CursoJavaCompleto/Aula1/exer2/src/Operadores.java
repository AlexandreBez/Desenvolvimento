package exer2.src;

public class Operadores {
    public static void main(String[] args) throws Exception {
        
        String cpf = "935.524.634-40"; 
        String cpf2 = "765.744.353-45"; 
        
        System.out.println(cpf != cpf2);// diferente
        System.out.println(cpf == cpf);// comparação
        System.out.println("Primeira frase " + " Segunda frase");//concatenção

        int x = 0;
        x += 1;
        
        System.out.println(x);

        int y = 0;
        y -= 1;
        
        System.out.println(y);

        int z = 12;
        z *= 1;
        
        System.out.println(z);

        int w = 10;
        w /= 2;
        
        System.out.println(w);

        int a = 15;
        a %= 2;
        
        System.out.println(-a); 

    }
}
