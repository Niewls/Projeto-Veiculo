package POO.DOMINIO;
public abstract class BaseLocalizacao extends BaseIdentificador{
    protected String cidadeUF;
    protected String estadoUF;
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    public BaseLocalizacao(int codigo, String cidadeUF, String estadoUF) {
        super(codigo);
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
    }
}
