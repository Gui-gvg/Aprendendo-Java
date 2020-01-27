package br.com.generation.sistemaalunos.servicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.generation.sistemaalunos.dao.IAlunoBD;
//5
import br.com.generation.sistemaalunos.model.aluno;
@Component
public class ServicoAlunos implements IAlunoService{
	@Autowired // o gerenciamento desse objeto fica por conta do springboot
	IAlunoBD repo; //6
	
	
	public void gravarAlunoNoBanco(aluno aluno) {
		try {
		repo.save(aluno); //um dos comandos do crud repository
		}
		catch (Exception ex) {
			throw new RuntimeException("Erro ao inserir novo aluno!");
		}
		
	}
	public void atualizarAlunoNoBanco(aluno aluno) {
		try {
			repo.save(aluno);
		}
		catch (Exception ex) {
			throw new RuntimeException("Erro ao atualizar aluno no banco!");
		}
	}
	public aluno recuperaAlunoPorId(int id) {
		return repo.findById(id).get();
		
	}
	

}
