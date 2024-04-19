package br.com.fiap.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.barbearia.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {


}
