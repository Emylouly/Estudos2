import java.util.LinkedList;

public class Fila {

    LinkedList<Processo> fila = new LinkedList<Processo>();

    public void adicionar(Processo p){

        fila.addLast(p);

    }

    public Processo remover(){

        return fila.removeFirst();

    }

    public boolean verificar(){

        return fila.isEmpty();

    }

    public void mostrar(){

        System.out.println(fila.toString());

    }

}
