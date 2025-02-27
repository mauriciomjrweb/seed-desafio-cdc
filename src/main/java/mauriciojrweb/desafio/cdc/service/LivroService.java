package mauriciojrweb.desafio.cdc.service;

import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.LivroRequest;
import mauriciojrweb.desafio.cdc.repository.LivroRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LivroService {

    private final LivroRepository livroRepository;

    public void salve(LivroRequest livroRequest){
       // livroRepository.save(livroRequest.toLivro());
    }

}
