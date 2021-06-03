package ExerciciosDeCasa1.Gasolina;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
    float valor;
    double resultado;
    
    JOptionPane.showMessageDialog(null,"Valor da gasolina: R$4,79");

    valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor: "));
    resultado = Gasolina.gasolina(valor);

    JOptionPane.showMessageDialog(null,"Valor total: R$"+resultado);

    }
}
