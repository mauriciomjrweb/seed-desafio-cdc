package mauriciojrweb.desafio.cdc.controller.dto;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.AutorRequest;
import mauriciojrweb.desafio.cdc.service.AutorService;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping("autores")
@RestController
public class AutorController {

    private final AutorService autorService;

    @PostMapping
    public void cria(@RequestBody @Valid AutorRequest autorRequest) {

    }

}
