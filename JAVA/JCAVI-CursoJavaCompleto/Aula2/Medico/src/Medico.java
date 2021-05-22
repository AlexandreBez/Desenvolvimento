package Medico.src;

public class Medico {
    
    private String nome;
    private String crc;

    public Medico() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }

    @Override
    public String toString() {
        return "Medico [crc=" + crc + ", nome=" + nome + "]";
    }

    
}
