package mauriciojrweb.desafio.cdc.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.AutorRequest;
import mauriciojrweb.desafio.cdc.service.AutorService;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping("autores")
@RestController
public class AutorController {

    private AutorService autorService;

//    private EmailAutorDuplicadoValidator emailAutorDuplicadoValidator;
//    @InitBinder
//    public void init(WebDataBinder binder) {
//        binder.addValidators(emailAutorDuplicadoValidator);
//    }

    @PostMapping
    public void cria(@RequestBody @Valid AutorRequest autorRequest) {
        autorService.salva(autorRequest);
    }

}
