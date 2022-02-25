package org.farmacia.Farmacia.repository;

import java.util.List;

import org.farmacia.Farmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produtorepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);

}
