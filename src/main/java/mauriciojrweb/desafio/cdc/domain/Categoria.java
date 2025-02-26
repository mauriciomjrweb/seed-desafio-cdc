package mauriciojrweb.desafio.cdc.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String nome;

    @Deprecated
    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }
}
