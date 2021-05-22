
import java.io.ObjectInputFilter.Status;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class AlunoConexao extends Conexao {

    Connection conn = Conexao.conectar();
    Statement stmt = conn.createStatement();
    static AlunoDao objAlunoDao;


    public AlunoConexao() throws ClassNotFoundException, SQLException {
        super();
    }

    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        // AlunoConexao al = new AlunoConexao();

        // String nome = JOptionPane.showInputDialog("Entre com o nome do aluno: ");
        // String cpf = JOptionPane.showInputDialog("Entre com o CPF: ");
        // String telefone = JOptionPane.showInputDialog("Entre com o telefone: ");

        // String sql = "INSERT INTO ALUNO VALUES (null,'"+nome+"','"+cpf+"','"+telefone+"')";  

        // al.stmt.executeUpdate(sql);
        // al.conn.close();
        // System.out.println("Inserção Finalizadaaaaa!");

        objAlunoDao = new AlunoDao();
        List<Aluno> lista = new ArrayList();
        lista = objAlunoDao.getAll();

        for(Aluno aluno: lista){
            System.out.println(aluno);
        }

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Fernanda");
        aluno2.setCpf("97584567821");
        aluno2.setTelefone("975869878");

        objAlunoDao.inserir(aluno2);
    }

}
