package ExercicioCarro;

public class Carro implements ICarro{
    
    private String modelo;
    private String ano;
    private String cor;

    public Carro() {

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro [ano=" + ano + ", cor=" + cor + ", modelo=" + modelo + "]";
    }

    @Override
    public String acelera() {
        // TODO Auto-generated method stub
        return "O carro esta acelerando";
    }

    @Override
    public String freia() {
        // TODO Auto-generated method stub
        return "O carro esta parando";
    }

    
}

