package ExerciciosDeCasa2.Pedido.Pedido;

public class Cliente {
    
    private int codigo;
    private String nome;

    public Cliente(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + ", nome=" + nome + "]";
    }

    
}
