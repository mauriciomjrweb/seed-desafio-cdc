package mauriciojrweb.desafio.cdc.controller.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import mauriciojrweb.desafio.cdc.domain.Estado;
import mauriciojrweb.desafio.cdc.domain.Pais;

public class ClienteRequest {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String nome;

    @NotBlank
    private String sobrenome;

    @NotBlank
    private String documento; //    CPF ou CNPJ

    private String endereco;

    private String complemento;

    private String cidade;

    private Pais pais;

    private Estado estado; //   (caso aquele pais tenha estado)

    private String telefone;

    private String cep;

}
