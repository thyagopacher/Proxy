package br.com.padroes.proxy.dao.protocolo;

import br.com.padroes.proxy.modelo.cliente.Cliente;
import br.com.padroes.proxy.modelo.protocolo.ProtocoloAtendimento;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public class ProtocoloAtendimentoDaoImpl implements ProtocoloAtendimentoDao {

	public ProtocoloAtendimento inserir(ProtocoloAtendimento protocolo) {
		return protocolo;
	}

	public Cliente getClienteDeProtocolo(String id) {
		return new Cliente("luan");
	}

}
