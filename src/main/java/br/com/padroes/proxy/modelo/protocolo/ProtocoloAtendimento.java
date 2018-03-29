package br.com.padroes.proxy.modelo.protocolo;

import java.util.UUID;

import br.com.padroes.proxy.modelo.cliente.Cliente;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public class ProtocoloAtendimento implements Protocolo{

	private String id = UUID.randomUUID().toString();
	
	private long numero;
	
	private Cliente cliente;
	
	public ProtocoloAtendimento(long numero, Cliente cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public String getId() {
		return id;
	}

	public long getNumero() {
		return numero;
	}
	
	public void setNumero(long numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
