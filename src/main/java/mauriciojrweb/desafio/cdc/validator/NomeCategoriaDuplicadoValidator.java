package mauriciojrweb.desafio.cdc.validator;

import mauriciojrweb.desafio.cdc.controller.dto.request.CategoriaRequest;
import mauriciojrweb.desafio.cdc.repository.CategoriaRepository;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Objects;

@Deprecated
@Component
public class NomeCategoriaDuplicadoValidator implements Validator {

    private final CategoriaRepository categoriaRepository;

    public NomeCategoriaDuplicadoValidator(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return CategoriaRequest.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        CategoriaRequest categoriaRequest = (CategoriaRequest) target;

        if (Objects.nonNull(categoriaRequest.getNome()) && categoriaRepository.existsByNome(categoriaRequest.getNome()))
            errors.rejectValue("nome", null, "Nome da categoria informada já existe");
    }
}
