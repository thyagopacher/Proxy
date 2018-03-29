package br.com.padroes.proxy.modelo.imagens;

/**
 * @author Adaptado de "Padrões de Projeto: Soluções reutilizáveis de software orientado a objetos"
 *
 */
public class Logo implements Imagem {

	private String caminho;
	private String nome;
	private byte[] conteudo;
	
	public Logo(String caminho, String nome) {
		this.caminho = caminho;
		this.nome = nome;
	}

	public String getCaminho() {
		return caminho;
	}

	public String getNome() {
		return nome;
	}

	public byte[] getConteudo() {
		return conteudo;
	}

	public void setConteudo(byte[] conteudo) {
		this.conteudo = conteudo;
	}

}
