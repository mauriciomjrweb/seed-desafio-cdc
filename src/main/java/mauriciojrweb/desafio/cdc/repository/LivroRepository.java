package mauriciojrweb.desafio.cdc.repository;

import mauriciojrweb.desafio.cdc.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    @Query(value = "SELECT SUM(livro.preco) FROM Livro livro WHERE livro.id IN :livrosId")
    BigDecimal obtemPrecoTotal(@Param("livrosId") List<Long> livrosId);

}
