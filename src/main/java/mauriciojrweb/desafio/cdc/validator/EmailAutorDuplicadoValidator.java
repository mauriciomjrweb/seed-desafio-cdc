package mauriciojrweb.desafio.cdc.validator;

import mauriciojrweb.desafio.cdc.controller.dto.request.AutorRequest;
import mauriciojrweb.desafio.cdc.repository.AutorRepository;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Objects;

@Deprecated
@Component
public class EmailAutorDuplicadoValidator implements Validator {

    private final AutorRepository autorRepository;

    public EmailAutorDuplicadoValidator(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return AutorRequest.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        AutorRequest autorRequest = (AutorRequest) target;

        if (Objects.nonNull(autorRequest.getEmail()) && autorRepository.existsByEmail(autorRequest.getEmail()))
            errors.rejectValue("email", null, "O e-mail informado já existe");
    }
}
