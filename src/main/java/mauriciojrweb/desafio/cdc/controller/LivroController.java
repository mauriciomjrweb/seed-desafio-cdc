package mauriciojrweb.desafio.cdc.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.LivroRequest;
import mauriciojrweb.desafio.cdc.controller.dto.response.LivroResponse;
import mauriciojrweb.desafio.cdc.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("livros")
@RestController
public class LivroController {

    private final LivroService livroService;

    @PostMapping
    public void cria(@RequestBody @Valid LivroRequest livroRequest) {
        livroService.salva(livroRequest);
    }

    @GetMapping
    public List<LivroResponse> lista(){
       return livroService.lista();
    }

}
