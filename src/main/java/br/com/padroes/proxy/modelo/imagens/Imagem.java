package br.com.padroes.proxy.modelo.imagens;

import java.io.IOException;

/**
 * @author Adaptado de "Padrões de Projeto: Soluções reutilizáveis de software orientado a objetos"
 *
 */
public interface Imagem {
	
	String getCaminho();
	
	String getNome();
	
	byte[] getConteudo() throws IOException;
	
}
