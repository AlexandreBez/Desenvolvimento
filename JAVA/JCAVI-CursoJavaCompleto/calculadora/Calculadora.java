import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
    
    static JTextField visor;
    static JButton botao7;
    static JButton botao8;
    static JButton botao9;

    static JButton botao4;
    static JButton botao5;
    static JButton botao6;

    static JButton botao1;
    static JButton botao2;
    static JButton botao3;

    static JButton somar;
    static JButton subtrair;
    static JButton multiplicar;

    static JButton dividir;
    static JButton limpar;
    static JButton igual;

    static JButton botao0;

    Double valor1;
    Double valor2;
    Double resultado;
    String operacao;


    public static void main(String[] args) {
        
        Calculadora janela = new Calculadora();

        visor = new JTextField();
        visor.setBounds(10, 10, 192, 30);

        botao7 = new JButton("7");
        botao7.setBounds(10, 45, 60, 40);

        botao8 = new JButton("8");
        botao8.setBounds(75, 45, 60, 40);

        botao9 = new JButton("9");
        botao9.setBounds(140, 45, 60, 40);

        // segunda fila de numeros
        botao4 = new JButton("4");
        botao4.setBounds(10, 90, 60, 40);

        botao5 = new JButton("5");
        botao5.setBounds(75, 90, 60, 40);

        botao6 = new JButton("6");
        botao6.setBounds(140, 90, 60, 40);

        // terceira fila
        botao1 = new JButton("1");
        botao1.setBounds(10, 135, 60, 40);

        botao2 = new JButton("2");
        botao2.setBounds(75, 135, 60, 40);

        botao3 = new JButton("3");
        botao3.setBounds(140, 135, 60, 40);

        // quarta fila
        somar = new JButton("+");
        somar.setBounds(10, 180, 60, 40);

        subtrair = new JButton("-");
        subtrair.setBounds(75, 180, 60, 40);

        multiplicar = new JButton("*");
        multiplicar.setBounds(140, 180, 60, 40);

        // quinta fila
        dividir = new JButton("/");
        dividir.setBounds(10, 225, 60, 40);

        limpar = new JButton("C");
        limpar.setBounds(75, 225, 60, 40);

        igual = new JButton("=");
        igual.setBounds(140, 225, 60, 40);

        botao0 = new JButton("0");
        botao0.setBounds(140, 270, 60, 40);

        janela.setLayout(null);
        janela.add(visor);

        janela.add(botao7);
        janela.add(botao8);
        janela.add(botao9);

        janela.add(botao4);
        janela.add(botao5);
        janela.add(botao6);

        janela.add(botao1);
        janela.add(botao2);
        janela.add(botao3);

        janela.add(botao0);

        janela.add(somar);
        janela.add(subtrair);
        janela.add(multiplicar);

        janela.add(dividir);
        janela.add(limpar);
        janela.add(igual);
        
        janela.setTitle("Calculadora");
        janela.setSize(220, 320);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // adicionando action listener
        botao7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "7");
            }
        });

        botao8.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "8");
            }
        });

        botao9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "9");
            }
        });

        // segunda fila
        botao4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "4");
            }
        });

        botao5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "5");
            }
        });

        botao6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "6");
            }
        });

        // terceira fila
        botao1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "1");
            }
        });

        botao2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "2");
            }
        });

        botao3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "3");
            }
        });

        // quarta fila

        somar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){

                janela.operacao = "+";
                janela.valor1 = Double.parseDouble(janela.visor.getText());
                janela.visor.setText("");
            }
        });

        subtrair.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){

                janela.operacao = "-";
                janela.valor1 = Double.parseDouble(janela.visor.getText());
                janela.visor.setText("");
            }
        });

        multiplicar.addActionListener(new ActionListener(){

           @Override
            public void actionPerformed(ActionEvent e){

                janela.operacao = "*";
                janela.valor1 = Double.parseDouble(janela.visor.getText());
                janela.visor.setText("");
            }
        });

        // quinta fila
        dividir.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){

                janela.operacao = "/";
                janela.valor1 = Double.parseDouble(janela.visor.getText());
                janela.visor.setText("");
            }
        });

        limpar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                visor.setText("");
            }
        });

        igual.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                
                if(janela.operacao == "+"){
                    janela.valor1 = Double.parseDouble(janela.visor.getText());
                    janela.resultado = janela.valor1 + janela.valor2;
                    janela.visor.setText(janela.resultado.toString());
                }else if(janela.operacao == "-"){
                    janela.valor1 = Double.parseDouble(janela.visor.getText());
                    janela.resultado = janela.valor1 - janela.valor2;
                    janela.visor.setText(janela.resultado.toString());
                }else if(janela.operacao == "*"){
                    janela.valor1 = Double.parseDouble(janela.visor.getText());
                    janela.resultado = janela.valor1 * janela.valor2;
                    janela.visor.setText(janela.resultado.toString());
                }else if(janela.operacao == "/"){
                    janela.valor1 = Double.parseDouble(janela.visor.getText());
                    janela.resultado = janela.valor1 / janela.valor2;
                    janela.visor.setText(janela.resultado.toString());
                }

            }
        });

        botao0.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                visor.setText(visor.getText() + "0");
            }
        });
    }
}