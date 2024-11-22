public class Principal {

    public static void main(String[] args) {
        
        Estrutura e = new Estrutura();
        e.inserir(4);
        e.inserir(2);
        e.inserir(3);
        e.inserir(1);
        e.inserir(6);
        e.inserir(5);
        e.inserir(0);
        e.inserir(11);
        e.inserir(12);
        e.inserir(13);



        No n = new No();

        //e.preOrdem();
        //System.out.println("\n\n");
        //e.posOrdem();
        //System.out.println("\n\n");
        //e.inOrdem();

        n = e.valorMinimo();
		
		System.out.println("\n Valor minimo= "+n.getValor());
		
		n=e.valorMaximo();
		
		System.out.println(("\n Valor máximo= "+n.getValor()));

        Estrutura arvore = new Estrutura();
        arvore = e;

        System.out.println("Altura da árvore: " + arvore.altura());


    }

}
