package Aula2.Medico.src;

public class MedicoCirurgiao extends Medico{
    
    private String tipoCirurgia;
    private int qtdCirurgias;

    public String getTipoCirurgia() {
        return tipoCirurgia;
    }

    public void setTipoCirurgia(String tipoCirurgia) {
        this.tipoCirurgia = tipoCirurgia;
    }

    public int getQtdCirurgias() {
        return qtdCirurgias;
    }

    public void setQtdCirurgias(int qtdCirurgias) {
        this.qtdCirurgias = qtdCirurgias;
    }

    @Override
    public String toString() {
        return "Medico Cirurgiao [qtdCirurgias=" + qtdCirurgias + ", tipoCirurgia=" + tipoCirurgia + "]";
    }

    
}
