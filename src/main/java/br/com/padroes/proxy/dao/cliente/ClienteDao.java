package br.com.padroes.proxy.dao.cliente;

import br.com.padroes.proxy.modelo.cliente.Cliente;

/**
 * @author Luan Bukowitz Beluzzo
 *
 */
public interface ClienteDao {
	
	Cliente get(String id);

}
