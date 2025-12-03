import java.util.Date;
import java.util.List;

public class Relato {
    private int id;
    private String descricao;
    private List<String> midia;
    private boolean anonimo;
    private Date dataCriacao;
    private int numeroCurtidas;
    private EStatusRelato status; // Associação unidirecional com o enum EStatusRelato;
    private ECategoria categoria; // Associação unidirecional com o enum ECategoria;
    private Localizacao localizacao;    // Asociação por composição.
    private Usuario usuario; // Associação bidirecional.

    public Relato(int id, String descricao, List<String> midia, boolean anonimo, Date dataCriacao, int numeroCurtidas, EStatusRelato status, ECategoria categoria, String bairro, String rua, double latitude, double longitude, Usuario usuario) {
        this.id = id;
        this.descricao = descricao;
        this.midia = midia;
        this.anonimo = anonimo;
        this.dataCriacao = dataCriacao;
        this.numeroCurtidas = numeroCurtidas;
        this.status = status;
        this.categoria = categoria;
        // Associação por composição. Neste caso deve-se construir o objeto localização no construtor de relato.
        this.localizacao = new Localizacao(bairro, rua, latitude, longitude);
        this.usuario = usuario;
    }

    public void criar(){
        return;
    }

    public void remover(){
        return;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getMidia() {
        return midia;
    }

    public void setMidia(List<String> midia) {
        this.midia = midia;
    }

    public boolean isAnonimo() {
        return anonimo;
    }

    public void setAnonimo(boolean anonimo) {
        this.anonimo = anonimo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getNumeroCurtidas() {
        return numeroCurtidas;
    }

    // Set Curtidas não é muito interessante ter.
/*    public void setNumeroCurtidas(int numeroCurtidas) {
        this.numeroCurtidas = numeroCurtidas;
    }*/

    public EStatusRelato getStatus() {
        return status;
    }

    public void setStatus(EStatusRelato status) {
        this.status = status;
    }

    public ECategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ECategoria categoria) {
        this.categoria = categoria;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    // Não pode ter setLocalização por causa da composição.
}
