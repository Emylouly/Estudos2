public class Processo {

    private String conteudo;
    private long pid;

    public Processo(String conteudo, long pid){

        super();
        this.conteudo=conteudo;
        this.pid=pid;

    }

    public Processo(){

        super();
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Processo [conteudo=" + conteudo + ", pid=" + pid + "]";
    };

    
}
