package br.com.padroes.proxy.smartRef;

import br.com.padroes.proxy.dao.protocolo.ProtocoloAtendimentoDao;
import br.com.padroes.proxy.modelo.cliente.Cliente;
import br.com.padroes.proxy.modelo.protocolo.Protocolo;
import br.com.padroes.proxy.modelo.protocolo.ProtocoloAtendimento;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public class ProtocoloSR2Proxy implements Protocolo {

	private final ProtocoloAtendimento protocolo;

	private ProtocoloAtendimentoDao protocoloDao;

	public ProtocoloSR2Proxy(ProtocoloAtendimentoDao protocoloDao, ProtocoloAtendimento protocolo) {
		this.protocolo = protocolo;
		this.protocoloDao = protocoloDao;
	}

	public String getId() {
		return getProtocolo().getId();
	}

	public long getNumero() {
		return this.getProtocolo().getNumero();
	}

	public Protocolo getProtocolo() {
		return protocolo;
	}

	public Cliente getCliente() {
		if (protocolo.getCliente() == null) {
			protocolo.setCliente(protocoloDao.getClienteDeProtocolo(this.getProtocolo().getId()));
		}

		return protocolo.getCliente();
	}

}
