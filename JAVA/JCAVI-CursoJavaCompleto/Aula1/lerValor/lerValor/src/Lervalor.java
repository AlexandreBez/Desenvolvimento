import javax.swing.JOptionPane;

public class Lervalor {
    public static void main(String[] args) throws Exception {
        int valor1;
        double salario;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para o numero: "));
        System.out.println(valor1);

        //apresenta uma mensagem 
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario:" ));
        JOptionPane.showMessageDialog(null, "Seu salario: "+salario);
    }
}
