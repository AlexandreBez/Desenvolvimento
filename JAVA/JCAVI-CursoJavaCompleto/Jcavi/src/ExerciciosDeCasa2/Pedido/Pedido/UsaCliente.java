package ExerciciosDeCasa2.Pedido.Pedido;

public class UsaCliente {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.setCodigo(3625283);
        cliente1.setNome("Armitage");

        cliente2.setCodigo(6242736);
        cliente2.setNome("Shodan");

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
