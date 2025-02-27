package mauriciojrweb.desafio.cdc.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.ObjectUtils;

public class NotEmptyLongIdValidator implements ConstraintValidator<NotEmptyLongId, mauriciojrweb.desafio.cdc.controller.dto.request.LongIdRequest> {

    @Override
    public void initialize(NotEmptyLongId constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(mauriciojrweb.desafio.cdc.controller.dto.request.LongIdRequest longIdRequest, ConstraintValidatorContext constraintValidatorContext) {
        return !ObjectUtils.isEmpty(longIdRequest.getId());
    }
}
