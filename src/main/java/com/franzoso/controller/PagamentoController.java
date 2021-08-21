package com.franzoso.controller;

import com.franzoso.domain.Pagamento;
import com.franzoso.repositories.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PagamentoController {

    @Autowired
    private PagamentoRepository repository;

    public PagamentoController(PagamentoRepository repository) {
        this.repository = repository;
    }
    @GetMapping (value = "/pagamentos")
    public List<Pagamento> GetPagamentos() {
        return repository.findAll();
    }

    @PostMapping ("/pagamento")
    public Pagamento addPagamento(@RequestBody Pagamento pagamento){
        return repository.save(pagamento);
    }
    @GetMapping(value = "/pagamento/{id}")
    public Optional<Pagamento> getPagamento(@PathVariable Long id){
        return repository.findById(id);
    }
    @DeleteMapping ("/pagamento/{id}")
    public void removePagamento(@PathVariable Long id){
        repository.deleteById(id);
    }


}
