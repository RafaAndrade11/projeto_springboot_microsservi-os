/**
 * 
 */
package br.com.randrade.vendas.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.randrade.vendas.online.domain.Venda;

/**
 * @author rafael.andrade
 *
 */
@Repository
public interface IVendaRepository extends MongoRepository<Venda, String>{

	Optional<Venda> findByCodigo(String codigo);
}
