import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeRelatos implements IOperacoesDeRelatos {
    private List<Relato> repositorioRelatos;


    // métodos que deverão ser criados futuramente;
    public GerenciadorDeRelatos() {
        this.repositorioRelatos = new ArrayList<>();
    }

    @Override
    public void adicionarRelato(Relato relato) {
        return this.repositorioRelatos.add(relato);
    }

    @Override
    public List<Relato> carregarRelatosRecentes() {
        return this.repositorioRelatos;
    }

    @Override
    public List<Relato> filtrarPorCategoria(ECategoria categoria) {
        return this.repositorioRelatos;
    }

    @Override
    public List<Relato> filtrarPorLocalizacao(String bairro) {
        return this.repositorioRelatos;
    }

    @Override
    public List<Relato> ordenarPorCurtidas(){
        return this.repositorioRelatos;
    }
}