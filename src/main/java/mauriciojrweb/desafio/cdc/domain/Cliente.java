package mauriciojrweb.desafio.cdc.domain;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;

    @Column(nullable = false)
    private String documento; //    CPF ou CNPJ

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String complemento;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private Pais pais;

    private Estado estado; //   (caso aquele pais tenha estado)

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String cep;

}
