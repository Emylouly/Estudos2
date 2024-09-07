package Quest1;
public class Celula {

    private Celula proxima;
    private Celula anterior;
    private Contatos contatos;

    public Celula (Celula proxima, Celula anterior, Contatos contatos){

        super();
        this.proxima=proxima;
        this.anterior=anterior;
        this.contatos=contatos;

    }

    public Celula(Contatos contatos){

        super();
        this.contatos=contatos;

    }

    public Celula(){}

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Contatos getContatos() {
        return contatos;
    }

    public void setContatos(Contatos contatos) {
        this.contatos = contatos;
    }

}
