package mauriciojrweb.desafio.cdc.unitario;

import mauriciojrweb.desafio.cdc.validator.DocumentoValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoValidatorTest {

    //Valida
    @Test
    void DadoDocumentoCPFVazio_QuandoValida_EntaoRetornaFalse() {
        var documentoCpfVazio = "";
        assertFalse(DocumentoValidator.isCPFValido(documentoCpfVazio));
    }

    @Test
    void DadoDocumentoCPFNulo_QuandoValida_EntaoRetornaFalse() {
        assertFalse(DocumentoValidator.isCPFValido(null));
    }

    @Test
    void DadoDocumentoCPFComCaracteresNaoDigitos_QuandoValida_EntaoRetornaFalse() {
        var documentoCpf = "079.718.AAA-01";
        assertFalse(DocumentoValidator.isCPFValido(documentoCpf));
    }

    @Test
    void DadoDocumentoCPFComTamanhoMenorQue11_QuandoValida_EntaoRetornaFalse() {
        var documentoCpf = "289313872";
        assertFalse(DocumentoValidator.isCPFValido(documentoCpf));
    }

    @Test
    void DadoDocumentoCPFComTamanhoMaiorQue14_QuandoValida_EntaoRetornaFalse() {
        var documentoCpf = "289..313.872-10";
        assertFalse(DocumentoValidator.isCPFValido(documentoCpf));
    }

    @Test
    void DadoDocumentoCPFValidoComTamanho11_QuandoValida_EntaoRetornaTrue() {
        var documentoCpf = "28931387210";
        assertFalse(DocumentoValidator.isCPFValido(documentoCpf));
    }

    @Test
    void DadoDocumentoCPFValidoTamanho14_QuandoValida_EntaoRetornaTrue() {
        var documentoCpf = "289.313.872-10";
        assertFalse(DocumentoValidator.isCPFValido(documentoCpf));
    }

}