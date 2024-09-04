public class Principal {

    public static void main(String[] args) {
        
        Contatos c = new Contatos("Emily", "Rua centro", "126544");
        Contatos c1 = new Contatos("Louise", "Rua Sao Jorge", "3254168");
        Contatos c2 = new Contatos("Bezerra", "Rua Vicente", "984456");
        Contatos c3 = new Contatos("Araujo", "Rua Água", "23014588");

        Lista l = new Lista();

        l.adicionarinicio(c1);
        l.adicionarinicio(c2);
        l.adicionarinicio(c);
        l.adicionarinicio(c3);

        l.imprimir();


    }

}
