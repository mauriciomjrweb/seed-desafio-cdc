package mauriciojrweb.desafio.cdc.controller.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import mauriciojrweb.desafio.cdc.validator.NotEmptyLongId;

public class ItemCarrinhoRequest {

    @NotEmptyLongId
    private Long livroId;

    @NotNull
    @Min(1)
    private int quantidade;
}
