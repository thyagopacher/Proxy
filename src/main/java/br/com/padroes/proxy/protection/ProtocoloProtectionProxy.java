package br.com.padroes.proxy.protection;

import org.apache.commons.lang3.builder.EqualsBuilder;

import br.com.padroes.proxy.modelo.Usuario;
import br.com.padroes.proxy.modelo.cliente.Cliente;
import br.com.padroes.proxy.modelo.protocolo.Protocolo;
import br.com.padroes.proxy.modelo.protocolo.ProtocoloAtendimento;
import br.com.padroes.proxy.protection.exceptions.UsuarioNaoAutorizadoException;
import br.com.padroes.proxy.utils.UsuarioAtual;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public class ProtocoloProtectionProxy implements Protocolo{
	
	private final ProtocoloAtendimento protocolo;

	private Usuario autorizado = new Usuario("luan");
	
	public ProtocoloProtectionProxy(ProtocoloAtendimento protocolo) {
		this.protocolo = protocolo;
	}

	public String getId() {
		return getProtocolo().getId();
	}

	public long getNumero() {
		if(!usuarioAutorizado()){
			throw new UsuarioNaoAutorizadoException();
		}
		
		return this.getProtocolo().getNumero();
	}

	public Cliente getCliente() {
		if(!usuarioAutorizado()){
			throw new UsuarioNaoAutorizadoException();
		}
		
		return this.getProtocolo().getCliente();
	}
	
	public boolean usuarioAutorizado(){
		if(autorizado.getNome() != null && UsuarioAtual.getAtual().getNome() != null ){
			return autorizado.getNome().trim().equals(UsuarioAtual.getAtual().getNome().trim());
		}
		
		return false;
		
//		return new EqualsBuilder().append(autorizado.getNome(), UsuarioAtual.getAtual().getNome()).build();
	}

	public Protocolo getProtocolo() {
		return protocolo;
	}
	
	

}
