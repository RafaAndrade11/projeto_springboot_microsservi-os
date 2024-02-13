/**
 * 
 */
package br.com.randrade.vendas.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.randrade.vendas.online.domain.Cliente;

/**
 * @author rafael.andrade
 *
 */
@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String>{

	Optional<Cliente> findByCpf(Long cpf);
}
