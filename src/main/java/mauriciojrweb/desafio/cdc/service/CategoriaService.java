package mauriciojrweb.desafio.cdc.service;

import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.CategoriaRequest;
import mauriciojrweb.desafio.cdc.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public void salva(CategoriaRequest categoriaRequest) {
        categoriaRepository.save(categoriaRequest.toCategoria());
    }
}
