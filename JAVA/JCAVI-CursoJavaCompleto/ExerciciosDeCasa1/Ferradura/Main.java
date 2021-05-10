package Ferradura;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        int qtdCavalos;
        final int qtdFerradura = 4;
        int resultado;

        qtdCavalos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cavalos: "));
        resultado = qtdCavalos * qtdFerradura;

        JOptionPane.showMessageDialog(null, "A quantidade de Ferraduras será: "+ resultado);

    }
}
