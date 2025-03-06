package mauriciojrweb.desafio.cdc.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.PaisRequest;
import mauriciojrweb.desafio.cdc.service.PaisService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RequestMapping("paises")
@RestController
public class PaisController {

    private final PaisService paisService;

    @PostMapping
    public void cria(@RequestBody @Valid PaisRequest paisRequest) {
        paisService.salva(paisRequest);
    }

}
