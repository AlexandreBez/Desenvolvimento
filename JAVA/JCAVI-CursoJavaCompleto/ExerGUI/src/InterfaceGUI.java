package src;

import javax.swing.*;

public class InterfaceGUI extends JFrame{

    // Componete JLabel
    public JLabel nome;
    public JLabel sobrenome;
    public JLabel cpf;
    public JLabel rg;
    public JLabel estadoCivil;
    public JLabel celular;
    public JLabel email;
    public JLabel estado;
    public JLabel cidade;
    public JLabel rua;

    // Componente JTextField
    public JTextField txtnome;
    public JTextField txtsobrenome;
    public JTextField txtcpf;
    public JTextField txtrg;
    public JTextField txtestadoCivil;
    public JTextField txtcelular;
    public JTextField txtemail;
    public JTextField txtestado;
    public JTextField txtcidade;
    public JTextField txtrua;

    // Contrutor e painel de Interface
    public InterfaceGUI(){

        setTitle("Cadastro de Cliente");
        setBounds(350, 500, 750, 750);
        getContentPane().setLayout(null);

        // Labels, configuraçoes de label, textField econfiguraçoes do textField
        nome = new JLabel();
        nome.setText("Nome:");
        nome.setBounds(600,300,50,50);
        add(nome);

        txtnome = new JTextField();
        txtnome.setBounds(1000,300,50,50);
        add(txtnome);

        // ==================================================

        sobrenome = new JLabel();
        nome.setText("Sobrenome:");
        nome.setBounds(300,300,50,50);
        add(sobrenome);
        
        txtsobrenome = new JTextField();
        txtsobrenome.setBounds(1000,300,50,50);
        add(txtsobrenome);

        // ==================================================


        cpf = new JLabel();
        nome.setText("CPF:");
        nome.setBounds(300,300,50,50);
        add(cpf);
        
        txtcpf = new JTextField();
        txtcpf.setBounds(1000,300,50,50);
        add(txtcpf);

        // ==================================================

        rg = new JLabel();
        nome.setText("RG:");
        nome.setBounds(300,300,50,50);
        add(rg);
        
        txtrg = new JTextField();
        txtrg.setBounds(1000,300,50,50);
        add(txtrg);

        // ==================================================

        estadoCivil = new JLabel();
        nome.setText("Estado Civil:");
        nome.setBounds(300,300,50,50);
        add(estadoCivil);
        
        txtestadoCivil = new JTextField();
        txtestadoCivil.setBounds(1000,300,50,50);
        add(txtestadoCivil);

        // ==================================================

        celular = new JLabel();
        nome.setText("Celular:");
        nome.setBounds(300,300,50,50);
        add(celular);
        
        txtcelular = new JTextField();
        txtcelular.setBounds(1000,300,50,50);
        add(txtcelular);

        // ==================================================

        email = new JLabel();
        nome.setText("Email:");
        nome.setBounds(300,300,50,50);
        add(email);
        
        txtemail = new JTextField();
        txtemail.setBounds(1000,300,50,50);
        add(txtemail);

        // ==================================================

        estado = new JLabel();
        nome.setText("Estado:");
        nome.setBounds(300,300,50,50);
        add(estado);
        
        txtestado = new JTextField();
        txtestado.setBounds(1000,300,50,50);
        add(txtestado);

        // ==================================================

        cidade = new JLabel();
        nome.setText("Cidade:");
        nome.setBounds(300,300,50,50);
        add(cidade);
        
        txtcidade = new JTextField();
        txtcidade.setBounds(1000,300,50,50);
        add(txtcidade);

        // ==================================================

        rua = new JLabel();
        nome.setText("Rua:");
        nome.setBounds(300,300,50,50);
        add(rua);
        
        txtrua = new JTextField();
        txtrua.setBounds(1000,300,50,50);
        add(txtrua);

        // ==================================================

    }

    // Main 
    public static void main(String[] args) {
        
        InterfaceGUI InterfaceGUI = new InterfaceGUI();

        InterfaceGUI.setVisible(true);
        InterfaceGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}