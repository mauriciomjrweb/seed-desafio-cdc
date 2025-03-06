package mauriciojrweb.desafio.cdc.service;

import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.PaisRequest;
import mauriciojrweb.desafio.cdc.domain.Pais;
import mauriciojrweb.desafio.cdc.repository.PaisRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PaisService {

    private final PaisRepository paisRepository;

    public void salva(PaisRequest paisRequest) {
        paisRepository.save(paisRequest.toPais());
    }

    public Pais get(long paisId) {
        return paisRepository.findById(paisId)
                .orElseThrow(() -> new RuntimeException("País não encontrado"));
    }


}
