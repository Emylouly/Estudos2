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

    public void imprimir(){

        Celula aux = this.cabeca;

        for(int i = 0; i<this.totalelementos; i++){

            System.out.println("Nome: " + aux.getContatos().getNome() + "\nEndereco: " + aux.getContatos().getEndereco() + "\nTelefone: " + aux.getContatos().getTelefone());
            aux = aux.getProxima();
        }

    }

}
