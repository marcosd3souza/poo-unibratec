package br.edu.unibratec.diario.view;

import java.util.Scanner;

import br.edu.unibratec.diario.controller.OperacoesFacade;
import br.edu.unibratec.diario.model.Aluno;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		OperacoesFacade facade = OperacoesFacade.getInstancia();
		
		//criar objeto
		Aluno aluno = new Aluno();
		aluno.setNome("marcos");
		facade.cadastrarAluno(aluno);
		
		aluno.setNome("marcos 2");
		facade.atualizarAluno(aluno);
		
		String nomeNovo = facade.pesquisarAluno(aluno.getId()).getNome();
		
		System.out.println("aluno atualizado: " + nomeNovo);
		
		facade.removerAluno(aluno.getId());		
	}

}
