package mauriciojrweb.desafio.cdc.controller.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import mauriciojrweb.desafio.cdc.domain.Autor;

@Getter
@Setter
public class AutorRequest {
    @NotBlank
    private String nome;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(max = 400)
    private String descricao;


    public Autor toAutor() {
        return new Autor(this.nome, this.email, this.descricao);
    }


}

