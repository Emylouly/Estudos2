package quest4;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    Queue<Processo> fila = new LinkedList<Processo>();

    public void adicionar(Processo p){

        fila.add(p);

    }

    public Processo remover(){

        return fila.remove();

    }

    public boolean verificar(){

        return fila.isEmpty();

    }

    public void mostrar(){

        System.out.println(fila.toString());

    }

}
