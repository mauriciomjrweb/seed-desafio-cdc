package mauriciojrweb.desafio.cdc.unitario;

import mauriciojrweb.desafio.cdc.validator.DocumentoValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoValidatorTest {

    //  Testes para CPF
    @ParameterizedTest
    @NullAndEmptySource
    void DadoDocumentoCPFVazioOuNulo_QuandoValida_EntaoRetornaFalse(String documentoCpf) {
        assertFalse(DocumentoValidator.isCPFValido(documentoCpf));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ",
            "123456789", "123456789012",
            "123.456.78A-90", "ABC.DEF.GHI-JK",
            "000.000.000-00", "222.222.222-22", "999.999.999-99",
            "001.998.067-73", "540.493.368-28", "147.197.586-76",
            "08374119393", "95051747307", "61402250646"})
    void DadoDocumentoCPFInvalido_QuandoValida_EntaoRetornaFalse(String documentoCpf) {
        assertFalse(DocumentoValidator.isCPFValido(documentoCpf));
    }

    @ParameterizedTest
    @ValueSource(strings = {" 123.456.789-09 ", "123 .456. 789 -09",
            "99500848228", "74206679347", "92843439841",
            "756.411.493-22", "504.291.131-61", "242.346.351-03"})
    void DadoDocumentoCPFValido_QuandoValida_EntaoRetornaTrue(String documentoCpf) {
        assertTrue(DocumentoValidator.isCPFValido(documentoCpf));
    }


    //  Testes para CNPJ
    @ParameterizedTest
    @NullAndEmptySource
    void DadoDocumentoCNPJVazioOuNulo_QuandoValida_EntaoRetornaFalse(String documentoCnpj) {
        assertFalse(DocumentoValidator.isCNPJValido(documentoCnpj));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ",
            "1234567890123", "123456789012345",
            "90.123.45A/0001-02", "AB.CDE.FGH/IJKL-MN",
            "00.000.000/0000-00", "22.222.222/2222-22", "11.111.111/1111-11",
            "23.456.789/0001-94", "98.765.432/0001-99", "56.789.123/0001-00",
            "78901234000180", "89012345000130", "90123456000101"})
    void DadoDocumentoCNPJInvalido_QuandoValida_EntaoRetornaFalse(String documentoCnpj) {
        assertFalse(DocumentoValidator.isCNPJValido(documentoCnpj));
    }

    @ParameterizedTest
    @ValueSource(strings = {" 23.456.789/0001-95 ", "85.869 .259/0001- 26",
            "85.869.259/0001-26", "43.355.636/0001-69", "62.883.789/0001-23",
            "93251734000124", "95848163000135", "58212077000105"})
    void DadoDocumentoCNPJValido_QuandoValida_EntaoRetornaTrue(String documentoCnpj) {
        assertTrue(DocumentoValidator.isCNPJValido(documentoCnpj));
    }

}