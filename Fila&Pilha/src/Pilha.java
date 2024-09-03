import java.util.Stack;

public class Pilha {

    Stack<Processo> pilha = new Stack<Processo>();

    public void adicionar(Processo p){

        pilha.push(p);

    }

    public Processo remover(){

        return pilha.pop();

    }

    public boolean verificar(){

        return pilha.isEmpty();

    }

    public void mostrar(){

        System.out.println(pilha.toString());

    }

}
