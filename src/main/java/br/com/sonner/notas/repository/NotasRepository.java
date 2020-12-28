package br.com.sonner.notas.repository;

import br.com.sonner.notas.models.CadastroNotas;
import org.springframework.data.jpa.repository.JpaRepository;

// JPA Repository possui vários métodos prontas para fazer persistência no Banco de Dados.
public interface NotasRepository extends JpaRepository<CadastroNotas, Long> {
    CadastroNotas findById(long id);
}
