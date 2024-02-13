/**
 * 
 */
package br.com.randrade.vendas.online.usecase;

import jakarta.validation.Valid;

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
public class CadastroProduto {
	
	private IProdutoRepository produtoRepository;
	
	public CadastroProduto(IProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Produto cadastrar(@Valid Produto produto) {
		produto.setStatus(Status.ATIVO);
		return this.produtoRepository.insert(produto);
	}

	public Produto atualizar(@Valid Produto produto) {
		return this.produtoRepository.save(produto);
	}

	public void remover(String id) {
		Produto prod = produtoRepository.findById(id)
		.orElseThrow(() -> new EntityNotFoundException(Produto.class, "id", id));
		prod.setStatus(Status.INATIVO);
		this.produtoRepository.save(prod);
		//this.produtoRepository.deleteById(id);
	}

}
