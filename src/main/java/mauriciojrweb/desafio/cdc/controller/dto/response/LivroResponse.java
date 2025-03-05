package mauriciojrweb.desafio.cdc.controller.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroResponse {

    private Long id;
    private String titulo;

    public LivroResponse(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }
}
