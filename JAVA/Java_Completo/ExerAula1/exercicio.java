package ExerAula1;

public class exercicio {

    public static void main(String[] args) {

        String nome = "Lucas";
        String endereco = "Rua Tarcisio Amaral";
        int telefone = 93648264;
        boolean chave = false;
        int central = 94649366;

        if(chave == true) {
            
            System.out.println("O " + nome + " domiciliado no endereco " + endereco + 
            " e telefone " + telefone + " não possui pendencias.");
        } else {

            System.out.println("O " + nome + " domiciliado no endereco " + endereco + 
            " e telefone " + telefone + " possui pendencias. Favor ligar para o numero" + central);
        }
    }
}
