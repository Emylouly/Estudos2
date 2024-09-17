import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        // Lista com os elementos fornecidos
        String[] elementos = {
            "Cempasúchil", "Mariachi", "Pan de muertos", "Cruz", "Fruego (vela)", 
            "Viento", "Tierra", "Agua", "La catrina", "Altar", "Alebrijes", 
            "Instrumentos musicales (guitarra, chocalho…)", "Sombrero", "Retrato", 
            "Plato de sal", "Traje de mariachi", "Reunión familiar", 
            "Calaveras dulces", "Frutas", "Tamale", "Café e bebida alcohólica"
        };

        // Lista que vai armazenar as combinações
        List<List<String>> combinacoes = new ArrayList<>();

        // Gerar todas as combinações de 9 elementos
        gerarCombinacoes(elementos, 9, 0, new ArrayList<>(), combinacoes);

        // Exibir 60 combinações como exemplo, embaralhando a ordem
        for (int i = 0; i < 60 && i < combinacoes.size(); i++) {
            List<String> combinacao = new ArrayList<>(combinacoes.get(i));
            Collections.shuffle(combinacao); // Embaralhar a ordem dos elementos
            System.out.println("Cartela " + (i + 1) + ": " + combinacao);
        }
    }

    // Método recursivo para gerar combinações
    private static void gerarCombinacoes(String[] elementos, int tamanhoCombinacao, int inicio, List<String> combinacaoAtual, List<List<String>> combinacoes) {
        if (combinacaoAtual.size() == tamanhoCombinacao) {
            combinacoes.add(new ArrayList<>(combinacaoAtual));
            return;
        }

        for (int i = inicio; i < elementos.length; i++) {
            combinacaoAtual.add(elementos[i]);
            gerarCombinacoes(elementos, tamanhoCombinacao, i + 1, combinacaoAtual, combinacoes);
            combinacaoAtual.remove(combinacaoAtual.size() - 1); // Voltar ao estado anterior
        }
    }
}

