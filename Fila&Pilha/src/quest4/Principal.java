package quest4;
public class Principal {

    public static void main(String[] args) {
        
        Fila f = new Fila();
        Pilha p = new Pilha();

        Processo p1 = new Processo("dsdgsg", 131214);
        Processo p2 = new Processo("ncvcv", 7567457);
        Processo p3 = new Processo("wqrer", 534334);
        Processo p4 = new Processo("assfd", 79679);

        f.adicionar(p1);
        f.adicionar(p2);
        f.adicionar(p3);
        f.adicionar(p4);

        p.adicionar(p1);
        p.adicionar(p2);
        p.adicionar(p3);
        p.adicionar(p4);
        
        System.out.print("\n");
        p.mostrarprimeiro();

        System.out.print("\n");
        p.mostrar();

        System.out.print("\n");
        
        System.out.println("Fila invertida: ");
        while (!p.verificar()) {
            System.out.print(p.remover() + " - ");
        }

        System.out.print("\n\n");
        System.out.println(f.verificar());


    }

}
