package mauriciojrweb.desafio.cdc.controller.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import mauriciojrweb.desafio.cdc.domain.Categoria;

@Setter
@Getter
public class CategoriaRequest {

    @NotBlank
    private String nome;

    public Categoria toCategoria() {
        return new Categoria(this.nome);
    }

}
