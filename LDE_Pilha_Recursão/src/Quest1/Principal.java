package Quest1;
public class Principal {

    public static void main(String[] args) {
        
        Contatos c = new Contatos("Emily", "Rua centro", "126544");
        Contatos c1 = new Contatos("Louise", "Rua Sao Jorge", "3254168");
        Contatos c2 = new Contatos("Bezerra", "Rua Vicente", "984456");
        Contatos c3 = new Contatos("Araujo", "Rua Água", "23014588");

        Lista l = new Lista();

        l.adicionarinicio(c);
        l.adicionarfim(c3);
        l.adicionarinicio(c1);
        l.adicionarPorPosicao(c2, 3);

        //l.imprimir();

        //l.removernoinicio();
        //l.removernoinicio();

        System.out.println("\n\n");

        l.imprimir();

        l.procurar("Araujo");






    }

}
