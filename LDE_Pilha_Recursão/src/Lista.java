public class Lista {

    public Celula cabeca;
    public Celula cauda;
    public int totalelementos;

    public void adicionarinicio(Contatos c){

        if(this.totalelementos==0){

            Celula nova = new Celula(c);
            this.cabeca = nova;
            this.cauda = nova;

        }

        else{

            Celula nova = new Celula(this.cabeca, null, c);
            this.cabeca.setAnterior(nova);
            this.cabeca=nova;

        }

            this.totalelementos++;

    }

    public void adicionarfim(Contatos c){

        if(this.totalelementos==0){

            Celula nova = new Celula(c);
            this.cabeca=nova;
            this.cauda=nova;

        }

        else{

            Celula nova = new Celula(null, this.cauda, c);
            this.cauda.setProxima(nova);
            this.cauda=nova;

        }

        this.totalelementos++;

    }

    public void removernoinicio(){

        if(this.totalelementos==0){

            System.out.println("Lista vazia!");

        }

        else{

            this.cabeca = this.cabeca.getProxima();

            if(this.cabeca !=null){

                this.cabeca.setAnterior(null);

            }

            else{

                this.cabeca=null;

            }

            this.totalelementos--;

        }

    }

    public void removerfim(){

        if(this.totalelementos==0){

            System.out.println("Lista vazia!!");

        }

        else{

            this.cauda=this.cauda.getAnterior();

            if(this.cauda !=null){

                this.cauda.setProxima(null);

            }

            else{

                this.cauda=null;

            }

            this.totalelementos--;

        }

    }

    public void adicionarPorPosicao(Contatos c, int p){

        if(p<0 || p>this.totalelementos){

            throw new IllegalArgumentException("Posição inválida!");

        }
        
        if(p==0){

            adicionarinicio(c);

        }

        else if(p==this.totalelementos){

            adicionarfim(c);
        }

        else {

            this.totalelementos++;

            Celula atual = this.cabeca;

            for(int i =0; i<p-1; i++){

                atual = atual.getProxima();

            }

            Celula nova = new Celula(atual.getProxima(), atual, c);
            atual.getProxima().setAnterior(nova);
            atual.setProxima(nova);

        }

    }

    public void removerPorPosição(int p){

        if(p<0 || p>=this.totalelementos){

            throw new IllegalArgumentException("Posição invalida!");

        }

        else if(p==0){

            removernoinicio();

        }

        else if(p==this.totalelementos-1){

            removerfim();

        }

        else{

            Celula atual = this.cabeca;

            for(int i=0; i<p; i++){

                atual = atual.getProxima();

            }

            Celula anterior = atual.getAnterior();
            Celula proximo = atual.getProxima();

            atual.getAnterior().setProxima(proximo);
            atual.getProxima().setAnterior(anterior);

            this.totalelementos--;

        }

    }

    public void procurar(String nome){

        if(this.totalelementos==0){

            throw new IllegalArgumentException("Lista vazia!!");

        }
        
        Celula atual = this.cabeca;

        for(int i=0; i<this.totalelementos; i++){

            if(atual.getContatos().getNome().equals(nome)){

                System.out.println("\n\nNome: " + atual.getContatos().getNome() + "\nEndereco: " + atual.getContatos().getEndereco() + "\nTelefone: " + atual.getContatos().getTelefone());
                return;
            }

            atual = atual.getProxima();

        }

        System.out.println("Contato não encontrado!!");

    }

    public void imprimir(){

        Celula aux = this.cabeca;

        for(int i = 0; i<this.totalelementos; i++){

            System.out.println("Nome: " + aux.getContatos().getNome() + "\nEndereco: " + aux.getContatos().getEndereco() + "\nTelefone: " + aux.getContatos().getTelefone());
            aux = aux.getProxima();
        }

    }

}
