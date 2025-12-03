import java.util.Date;

public class Administrador extends Pessoa {
    private String matricula;
    private int nivelAcesso;

    public Administrador(int id, String nome, String email, String senha, Date dataCadastro, String matricula, int nivelAcesso) {
        super(id, nome, email, senha, dataCadastro);
        this.matricula = matricula;
        this.nivelAcesso = nivelAcesso;
    }

    public void gerenciarContatos(ContatoUtil contato) {
        // Lógica para salvar ou editar o contato
    }

    public void editarSobreProjeto(SobreProjeto sobre, String novoTexto) {
        // Lógica para editar
    }

    @Override
    public void exibirMenuPrincipal() {
        // Metodos a serem implementados;
        return;
    }

    public void banirUsuario(int IdUsuario){
        // Metodos a serem implementados;
        return;
    }

    public void ocultarRelato(int idRelato){
        // Metodos a serem implementados;
        return;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
