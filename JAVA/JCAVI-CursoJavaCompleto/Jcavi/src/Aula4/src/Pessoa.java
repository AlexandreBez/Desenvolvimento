package Aula4.src;

public class Pessoa {
    private int id;
    private String nome;
    private String telefone;

    public Pessoa() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", telefone=" + telefone + "]";
    }

    public Double calcularSalarios() {
        return 10.0 * 10.0;
    }

}
