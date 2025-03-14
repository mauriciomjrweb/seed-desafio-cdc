package mauriciojrweb.desafio.cdc.validator;

public class DocumentoValidator {

    private DocumentoValidator() {
        throw new IllegalStateException("Classe utilitária");
    }

    public static boolean isCPFValido(String documentoCpf) {

        if (documentoCpf == null || documentoCpf.isEmpty())
            return false;


        int[] cpfNumerico = new int[documentoCpf.length()];
        int indiceCpfNumerico = 0;
        int numeroDigitosIguais = 0;

        for (char caractere : documentoCpf.toCharArray()) {
            if (Character.isDigit(caractere)) {
                cpfNumerico[indiceCpfNumerico] = Character.getNumericValue(caractere);
                numeroDigitosIguais += cpfNumerico[indiceCpfNumerico] == cpfNumerico[0] ? 1 : 0;
                indiceCpfNumerico++;
            }
        }

        if (indiceCpfNumerico != 11 || numeroDigitosIguais == 11) return false;

        int[] pesosDigitoVerificador1 = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2};

        if (cpfNumerico[9] != obtemDigitoVerificador(cpfNumerico, pesosDigitoVerificador1))
            return false;


        int[] pesosDigitoVerificador2 = new int[]{11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

        return cpfNumerico[10] == obtemDigitoVerificador(cpfNumerico, pesosDigitoVerificador2);

    }

    public static boolean isCNPJValido(String documentoCnpj) {

        if (documentoCnpj == null || documentoCnpj.isEmpty())
            return false;


        int[] cnpjNumerico = new int[documentoCnpj.length()];
        int indiceCnpjNumerico = 0;
        int numeroDigitosIguais = 0;

        for (char caractere : documentoCnpj.toCharArray()) {
            if (Character.isDigit(caractere)) {
                cnpjNumerico[indiceCnpjNumerico] = Character.getNumericValue(caractere);
                numeroDigitosIguais += cnpjNumerico[indiceCnpjNumerico] == cnpjNumerico[0] ? 1 : 0;
                indiceCnpjNumerico++;
            }
        }

        if (indiceCnpjNumerico != 14 || numeroDigitosIguais == 14) return false;

        int[] pesosDv1 = new int[]{5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

        if (cnpjNumerico[12] != obtemDigitoVerificador(cnpjNumerico, pesosDv1))
            return false;

        int[] pesosDv2 = new int[]{6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

        return cnpjNumerico[13] == obtemDigitoVerificador(cnpjNumerico, pesosDv2);

    }

    private static int obtemDigitoVerificador(int[] documento, int[] pesos) {

        int somatorioDigitoVerificador1 = 0;
        for (int i = 0; i < pesos.length; i++) {
            somatorioDigitoVerificador1 += documento[i] * pesos[i];
        }

        int restoDigitoVerificador = somatorioDigitoVerificador1 % 11;

        return restoDigitoVerificador < 2 ? 0 : 11 - restoDigitoVerificador;

    }


}
