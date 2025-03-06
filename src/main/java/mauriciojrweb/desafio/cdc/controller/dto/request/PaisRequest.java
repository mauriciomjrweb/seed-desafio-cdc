package mauriciojrweb.desafio.cdc.controller.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import mauriciojrweb.desafio.cdc.domain.Pais;
import mauriciojrweb.desafio.cdc.validator.UniqueValue;

@Getter
@Setter
public class PaisRequest {

    @NotEmpty
    @UniqueValue(domainClass = Pais.class, fieldName = "nome")
    private String nome;

    public Pais toPais() {
        return new Pais(this.nome);
    }
}
