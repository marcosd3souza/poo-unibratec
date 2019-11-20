package br.edu.unibratec.diario.interfaces;

import java.util.List;

public interface Operacoes<Object> {
	
	// inserir
	public void inserir(Object registro);
	// deletar registro pelo id
	public void deletar(int id);
	// atualizar
	public void atualizar(Object registro);
	// listar todos
	public List<Object> listarTodos();
	// listar pelo id
	public Object listarPeloId(int id);

}
