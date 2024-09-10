package Quest4_Feita_em_sala;

import java.util.Stack;

public class Pilha {

    Stack<Character> p = new Stack<Character>();
    StringBuilder inverso = new StringBuilder();

    public boolean inverter(String palavra){

        for(int count = 0; count<palavra.length(); count++){

            p.push(palavra.charAt(count));

        }

        while (!p.isEmpty()) {

            inverso.append(p.pop());
            
        }

        if(palavra.equalsIgnoreCase(""+ inverso)){

            return true;

        }

        else{

            return false;

        }

    }

}
