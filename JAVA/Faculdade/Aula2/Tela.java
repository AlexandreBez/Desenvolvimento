package Aula2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela extends JFrame{

    private JLabel rotulo = null;

    public Tela(){

        rotulo = new JLabel("Helo user");

        setSize(390, 390);
        setTitle("GUI-Graphical User Interface");
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(rotulo);
    }
}
