package br.edu.unibratec.diario.controller;

import java.util.List;

import br.edu.unibratec.diario.dao.AlunoDAO;
import br.edu.unibratec.diario.interfaces.Operacoes;
import br.edu.unibratec.diario.model.Aluno;

public class AlunoController implements Operacoes<Aluno>  {
	
	private AlunoDAO dao;
	public AlunoController() {
		dao = new AlunoDAO();
	}

	public void inserir(Aluno aluno) {
		if (aluno != null) {			
			dao.inserir(aluno);
		}
		
	}

	public void deletar(int id) {
		dao.deletar(id);
		
	}

	public void atualizar(Aluno aluno) {
		dao.atualizar(aluno);
	}

	public List<Aluno> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Aluno listarPeloId(int id) {
		return dao.listarPeloId(id);
	}

}
