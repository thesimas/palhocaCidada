import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario extends Pessoa {
    private String telefone;
    private boolean aceitaNotificacoes;
    private List<Curtida> curtidas;
    private List<Relato> relatosUsario;

    public Usuario(int id, String nome, String email, String senha, Date dataCadastro, String telefone, boolean aceitarNotificacoes) {
        super(id, nome, email, senha, dataCadastro);
        this.telefone = telefone;
        this.aceitaNotificacoes = aceitarNotificacoes;
        this.curtidas = new ArrayList<>(); // Ao criar o objeto usuario se cria as suas listas;
        this.relatosUsario = new ArrayList<>();
    }

    public Usuario(int id, String nome, String email, String senha, Date dataCadastro) {
        super(id, nome, email, senha, dataCadastro);
        this.telefone = null;
        this.aceitaNotificacoes = false;
        this.curtidas = new ArrayList<>();
        this.relatosUsario = new ArrayList<>();
    }
    // Adicionar curtida é onde o objeto Curtida será criado, assim criando a classe associativa Curtida.
    public void adicionarCurtida(Date dataHora, Relato relato) {
        Curtida curtida = new Curtida(dataHora, this , relato);
        this.curtidas.add(curtida);
    }

    public void removerCurtida(Curtida curtida) {
        this.curtidas.remove(curtida);
    }
    // no parametro do adcionarRelato deve-se passar os argumentos que constroi o relato do usuario.
    public void adicionarRelatosUsario() {
        return;
    }

    public void removerRelatosUsario(Relato relato) {
        return;
    }

    @Override
    public void exibirMenuPrincipal() {
        // Metodos a serem implementados;
        return;
    }

    public void cadastrar(){
        // Metodos a serem implementados;
        return;
    }

    public void editarPerfil(){
        // Metodos a serem implementados;
        return;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isAceitarNotificacoes() {
        return aceitaNotificacoes;
    }

    public void setAceitarNotificacoes(boolean aceitarNotificacoes) {
        this.aceitaNotificacoes = aceitarNotificacoes;
    }

    public List<Curtida> getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(List<Curtida> curtidas) {
        this.curtidas = curtidas;
    }
}
