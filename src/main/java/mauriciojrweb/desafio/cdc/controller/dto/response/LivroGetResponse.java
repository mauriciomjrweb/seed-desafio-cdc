package mauriciojrweb.desafio.cdc.controller.dto.response;

import lombok.Getter;
import lombok.Setter;
import mauriciojrweb.desafio.cdc.domain.Livro;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class LivroGetResponse {

    private long id;
    private String titulo;
    private String resumo;
    private String sumario;
    private BigDecimal preco;
    private int numeroPaginas;
    private String isbn;
    private LocalDate dataPublicacao;
    private CategoriaResponse categoria;
    private AutorResponse autor;

    public LivroGetResponse(Livro livro) {
        this.id = livro.getId();
        this.titulo = livro.getTitulo();
        this.resumo = livro.getResumo();
        this.sumario = livro.getSumario();
        this.preco = livro.getPreco();
        this.numeroPaginas = livro.getNumeroPaginas();
        this.isbn = livro.getIsbn();
        this.dataPublicacao = livro.getDataPublicacao();
        this.categoria = new CategoriaResponse(livro.getCategoria());
        this.autor = new AutorResponse(livro.getAutor());
    }
}
