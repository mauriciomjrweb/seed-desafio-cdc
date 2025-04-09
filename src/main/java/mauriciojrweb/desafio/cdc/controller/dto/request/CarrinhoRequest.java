package mauriciojrweb.desafio.cdc.controller.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class CarrinhoRequest {

    @NotNull
    @Min(1)
    private BigDecimal total;

    @NotNull
    private List<@Valid ItemCarrinhoRequest> itens;

}
