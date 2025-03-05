package mauriciojrweb.desafio.cdc.service;

import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.LivroRequest;
import mauriciojrweb.desafio.cdc.domain.Livro;
import mauriciojrweb.desafio.cdc.repository.LivroRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LivroService {

    private final LivroRepository livroRepository;
    private final CategoriaService categoriaService;
    private final AutorService autorService;

    public void salva(LivroRequest livroRequest) {

        var categoria = categoriaService.get(livroRequest.getCategoria().getId());
        var autor = autorService.get(livroRequest.getAutor().getId());

        Livro livro = livroRequest.toLivro();
        livro.setCategoria(categoria);
        livro.setAutor(autor);

        livroRepository.save(livro);
    }

}
