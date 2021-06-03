package principal;


import dao.UsuarioDAO;

public class Principal {

	public static void main(String[] args) throws Exception{
		
		UsuarioDAO obj1 = new UsuarioDAO();
		
		obj1.inserir();
		obj1.excluir();
		obj1.atualizar();
		obj1.listar();
		
//		Usuario objUsuario = new Usuario();
//		/*objUsuario.setNome("CARLA");
//		objUsuario.setEmail("mmmm@gol.com.br");
//		objUsuario.setLogin("CC");
//		objUsuario.setSenha("876543");
//		*/
//
//		objUsuario.setNome(JOptionPane.showInputDialog("Digite o nome"));
//		objUsuario.setEmail(JOptionPane.showInputDialog("Digite o email"));
//		objUsuario.setLogin(JOptionPane.showInputDialog("Digite o LOGIN"));
//		objUsuario.setSenha(JOptionPane.showInputDialog("Digite a senha"));
//
//
//		obj1.inserir(objUsuario);
//
//		obj1.listar();
	}
}
