package br.com.padroes.proxy.smartRef;

import br.com.padroes.proxy.modelo.cliente.Cliente;
import br.com.padroes.proxy.modelo.protocolo.Protocolo;
import br.com.padroes.proxy.modelo.protocolo.ProtocoloAtendimento;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public class ProtocoloSR1Proxy implements Protocolo{
	
	private final ProtocoloAtendimento protocolo;
	
	public ProtocoloSR1Proxy(ProtocoloAtendimento protocolo){
		this.protocolo=  protocolo;
	}

	public String getId() {
		synchronized (protocolo) {
			return protocolo.getId();
		}
	}

	public long getNumero() {
		synchronized (protocolo) {
			return protocolo.getNumero();
		}
	}

	public Cliente getCliente() {
		synchronized (protocolo) {
			return protocolo.getCliente();
		}
	}

}
