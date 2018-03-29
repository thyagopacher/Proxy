package br.com.padroes.proxy.app;

import br.com.padroes.proxy.modelo.imagens.Imagem;
import br.com.padroes.proxy.modelo.imagens.ImagemVirtualProxy;
import br.com.padroes.proxy.modelo.imagens.Logo;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public class DialogEscolhaLogo {
	
	public DialogEscolhaLogo() {
	}

	public Imagem escolher(){
		return new ImagemVirtualProxy(new Logo("/home/luan", "Logo Novo Formulário"));
	}
}
