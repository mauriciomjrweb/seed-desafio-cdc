package mauriciojrweb.desafio.cdc.service;

import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.AutorRequest;
import mauriciojrweb.desafio.cdc.repository.AutorRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AutorService {

    private final AutorRepository autorRepository;

    public void salva(AutorRequest autorRequest) {
        autorRepository.save(autorRequest.toAutor());
    }

}
