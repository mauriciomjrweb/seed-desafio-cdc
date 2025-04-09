package mauriciojrweb.desafio.cdc.controller.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import mauriciojrweb.desafio.cdc.validator.NotEmptyLongId;

@Getter
@Setter
public class ItemCarrinhoRequest {

    @NotEmptyLongId
    private Long livroId;

    @NotNull
    @Min(1)
    private int quantidade;
}
