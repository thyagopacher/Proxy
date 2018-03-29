package br.com.padroes.proxy.utils;

import br.com.padroes.proxy.dao.protocolo.ProtocoloAtendimentoDao;
import br.com.padroes.proxy.dao.protocolo.ProtocoloAtendimentoDaoImpl;
import br.com.padroes.proxy.modelo.cliente.Cliente;
import br.com.padroes.proxy.modelo.protocolo.Protocolo;
import br.com.padroes.proxy.modelo.protocolo.ProtocoloAtendimento;
import br.com.padroes.proxy.protection.ProtocoloProtectionProxy;
import br.com.padroes.proxy.remote.ProtocoloRemoteProxy;
import br.com.padroes.proxy.smartRef.ProtocoloSR1Proxy;
import br.com.padroes.proxy.smartRef.ProtocoloSR2Proxy;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public class Atendimento {
	
	private ProtocoloAtendimentoDao protocoloDao = new ProtocoloAtendimentoDaoImpl();
	
	public Protocolo abrirProtection(Cliente cliente){
		final ProtocoloAtendimento protocolo = protocoloDao.inserir(new ProtocoloAtendimento(0, cliente));
		return new ProtocoloProtectionProxy(protocolo);
	}
	
	public Protocolo abrirRemote(Cliente cliente){
		final ProtocoloAtendimento protocolo = protocoloDao.inserir(new ProtocoloAtendimento(0, cliente));
		protocolo.setCliente(null);
		return new ProtocoloRemoteProxy(protocolo);	
	}
	
	public Protocolo abrirPrimeiraSmartReference(Cliente cliente){
		final ProtocoloAtendimento protocolo = protocoloDao.inserir(new ProtocoloAtendimento(0, cliente));
		return new ProtocoloSR1Proxy(protocolo);
	}

	public Protocolo abrirSegundaSmartReference(Cliente cliente){
		final ProtocoloAtendimento protocolo = protocoloDao.inserir(new ProtocoloAtendimento(0, cliente));
		protocolo.setCliente(null);
		return new ProtocoloSR2Proxy(protocoloDao, protocolo);
	}

}
