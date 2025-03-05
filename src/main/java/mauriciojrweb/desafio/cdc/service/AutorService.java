package mauriciojrweb.desafio.cdc.service;

import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.AutorRequest;
import mauriciojrweb.desafio.cdc.domain.Autor;
import mauriciojrweb.desafio.cdc.repository.AutorRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AutorService {

    private AutorRepository autorRepository;

    public void salva(AutorRequest autorRequest) {
        autorRepository.save(autorRequest.toAutor());
    }

    public Autor get(long autorId) {
        return autorRepository.findById(autorId)
                .orElseThrow(() -> new RuntimeException("Autor não encontrado"));
    }

}
