package br.com.generation.sistemaalunos.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.generation.sistemaalunos.model.aluno;

public interface IAlunoBD extends CrudRepository<aluno,Integer> {

}
