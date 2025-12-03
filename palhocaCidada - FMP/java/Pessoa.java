import java.util.Date;

public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected String email;
    protected String senha;
    protected Date dataCadastro;

    public Pessoa(int id, String nome, String email, String senha, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
    }

    public abstract void exibirMenuPrincipal();

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
