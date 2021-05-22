
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlunoDao extends Conexao {

    Connection conn = this.conectar();
    Statement stmt = conn.createStatement();
    ResultSet rs = null;

    public AlunoDao() throws ClassNotFoundException, SQLException {
        super();
    }

    public List<Aluno> getAll() throws SQLException {

        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT id, nome, cpf, telefone FROM ALUNO";
        rs = stmt.executeQuery(sql);
        while (rs.next()) {

            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String cpf = rs.getString("cpf");
            String telefone = rs.getString("telefone");

            Aluno objAluno = new Aluno();
            objAluno.setId(id);
            objAluno.setNome(nome);
            objAluno.setCpf(cpf);
            objAluno.setTelefone(telefone);
            lista.add(objAluno);

        }

        rs.close();
        conn.close();
        return lista;

    }

    public void inserir(Aluno obj) throws SQLException{

        String sql = "INSERT INTO ALUNO VALUES null, '"+ obj.getNome() + "'," + obj.getCpf() + "',"+ obj.getTelefone();
        stmt.executeQuery(sql);
        // conn.close();


    }

}
