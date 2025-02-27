package mauriciojrweb.desafio.cdc.controller.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import mauriciojrweb.desafio.cdc.domain.Categoria;
import mauriciojrweb.desafio.cdc.validator.UniqueValue;

@Setter
@Getter
public class CategoriaRequest {

    @NotBlank
    @UniqueValue(domainClass = Categoria.class, fieldName = "nome")
    private String nome;

    public Categoria toCategoria() {
        return new Categoria(this.nome);
    }

}
