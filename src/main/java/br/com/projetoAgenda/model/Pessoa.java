package br.com.projetoAgenda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "pessoa")
public class Pessoa {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pessoa_id")
	private Long id;
	
	@Column(name = "pessoa_nome")
	@NotNull
	@NotBlank
	private String nome;
	
	
	@Column(name = "pessoa_cpfcnpj")
	@CPF
	//@CNPJ
	@NotNull
	@NotBlank
	private String cpfCnpj;
	
	@Column(name = "pessoa_telefone")
	//@Pattern(regexp = "(?:^\\([0]?[1-9]{2}\\)|^[0]?[1-9]{2}[\\.-\\s]?)[9]?[1-9]\\d{3}[\\.-\\s]?\\d{4}$")
	private String telefone;
	
	@Column(name = "pessoa_email")
	@Email
	@NotNull
	@NotBlank
	private String email;
	
	@Column(name = "pessoa_funcao")
	private String funcao;
	
	@Column(name = "pessoa_login")
	@Size(min = 6, max = 20)
	@NotNull
	@NotBlank
	private String login;
	
	@Column(name = "pessoa_senha")
	@Size(min = 6)
	//@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")
	@NotNull
	@NotBlank
	private String senha;
	
	@Column(name = "pessoa_perfil")
	@NotNull
	@NotBlank
	@Pattern(regexp = "Interno|Externo")
	private String perfil;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	
	
	
	
}
