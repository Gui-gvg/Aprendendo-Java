package br.com.generation.sistemaalunos.model;

import javax.persistence.Column;
import javax.persistence.Entity;//1
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;//2

@Entity //1
@Table(name="tbl_aluno")//2 as gravações e recuperações serão feitas nesta tabela
public class aluno {
	
	@Column(name="ra")//3 esta notação designa titulos de coluna
	@Id				// este atributo é chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //equivalente ao auto_increment	
	private int ra;
	
	@Column(name="nome",length = 100)//indica o nome e o tamanho da coluna
	private String nome;
	@Column(name="email",length = 100, unique = true)//indica o nome e o tamanho da coluna
	private String email;
	@Column(name="telefone",length = 20)//indica o nome e o tamanho da coluna
	private String telefone;
	
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
