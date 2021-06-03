package ExerciciosDeCasa1.Padaria;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
    float x;
    float y;
    double resultado;
    double poupanca;
    double porcentagem = 0.1;

    x = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de pães: "));
    y = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de broas: "));

    resultado = Padaria.venda(x, y);
    poupanca = porcentagem * resultado;

    JOptionPane.showMessageDialog(null,"Valor total: R$"+resultado);
    JOptionPane.showMessageDialog(null,"Valor para a poupança: R$"+poupanca);    

    }
}
