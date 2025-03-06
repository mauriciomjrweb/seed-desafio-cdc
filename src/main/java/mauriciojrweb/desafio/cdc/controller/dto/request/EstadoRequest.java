package mauriciojrweb.desafio.cdc.controller.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import mauriciojrweb.desafio.cdc.domain.Estado;
import mauriciojrweb.desafio.cdc.domain.Pais;
import mauriciojrweb.desafio.cdc.validator.NotEmptyLongId;
import mauriciojrweb.desafio.cdc.validator.UniqueValue;

@Getter
@Setter
public class EstadoRequest {
    @NotEmpty
    @UniqueValue(domainClass = Estado.class, fieldName = "nome")
    private String nome;

    @NotEmptyLongId
    private LongIdRequest pais;

    public Estado toEstado(Pais pais) {
        return new Estado(this.nome, pais);
    }
}
