package br.com.sonner.notas.repository;

import br.com.sonner.notas.models.Nota;
import br.com.sonner.notas.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

// JPA Repository possui vários métodos prontas para fazer persistência no Banco de Dados.
public interface ProdutoRepository extends JpaRepository<Nota, Long> {
    Produtos findById(long id);
}