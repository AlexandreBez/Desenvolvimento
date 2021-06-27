package GUI;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual é o seu nome?");
        String name = scanner.nextLine();

        System.out.println("Qual é a sua idade?");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Qual é a sua cidade?");
        String cidade = scanner.nextLine();

        System.out.println("Ola "+name);
        System.out.println("idade: "+idade);
        System.out.println("Você é de: "+cidade);

        scanner.close();

    }
}
