package Aula1;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class aula1 {

    public static void main(String[] args) {
        
        JFrame formulario = new JFrame();

        JLabel rotulo = new JLabel("Exemplo de Label");

        formulario.setSize(800, 300);
        formulario.setTitle("Hello User");
        formulario.setLocation(500, 390);

        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        formulario.add(rotulo);
        formulario.setVisible(true);
    } 
}