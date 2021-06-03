package Aula4.src.interfaces;

import Aula4.src.Pessoa;
import Aula4.src.PessoaFisica;
import Aula4.src.PessoaJuridica;

public class usaPessoa {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setId(1);
        pessoa1.setNome("Tavares");
        pessoa1.setTelefone("734735273");

        System.out.println(pessoa1);

        System.out.println(pessoa1.calcularSalarios());

        Pessoa pessoa2 = new PessoaFisica();

        pessoa2.setId(2);
        pessoa2.setNome("Evelyn");
        pessoa2.setTelefone("75688544");
        
        System.out.println(pessoa2);
        System.out.println(pessoa2.calcularSalarios());

        IPessoa pessoa3 = new PessoaJuridica();

        System.out.println(pessoa3.calcularSalarios());
    }
}
