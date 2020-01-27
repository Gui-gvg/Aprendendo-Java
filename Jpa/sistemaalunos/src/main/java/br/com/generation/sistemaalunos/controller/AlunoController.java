package br.com.generation.sistemaalunos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.generation.sistemaalunos.model.aluno;
import br.com.generation.sistemaalunos.servicos.IAlunoService;
@RestController
@CrossOrigin("*")
public class AlunoController {
	
	@Autowired
	private IAlunoService servico;
	
	@PostMapping("/alunos/novo")
	public ResponseEntity<aluno> inserirNovoAluno(@RequestBody aluno aluno){
		try {
			servico.gravarAlunoNoBanco(aluno);
			return ResponseEntity.ok(aluno);
		}
		catch(Exception ex) {
			return ResponseEntity.badRequest().build();
		}
	}
	@GetMapping("/aluno/{id}")
	public ResponseEntity<aluno> buscarAlunoPorID(@PathVariable int id){
		return null;
	}
	@PutMapping("/aluno/alterar")
	public ResponseEntity<aluno> atualizarDados(@RequestBody aluno aluno){
		return null;
	}
}

