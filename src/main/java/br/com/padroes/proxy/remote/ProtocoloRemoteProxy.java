package br.com.padroes.proxy.remote;

import javax.ws.rs.client.WebTarget;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.engines.ApacheHttpClient4Engine;

import br.com.padroes.proxy.modelo.cliente.Cliente;
import br.com.padroes.proxy.modelo.protocolo.Protocolo;
import br.com.padroes.proxy.modelo.protocolo.ProtocoloAtendimento;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public class ProtocoloRemoteProxy implements Protocolo {
	
	private final ProtocoloAtendimento protocolo;

	public ProtocoloRemoteProxy(ProtocoloAtendimento protocolo) {
		this.protocolo = protocolo;
	}

	public String getId() {
		return getProtocolo().getId();
	}

	public long getNumero() {
		return getTarget().path("numero").request().get(Long.class);
	}

	public Cliente getCliente() {
		return getTarget().path("cliente").request().get(Cliente.class);
	}

	public WebTarget getTarget() {
		return criarClienteWs().target("http://localhost:8080/protocolInfoProvider/rest/"+ protocolo.getId());
	}

	private ResteasyClient criarClienteWs() {
		final ClientConnectionManager cm = new PoolingClientConnectionManager();
		final ApacheHttpClient4Engine engine = new ApacheHttpClient4Engine(new DefaultHttpClient(cm));
		return new ResteasyClientBuilder().httpEngine(engine).build();
	}

	public Protocolo getProtocolo() {
		return protocolo;
	}
	
}
