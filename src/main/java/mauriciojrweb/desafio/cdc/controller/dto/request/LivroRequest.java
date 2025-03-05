package mauriciojrweb.desafio.cdc.controller.dto.request;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import mauriciojrweb.desafio.cdc.domain.Livro;
import mauriciojrweb.desafio.cdc.validator.NotEmptyLongId;
import mauriciojrweb.desafio.cdc.validator.UniqueValue;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class LivroRequest {

    @NotBlank
    @UniqueValue(domainClass = Livro.class, fieldName = "titulo")
    private String titulo;

    @NotBlank
    @Size(max = 500)
    private String resumo;

    private String sumario;

    @Min(20)
    private BigDecimal preco;

    @Min(100)
    private int numeroPaginas;

    @UniqueValue(domainClass = Livro.class, fieldName = "isbn")
    private String isbn;

    @Future
    private LocalDate dataPublicacao;

    @NotNull
    @NotEmptyLongId
    private LongIdRequest categoria;

    @NotNull
    @NotEmptyLongId
    private LongIdRequest autor;

    public Livro toLivro() {
        return new Livro(titulo, resumo, sumario, preco, numeroPaginas, isbn, dataPublicacao);
    }
}
