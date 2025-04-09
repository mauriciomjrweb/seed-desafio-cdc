package mauriciojrweb.desafio.cdc.validator;


import mauriciojrweb.desafio.cdc.controller.dto.request.CarrinhoRequest;
import mauriciojrweb.desafio.cdc.controller.dto.request.ItemCarrinhoRequest;
import mauriciojrweb.desafio.cdc.repository.LivroRepository;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.math.BigDecimal;
import java.util.Objects;

@Component
public class CarrinhoTotalValidator implements Validator {

    private final LivroRepository livroRepository;

    public CarrinhoTotalValidator(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return CarrinhoRequest.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (errors.hasErrors())
            return;

        CarrinhoRequest carrinho = (CarrinhoRequest) target;

        BigDecimal totalCalculado = livroRepository.obtemPrecoTotal(
                carrinho.getItens().stream()
                        .map(ItemCarrinhoRequest::getLivroId)
                        .toList()
        );

        if (!Objects.equals(totalCalculado, carrinho.getTotal())) {
            errors.rejectValue("total", null, "Total do carrinho incorreto");
        }


    }
}
