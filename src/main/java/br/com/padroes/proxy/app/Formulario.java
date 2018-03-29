package br.com.padroes.proxy.app;

import br.com.padroes.proxy.modelo.cliente.Cliente;
import br.com.padroes.proxy.modelo.imagens.Imagem;
import br.com.padroes.proxy.modelo.protocolo.Protocolo;
import br.com.padroes.proxy.utils.Atendimento;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public class Formulario {

	private final Atendimento atendimento;
	private Cliente cliente;

	private Protocolo protocolo;
	private Imagem logo;	

	public Formulario() {
		this.atendimento = new Atendimento();
	}

	public void iniciar() {
		this.logo = new DialogEscolhaLogo().escolher();
		this.cliente = new Cliente("joão");
		iniciarProtection();
	}

	private void iniciarProtection() {
		this.protocolo = atendimento.abrirProtection(cliente);
	}

	private void iniciarPrimeiraSmartReference() {
		this.protocolo = atendimento.abrirPrimeiraSmartReference(cliente);
	}

	private void iniciarSegundaSmartReference() {
		this.protocolo = atendimento.abrirSegundaSmartReference(cliente);
	}

	private void iniciarRemote() {
		this.protocolo = atendimento.abrirRemote(cliente);
	}

	public Protocolo getProtocolo() {
		return protocolo;
	}

}
