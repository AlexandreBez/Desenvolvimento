package Aula3.Media;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        Media media = new Media();

        double x = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 2: "));
    
        media.setNota1(x);
        media.setNota2(y);
        
        media.MediaNotas();

    }
}
