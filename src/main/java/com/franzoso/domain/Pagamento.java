package com.franzoso.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pagamento {
   
	private Integer quantidadeParcelas;
	private Double valorEntrada;
}
