package Restaurante;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
    float kilo;
    double resultado;
    
    kilo = Float.parseFloat(JOptionPane.showInputDialog("Digite o kilo: "));
    resultado = Restaurante.venda(kilo);

    JOptionPane.showMessageDialog(null,"Valor total: R$"+resultado);

    }
}
