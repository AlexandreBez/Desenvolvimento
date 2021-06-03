package Aula2.Carro.src;


public class UsaVeiculo {
    public static void main(String[] args) {
        
        Veiculo veiculo = new Veiculo();
        
        veiculo.setmodelo("Porsche");
        veiculo.setCor("Preto Onix");
        veiculo.setPlaca("GJF-437");
        veiculo.setAno(2020);

        System.out.println(veiculo);

        Veiculo veiculo2 = new Veiculo("Ferrari GT", "GLS-634", "Verde Esmaltado", 2020);

        System.out.println(veiculo2);
    }
}
