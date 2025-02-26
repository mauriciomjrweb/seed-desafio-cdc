package mauriciojrweb.desafio.cdc.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.CategoriaRequest;
import mauriciojrweb.desafio.cdc.service.CategoriaService;
import mauriciojrweb.desafio.cdc.validator.NomeCategoriaDuplicadoValidator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping("categorias")
@RestController
public class CategoriaController {

    private final CategoriaService categoriaService;
    private final NomeCategoriaDuplicadoValidator nomeCategoriaDuplicadoValidator;

    @InitBinder
    public void init(WebDataBinder binder) {
        binder.addValidators(nomeCategoriaDuplicadoValidator);
    }

    @PostMapping
    public void cria(@RequestBody @Valid CategoriaRequest categoriaRequest) {
        //autorService.salva(autorRequest);
        categoriaService.salva(categoriaRequest);
    }

}
