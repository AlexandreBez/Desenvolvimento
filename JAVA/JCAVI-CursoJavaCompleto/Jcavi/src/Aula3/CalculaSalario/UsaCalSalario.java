package Aula3.CalculaSalario;

import javax.swing.JOptionPane;

public class UsaCalSalario {
    
    public static void main(String[] args) {
        
        CalculaSalario objsalario = new CalculaSalario();

        double sal = Double.parseDouble(JOptionPane.showInputDialog("Entre com o salario: "));
        double taxa = Double.parseDouble(JOptionPane.showInputDialog("Entre com a taxa: "));

        objsalario.setSalario(sal);
        objsalario.setTaxa(taxa);

        objsalario.CalculoSalarial();
        System.out.println(objsalario.CalculoSalariaComRetorno());
    }
}
