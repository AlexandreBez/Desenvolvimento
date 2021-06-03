package Aula4.ExercicioCarro;

public class UsaCarro{

    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.setModelo("HB 20");
        carro1.setAno("2019");
        carro1.setCor("Laranja Brilhante");

        System.out.println(carro1);
        System.out.println(carro1.acelera());
        System.out.println(carro1.freia());
        

    }

}
