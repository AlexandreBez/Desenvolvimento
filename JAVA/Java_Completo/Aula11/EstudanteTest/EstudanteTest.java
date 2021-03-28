package Aula11.EstudanteTest;

import Aula11.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();

        joao.nome = "João Oliveira";
        joao.matricula = "0363527";
        joao.idade = 17;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);
    }
}
