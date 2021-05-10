public class UsaPedido {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(1,"Pedido de teste", "Zion");

        pedido.setNomeCliente("Otavio Glauss");
        pedido.setCodigoPedido(682586);
        pedido.setDescricaoPedido("NeuralLink zao Thay Model A 8GB 4.0GHZ X1");

        System.out.println(pedido);
    }
}
