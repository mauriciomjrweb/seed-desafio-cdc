package mauriciojrweb.desafio.cdc.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CPFouCNPJValidator implements ConstraintValidator<CPFouCNPJ, String> {

    private final String REGEX_CPF = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
    private final String REGEX_CNPJ = "\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}";

    @Override
    public void initialize(CPFouCNPJ constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String documento, ConstraintValidatorContext constraintValidatorContext) {

        if (documento.matches(REGEX_CPF))
            return DocumentoValidator.isCPFValido(documento);

        if (documento.matches(REGEX_CNPJ))
            return DocumentoValidator.isCNPJValido(documento);

        return false;
    }

}
