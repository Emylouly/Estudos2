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
        
        System.out.println(f.verificar());

        while (!f.verificar()) {

            p.adicionar(f.remover());
            
        }

        System.out.println("Fila invertida: ");
        while (!p.verificar()) {

            System.out.print(p.remover() + " - ");
            
        }
        System.out.println("\n========================");



    }

}
