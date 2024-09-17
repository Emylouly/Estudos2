package Quest3_Feita_em_sala;

public class Converter {

    public int decimal(String binario) {

        // Caso base: se a string binária está vazia, retorna 0
        if (binario.isEmpty()) {
            return 0;
        }

        // Tamanho da string binária
        int tamanho = binario.length();

        // Captura o primeiro bit (o mais significativo) como inteiro
        int bit = Integer.parseInt(binario.substring(0, 1));

        // Resto da string binária (sem o primeiro bit)
        String bitRestante = binario.substring(1);

        // O primeiro bit é multiplicado pela potência correta de 2 (baseado na posição)
        return bit * (int) Math.pow(2, tamanho - 1) + decimal(bitRestante);
    }

}
