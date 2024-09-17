public class DeciParaBin {
    
    public void converterParaBinario(int numero) {
        if (numero == 0) {
            System.out.print("0");
        } else if (numero > 0) {
            converterParaBinario(numero / 2);  // Chama a função com a divisão por 2
            System.out.print(numero % 2);  // Imprime o resto da divisão por 2
        }
    }

}
