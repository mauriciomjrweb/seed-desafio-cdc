package mauriciojrweb.desafio.cdc.repository;

import mauriciojrweb.desafio.cdc.domain.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    boolean existsByEmail(String email);
}
