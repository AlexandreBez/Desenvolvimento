package Aula1.Introducao.src;

public class Principal {
    public static void main(String[] args) {
        //imprime com quebra de linha
        // System.out.println("Hello, FrIeNd I'ma CoDe");
        //imprime sem quebra: necessario \n para quebrar a linha
        // System.out.print("CoOlll\n");
        //imprime sem quebra
        // System.out.print("Terceira linha");
        
        //CaseSensitive
        String nome;
        String Nome;
        int idade;
        String enderecoResidencial;
        String telefone;
        String celular;

        Nome = "Alexandre";
        nome = "lucas ";
        idade = 21;
        enderecoResidencial = "Rua das macieiras, 241";
        telefone = "73434624";
        celular = "83574";

        System.out.println("O nome da pessoa é "+nome + Nome);
        System.out.println("idade: "+idade);

        System.out.print(enderecoResidencial+"\n");
        System.out.print("\r");
        System.out.print(telefone);

        float salario = 1.59f;

        System.out.println(salario);
    }
}
