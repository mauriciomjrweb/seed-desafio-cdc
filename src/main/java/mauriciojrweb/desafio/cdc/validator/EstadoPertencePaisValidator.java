package mauriciojrweb.desafio.cdc.validator;

import mauriciojrweb.desafio.cdc.controller.dto.request.ClienteRequest;
import mauriciojrweb.desafio.cdc.domain.Pais;
import mauriciojrweb.desafio.cdc.repository.EstadoRepository;
import mauriciojrweb.desafio.cdc.repository.PaisRepository;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;


@Component
public class EstadoPertencePaisValidator implements Validator {

    private final PaisRepository paisRepository;
    private final EstadoRepository estadoRepository;

    public EstadoPertencePaisValidator(PaisRepository paisRepository, EstadoRepository estadoRepository) {
        this.paisRepository = paisRepository;
        this.estadoRepository = estadoRepository;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return ClienteRequest.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        if (errors.hasErrors())
            return;

        ClienteRequest clienteRequest = (ClienteRequest) target;

        Optional<Pais> possivelPais = paisRepository.findById(clienteRequest.getPaisId());

        if (possivelPais.get().getEstados().isEmpty())
            return;


        if (possivelPais.isPresent()) {
            boolean estadoPertencePais = possivelPais.get().getEstados()
                    .stream()
                    .anyMatch(estado -> estado.getId() == clienteRequest.getEstadoId());
            if (!estadoPertencePais)
                errors.rejectValue("estado", null, "Estado não pertence ao Pais informado");
        }

    }
}
