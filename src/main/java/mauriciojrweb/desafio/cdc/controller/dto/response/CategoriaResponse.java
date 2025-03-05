package mauriciojrweb.desafio.cdc.controller.dto.response;

import lombok.Getter;
import mauriciojrweb.desafio.cdc.domain.Categoria;

@Getter
public class CategoriaResponse {
    private long id;
    private String nome;

    public CategoriaResponse(Categoria categoria) {
        this.id = categoria.getId();
        this.nome = categoria.getNome();
    }
}
