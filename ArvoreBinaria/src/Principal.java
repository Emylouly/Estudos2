public class Principal {

    public static void main(String[] args) {
        
        Estrutura e = new Estrutura();
        e.inserir(4);
        e.inserir(2);
        e.inserir(3);
        e.inserir(1);
        e.inserir(6);
        e.inserir(5);
        e.inserir(7);

        No n = new No();        
        n = e.valorminimo();

        //e.preOrdem();
        //System.out.println("\n\n");
        //e.posOrdem();
        //System.out.println("\n\n");
        //e.inOrdem();

        System.out.println(n.getValor());

    }

}
