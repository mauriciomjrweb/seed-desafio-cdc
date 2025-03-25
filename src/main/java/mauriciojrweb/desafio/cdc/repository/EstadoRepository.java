package mauriciojrweb.desafio.cdc.repository;

import mauriciojrweb.desafio.cdc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

    boolean existsByIdAndPaisId(Long estadoId, Long paisId);


}
