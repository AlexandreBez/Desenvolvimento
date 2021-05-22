package Pedido.Pedido;

public class Pedido {
    
    private int codigoPedido;
    private String descricaoPedido;
    private String nomeCliente;

    public Pedido(int codigoPedido, String descricaoPedido, String nomeCliente){
        super();
        this.codigoPedido = codigoPedido;
        this.descricaoPedido = descricaoPedido;
        this.nomeCliente = nomeCliente;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    public void setDescricaoPedido(String descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Pedido [codigoPedido=" + codigoPedido + ", descricaoPedido=" + descricaoPedido + ", nomeCliente="
                + nomeCliente + "]";
    }

}
