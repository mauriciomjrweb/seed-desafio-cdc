package mauriciojrweb.desafio.cdc.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.CategoriaRequest;
import mauriciojrweb.desafio.cdc.service.LivroService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RequestMapping("livros")
@RestController
public class LivroController {

    private final LivroService livroService;

    @PostMapping
    public void cria(@RequestBody @Valid CategoriaRequest categoriaRequest) {
        // categoriaService.salva(categoriaRequest);
    }

}
