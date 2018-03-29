package br.com.padroes.proxy.virtual;

import br.com.padroes.proxy.modelo.cliente.Cliente;
import br.com.padroes.proxy.modelo.protocolo.Protocolo;
import br.com.padroes.proxy.modelo.protocolo.ProtocoloAtendimento;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public class ProtocoloVirtualProxy implements Protocolo{
	
	private ProtocoloAtendimento protocolo;
	
	public ProtocoloVirtualProxy(ProtocoloAtendimento protocolo) {
		this.protocolo = protocolo;
	}

	public String getId() {
		return protocolo.getId();
	}

	public long getNumero() {
		return protocolo.getNumero();
	}

	public Cliente getCliente() {
		return null;
	}

}
