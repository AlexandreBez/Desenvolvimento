package src;
public class Veiculo {
        
    private String modelo;
    private String placa;
    private String cor;
    private int ano;

    public Veiculo() {
        super();
    }


    public Veiculo(String modelo, String placa, String cor, int ano) {
        super();
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
    }

    public String getmodelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo [ano=" + ano + ", cor=" + cor + ", modelo=" + modelo + ", placa=" + placa + "]";
    }

}
