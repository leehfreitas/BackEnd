package org.LojaGamer.LojaGamer.Repository;

import java.util.List;

import org.LojaGamer.LojaGamer.Model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
	
	public List<ProdutoModel> findAllByNomeContainingIgnoreCase(String nome);

}
