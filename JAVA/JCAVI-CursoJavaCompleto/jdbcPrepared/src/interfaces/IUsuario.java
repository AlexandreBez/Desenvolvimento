package interfaces;

import model.Usuario;

public interface IUsuario{
	
	public void inserir() throws Exception;
	public void excluir() throws Exception;
	public void atualizar() throws Exception;
	public void listar() throws Exception;
	public void inserir(Usuario usuario) throws Exception;
}