import java.util.Date;

// Classe associativa entre usuario e relatorio.
public class Curtida {
    private Date dataHora;
    private Usuario usuario;
    private Relato relato;

    public Curtida(Date dataHora, Usuario usuario, Relato relato) {
        this.dataHora = dataHora;
        this.usuario = usuario;
        this.relato = relato;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Relato getRelatorio() {
        return relato;
    }

}
