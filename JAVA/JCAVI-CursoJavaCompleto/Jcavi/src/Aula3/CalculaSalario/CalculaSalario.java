package Aula3.CalculaSalario;

public class CalculaSalario {
    
    private double salario;
    private double taxa;

    public CalculaSalario(){

    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public void CalculoSalarial(){

        Double resultado = salario + (salario * taxa / 100);
        System.out.println("Seu salario: R$"+ resultado);

    }

    public Double CalculoSalariaComRetorno() {
        
        Double resultado = salario + (salario * taxa / 100);
        return resultado;
    }
}
