package br.com.generation.sistemaalunos.servicos;
//4
import br.com.generation.sistemaalunos.model.aluno;

public interface IAlunoService {

	public void gravarAlunoNoBanco(aluno aluno);
	public void atualizarAlunoNoBanco(aluno aluno);
	public aluno recuperaAlunoPorId(int id);
}
