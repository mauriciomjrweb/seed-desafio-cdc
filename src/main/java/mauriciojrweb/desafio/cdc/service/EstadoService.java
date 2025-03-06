package mauriciojrweb.desafio.cdc.service;

import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.EstadoRequest;
import mauriciojrweb.desafio.cdc.domain.Pais;
import mauriciojrweb.desafio.cdc.repository.EstadoRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EstadoService {

    private final EstadoRepository estadoRepository;
    private final PaisService paisService;

    public void salva(EstadoRequest estadoRequest) {
        Pais pais = paisService.get(estadoRequest.getPais().getId());
        estadoRepository.save(estadoRequest.toEstado(pais));
    }


}
