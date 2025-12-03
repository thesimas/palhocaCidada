import java.util.Date;

public class SobreProjeto {
    private String textoMissao;
    private String textoObjetivos;
    private Date dataUltimaAtualizacao;

    // Construtor
    public SobreProjeto(String textoMissao, String textoObjetivos) {
        this.textoMissao = textoMissao;
        this.textoObjetivos = textoObjetivos;
        this.dataUltimaAtualizacao = new Date(); // Define a data de agora na criação
    }


    public String exibir() {
        return "Missão: " + textoMissao + "\n" +
                "Objetivos: " + textoObjetivos + "\n" +
                "Última atualização: " + dataUltimaAtualizacao;
    }

    // Getters e Setters
    public String getTextoMissao() {
        return textoMissao;
    }

    public void setTextoMissao(String textoMissao) {
        this.textoMissao = textoMissao;
        this.dataUltimaAtualizacao = new Date();
    }

    public String getTextoObjetivos() {
        return textoObjetivos;
    }

    public void setTextoObjetivos(String textoObjetivos) {
        this.textoObjetivos = textoObjetivos;
        this.dataUltimaAtualizacao = new Date();
    }

    public Date getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(Date dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }
}