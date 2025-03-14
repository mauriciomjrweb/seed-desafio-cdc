package mauriciojrweb.desafio.cdc.controller.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import mauriciojrweb.desafio.cdc.domain.Estado;
import mauriciojrweb.desafio.cdc.domain.Pais;
import mauriciojrweb.desafio.cdc.validator.CPFouCNPJ;

public class ClienteRequest {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String nome;

    @NotBlank
    private String sobrenome;

    @NotBlank
    @CPFouCNPJ
    private String documento; //    CPF ou CNPJ

    @NotBlank
    private String endereco;

    @NotBlank
    private String complemento;

    @NotBlank
    private String cidade;

    @NotBlank
    private Pais pais;

    private Estado estado; //   (caso aquele pais tenha estado)

    @NotBlank
    private String telefone;

    @NotBlank
    private String cep;

}
