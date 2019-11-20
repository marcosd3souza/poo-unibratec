package br.edu.unibratec.diario.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.edu.unibratec.diario.interfaces.Operacoes;
import br.edu.unibratec.diario.model.Aluno;

public class AlunoDAO implements Operacoes<Aluno> {
	
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private SessionFactory sessionFactory;
	
	public AlunoDAO () {
		sessionFactory = new Configuration()
				.configure().buildSessionFactory();
	}

	public void inserir(Aluno registro) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(registro);
		session.getTransaction().commit();
		session.close();
	}

	public void deletar(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Aluno aluno = session.load(Aluno.class, id);
		session.delete(aluno);		
		
		session.getTransaction().commit();
		session.close();
		
	}

	public void atualizar(Aluno aluno) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.saveOrUpdate(aluno);		
		
		session.getTransaction().commit();
		session.close();
	}

	public List<Aluno> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Aluno listarPeloId(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Aluno aluno = session.get(Aluno.class, id);
		
		session.getTransaction().commit();
		session.close();
		
		return aluno;
	}
	
}
