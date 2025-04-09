package mauriciojrweb.desafio.cdc.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import mauriciojrweb.desafio.cdc.controller.dto.request.PedidoRequest;
import mauriciojrweb.desafio.cdc.validator.CarrinhoTotalValidator;
import mauriciojrweb.desafio.cdc.validator.EstadoPertencePaisValidator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping("pedidos")
@RestController
public class PedidoController {

    private final EstadoPertencePaisValidator estadoPertencePaisValidator;
    private final CarrinhoTotalValidator carrinhoTotalValidator;

    @InitBinder
    public void init(WebDataBinder binder) {
        binder.addValidators(estadoPertencePaisValidator, carrinhoTotalValidator);
    }

    @PostMapping
    public void criaCompra(@RequestBody @Valid PedidoRequest pedidoRequest) {
        System.out.println(pedidoRequest);
    }


}
