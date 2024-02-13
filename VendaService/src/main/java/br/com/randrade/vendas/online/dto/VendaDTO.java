/**
 * 
 */
package br.com.randrade.vendas.online.dto;

import java.time.Instant;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author rafael.andrade
 *
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
public class VendaDTO {
	
	@NotNull
	@Size(min = 2, max = 10)
	private String codigo;
	
	@NotNull
	private String clienteId;
	
	@NotNull
	private Instant dataVenda;

}
