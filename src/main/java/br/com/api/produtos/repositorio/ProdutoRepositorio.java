package br.com.api.produtos.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.produtos.modelo.ProdutoModelo;

@Repository   //isso tem acesso ao repositorios e dependencias
public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Long>{
    
}
