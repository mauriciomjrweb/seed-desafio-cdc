package mauriciojrweb.desafio.cdc.controller.dto.response;

import lombok.Getter;
import mauriciojrweb.desafio.cdc.domain.Autor;

@Getter
public class AutorResponse {
    private long id;
    private String nome;

    public AutorResponse(Autor autor) {
        this.id = autor.getId();
        this.nome = autor.getNome();
    }
}
