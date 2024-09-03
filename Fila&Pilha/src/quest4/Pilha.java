package quest4;
import java.util.Stack;

public class Pilha {

    Stack<Processo> pilha = new Stack<Processo>();

    public void adicionar(Processo p){

        pilha.push(p);
        System.out.println("Empilhado: " + p.toString());

    }

    public Processo remover(){

        if(verificar()){

            System.out.println("Pilha vazia");
            return null;

        }

        System.out.print("Desempilhando: ");
        return pilha.pop();
    
    }

    public boolean verificar(){

        return pilha.isEmpty();

    }

    public void mostrar(){

        if(verificar()){

            System.out.println("Pilha vazia");

        }

        else{

            System.out.println("Elementos da pilha: " + pilha.toString());

        }


    }

    public void mostrarprimeiro(){

        if(verificar()){

            System.out.println("Pilha vazia");

        }

        else{

        Processo topo = pilha.firstElement();

                System.out.println("Primeiro elemento: " + topo.toString());

        }

    }

}
