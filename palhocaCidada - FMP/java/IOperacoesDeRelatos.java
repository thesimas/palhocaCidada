import java.util.List;

public interface IOperacoesDeRelatos {

    public List<Relato> carregarRelatosRecentes();

    public List<Relato> filtrarPorCategoria(ECategoria categoria);

    public List<Relato> filtrarPorLocalizacao(String bairro);

    public List<Relato> ordenarPorCurtidas();

    public void adicionarRelato(Relato relato);
}
