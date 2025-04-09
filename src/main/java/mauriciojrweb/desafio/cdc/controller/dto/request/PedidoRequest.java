package mauriciojrweb.desafio.cdc.controller.dto.request;

import jakarta.validation.constraints.NotNull;

public class PedidoRequest {

    @NotNull
    private ClienteRequest cliente;

    @NotNull
    private CarrinhoRequest carrinho;

}
