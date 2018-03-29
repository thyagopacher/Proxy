package br.com.padroes.proxy.dao.protocolo;

import br.com.padroes.proxy.modelo.cliente.Cliente;
import br.com.padroes.proxy.modelo.protocolo.Protocolo;
import br.com.padroes.proxy.modelo.protocolo.ProtocoloAtendimento;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public interface ProtocoloAtendimentoDao {
	
	ProtocoloAtendimento inserir(ProtocoloAtendimento protocolo);

	Cliente getClienteDeProtocolo(String id);

}
