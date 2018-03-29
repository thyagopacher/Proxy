package br.com.padroes.proxy.utils;

import br.com.padroes.proxy.modelo.Usuario;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public class UsuarioAtual {
	
	private static Usuario atual;
	
	public static Usuario getAtual(){
		return atual;
	}

	public static void setAtual(Usuario instance) {
		UsuarioAtual.atual = instance;
	}

}
