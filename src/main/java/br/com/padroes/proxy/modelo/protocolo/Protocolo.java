package br.com.padroes.proxy.modelo.protocolo;

import br.com.padroes.proxy.modelo.cliente.Cliente;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public interface Protocolo {
	
	String getId();
	
	long getNumero();
	
	Cliente getCliente();

}
