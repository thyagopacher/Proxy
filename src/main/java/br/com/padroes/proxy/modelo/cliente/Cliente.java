package br.com.padroes.proxy.modelo.cliente;

import java.util.UUID;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public class Cliente {
	
	private String id = UUID.randomUUID().toString();
	
	private String nome;
	
	private Foto foto;
	
	public Cliente() {
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Foto getFoto() {
		return foto;
	}

	public void setFoto(Foto foto) {
		this.foto = foto;
	}
	
	

}
