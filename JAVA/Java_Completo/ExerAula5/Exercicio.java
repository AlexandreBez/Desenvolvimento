package ExerAula5;

public class Exercicio {
    public static void main(String[] args) {
        
        double SalarioComImposto;
        double salarioBase = 2595.57;
        double auxiliar;
        String frase = "Seu salario liquido é: %.2f %n";
        
        if(salarioBase <= 1659.38) {

            auxiliar = salarioBase * 0.08;
            SalarioComImposto = salarioBase - auxiliar;
            System.out.printf(frase, SalarioComImposto);
        
        }else if(salarioBase >= 1658.39 && salarioBase <= 2765.66){

            auxiliar = salarioBase * 0.09;
            SalarioComImposto = salarioBase - auxiliar;
            System.out.printf(frase, SalarioComImposto);
        
        }else if(salarioBase >=2765.67 && salarioBase <= 5531.31) {

            auxiliar = salarioBase * 0.11;
            SalarioComImposto = salarioBase - auxiliar;
            System.out.printf(frase, SalarioComImposto);

        }else if(salarioBase >= 5531.32) {

            SalarioComImposto = salarioBase - 604.44;
            System.out.printf(frase, SalarioComImposto);

        }else {
            System.out.println("Por favor digite um valor válido");
        }
    }
}
