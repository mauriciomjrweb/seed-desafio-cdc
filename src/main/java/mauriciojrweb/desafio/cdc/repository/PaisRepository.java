package mauriciojrweb.desafio.cdc.repository;

import mauriciojrweb.desafio.cdc.domain.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {
}
