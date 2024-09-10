package Quest4_Feita_em_sala;

public class Principal {

    public static void main(String[] args) {
        
        Pilha p = new Pilha();

        System.out.println(p.inverter("subinoonibus"));

        boolean verifica = p.inverter("subinoonibus");

        if(verifica){

            System.out.println("Não é palindromo");

        }

        else{

            System.out.println("É palindromo");

        }

    }

}
