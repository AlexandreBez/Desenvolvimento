package ExerciciosDeCasa1.Terreno;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        float x;
        float y;
        float resultado;

        for(int i =0; i < 3; i++){

            x = Float.parseFloat(JOptionPane.showInputDialog("Digite a dimensão do primeiro lado do terreno: "));
            y = Float.parseFloat(JOptionPane.showInputDialog("Digite a dimensão do segundo lado do terreno: "));
    
            resultado = Terreno.calculo(x, y);
            
            JOptionPane.showMessageDialog(null,"Área do terreno: "+resultado+" metros");
    
        }

        
    }
}