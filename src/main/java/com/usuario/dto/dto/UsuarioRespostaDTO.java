package com.usuario.dto.dto;

import com.usuario.dto.model.Usuario;

//nao vai retornar a senha na resposta

public class UsuarioRespostaDTO {
	
	private Long id;
	private String nome;
	private String email;
	private boolean admin;
	
	public UsuarioRespostaDTO() {
		
	}
	
	public UsuarioRespostaDTO(Long id, String nome, String email, boolean admin) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.admin = admin;
	}



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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	//não passa a senha na resposta
	public static UsuarioRespostaDTO transformaEmDTO(Usuario usuario) {
	    return new UsuarioRespostaDTO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.isAdmin());
	}
	

}
