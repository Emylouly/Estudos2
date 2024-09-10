package Quest3_Feita_em_sala;

public class Converter {

    public int decimal(String binario){

        int tamanho = binario.length();

        int bit = Integer.parseInt(binario.substring(0, 1));

        String bitrestante = binario.substring(1);

        if(tamanho>0){

            return bit*(int) Math.pow(2, bit-1)+decimal(bitrestante);

        }

        return 0;

    }

}
