package Quest1;
public class Contatos {
    
    private String nome;
    private String endereco;
    private String telefone;

    public Contatos(String nome, String endereco, String telefone){

        super();
        this.nome= nome;
        this.endereco= endereco;
        this.telefone = telefone;

    }

    public Contatos(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
