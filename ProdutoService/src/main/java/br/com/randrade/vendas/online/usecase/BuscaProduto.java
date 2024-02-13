/**
 * 
 */
package br.com.randrade.vendas.online.usecase;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.randrade.vendas.online.domain.Produto;
import br.com.randrade.vendas.online.domain.Produto.Status;
import br.com.randrade.vendas.online.exception.EntityNotFoundException;
import br.com.randrade.vendas.online.repository.IProdutoRepository;

/**
 * @author rafael.andrade
 *
 */
@Service
public class BuscaProduto {

	private IProdutoRepository produtoRepository;
	
	
	public BuscaProduto(IProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Page<Produto> buscar(Pageable pageable) {
		return produtoRepository.findAll(pageable);
	}
	
	public Page<Produto> buscar(Pageable pageable, Status status) {
		return produtoRepository.findAllByStatus(pageable, status);
	}

	public Produto buscarPorCodigo(String codigo) {
		return produtoRepository.findByCodigo(codigo)
				.orElseThrow(() -> new EntityNotFoundException(Produto.class, "codigo", codigo));
	}

	
}
