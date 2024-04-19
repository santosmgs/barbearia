package br.com.fiap.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.barbearia.model.Movimentacao;

public interface MovimentacaoRepository 
            extends JpaRepository<Movimentacao, Long> {
    
}
