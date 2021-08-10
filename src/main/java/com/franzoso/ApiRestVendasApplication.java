package com.franzoso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.franzoso.domain.Pagamento;
import com.franzoso.domain.Produto;
import com.franzoso.repositories.PagamentoRepository;
import com.franzoso.repositories.ProdutoRepository;

@SpringBootApplication
public class ApiRestVendasApplication implements CommandLineRunner {
   
	@Autowired
	PagamentoRepository pagamentooRepository;
	@Autowired
    ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiRestVendasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
     
		Pagamento p1 = new Pagamento(null, 10, 5500.00);
		Produto pr1 = new Produto(null, "carro",55000.00);
		//pagamentooRepository.save(p1);
		//produtoRepository.save(pr1);
		
	}

}
