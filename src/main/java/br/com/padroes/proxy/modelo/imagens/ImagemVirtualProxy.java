package br.com.padroes.proxy.modelo.imagens;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Adaptado de "Padrões de Projeto: Soluções reutilizáveis de software orientado a objetos"
 *
 */
public class ImagemVirtualProxy implements Imagem{
	
	private Logo logo;
	
	public ImagemVirtualProxy(Logo logo) {
		this.logo = logo;
	}

	public String getCaminho() {
		return this.logo.getCaminho();
	}

	public String getNome() {
		return this.logo.getNome();
	}

	public byte[] getConteudo() throws IOException {
		if(this.logo.getConteudo() == null){
			final Path arquivo = Paths.get(this.getCaminho());
			final byte[] conteudo = Files.readAllBytes(arquivo); 
			this.logo.setConteudo(conteudo);
		}
		
		return logo.getConteudo();
	}

}
