package mauriciojrweb.desafio.cdc.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.EstadoRequest;
import mauriciojrweb.desafio.cdc.service.EstadoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RequestMapping("estados")
@RestController
public class EstadoController {

    private final EstadoService estadoService;

    @PostMapping
    public void cria(@RequestBody @Valid EstadoRequest estadoRequest) {
        estadoService.salva(estadoRequest);
    }

}
