package mauriciojrweb.desafio.cdc.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "pais")
    List<Estado> estados;

    public Pais(String nome) {
        this.nome = nome;
    }
}
