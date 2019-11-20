package br.edu.unibratec.diario.controller;

import java.util.List;

import br.edu.unibratec.diario.model.Aluno;
import br.edu.unibratec.diario.model.Curso;
import br.edu.unibratec.diario.model.Turma;

public class OperacoesFacade {
	
	private static OperacoesFacade instancia;
	private static AlunoController alunoController; 
	private static TurmaController turmaController;
	private static CursoController cursoController;
	
	private OperacoesFacade() {}
	
	public static OperacoesFacade getInstancia() {
		if (instancia == null) {
			instancia = new OperacoesFacade();
			alunoController = new AlunoController();
			turmaController = new TurmaController();
			cursoController = new CursoController();
		}
		
		return instancia;
	}
	
	// cadastrar aluno
	public void cadastrarAluno(Aluno aluno) {
		// cursoController.verificarECadastrarCurso(aluno.getTurma().getCurso());
		
		// TODO turmaController.verificarECadastrarTurma(aluno.getTurma());		
		alunoController.inserir(aluno);
		
	}
	
	// deletar aluno
	public void removerAluno(int id) {
		// TODO verificar se o aluno pelo id existe
		alunoController.deletar(id);
	}
	
	// atualizar aluno
	public void atualizarAluno(Aluno aluno) {
		alunoController.atualizar(aluno);
	}

	public Aluno pesquisarAluno(int id) {
		return alunoController.listarPeloId(id);
	}
	
	// listar todos os alunos
	public List<Aluno> pesquisarAlunos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// listar pela turma
	public List<Aluno> pesquisarAlunos(Turma turma) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// listar pelo curso
	public List<Aluno> pesquisarAlunos(Curso curso) {
		// TODO Auto-generated method stub
		return null;
	}

}
