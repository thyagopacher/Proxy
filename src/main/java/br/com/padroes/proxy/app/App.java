package br.com.padroes.proxy.app;

import br.com.padroes.proxy.modelo.Usuario;
import br.com.padroes.proxy.utils.UsuarioAtual;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public class App {
	
	public static void main(String[] args) {
		UsuarioAtual.setAtual(new Usuario("luan"));
		
		final Formulario formulario = new Formulario();
		formulario.iniciar();
		
		System.out.println("Cliente: "+formulario.getProtocolo().getCliente().getNome());
	}

}
