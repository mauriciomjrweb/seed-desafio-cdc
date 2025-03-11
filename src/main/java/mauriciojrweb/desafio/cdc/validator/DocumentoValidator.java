package mauriciojrweb.desafio.cdc.validator;

import java.util.ArrayList;
import java.util.List;

public class DocumentoValidator {

    private final static char CARACTERER_PONTO = '.';
    private final static char CARACTERER_HIFEN = '-';

    private DocumentoValidator() {
        throw new IllegalStateException("Classe utilitária");
    }

    public static boolean isCPFValido(String documentoCpf) {

        if (documentoCpf == null || documentoCpf.isEmpty())
            return false;

        if (documentoCpf.length() < 11 || documentoCpf.length() > 14)
            return false;

        List<Integer> documentoCpfNumerico = new ArrayList<>();

        for (int i = 0; i < documentoCpf.length(); i++) {

            if (Character.isDigit(documentoCpf.charAt(i)) || documentoCpf.charAt(i) == CARACTERER_PONTO || documentoCpf.charAt(i) == CARACTERER_HIFEN)
                documentoCpfNumerico.add((int) documentoCpf.charAt(i));
            else
                return false;
        }

        int digitoVerificador1, digitoVerificador2;


        // Calcula DV 1
        int somatorioDigitoVerificador1 = 0;
        for (int i = 0; i < 9; i++) {
            somatorioDigitoVerificador1 += documentoCpfNumerico.get(i) * (10 - i);
        }

        int restoDigitoVerificador1 = somatorioDigitoVerificador1 % 11;

        digitoVerificador1 = restoDigitoVerificador1 < 2 ? 0 : 11 - restoDigitoVerificador1;

        if (documentoCpfNumerico.get(9) != digitoVerificador1)
            return false;

        // Calcula DV 2
        int somatorioDigitoVerificador2 = 0;
        for (int i = 0; i < 10; i++) {
            somatorioDigitoVerificador2 += documentoCpfNumerico.get(i) * (11 - i);
        }

        int restoDigitoVerificador2 = somatorioDigitoVerificador2 % 11;

        digitoVerificador2 = restoDigitoVerificador2 < 2 ? 0 : 11 - restoDigitoVerificador2;

        if (documentoCpfNumerico.get(10) != digitoVerificador2)
            return false;

        return true;

    }


}
