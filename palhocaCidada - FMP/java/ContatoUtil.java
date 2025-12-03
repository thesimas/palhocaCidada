public class ContatoUtil {
    private String nomeOrgao;
    private String telefone;
    private String endereco;
    private String site;


    public ContatoUtil(String nomeOrgao, String telefone, String endereco, String site) {
        this.nomeOrgao = nomeOrgao;
        this.telefone = telefone;
        this.endereco = endereco;
        this.site = site;
    }

    public String exibir() {
        return "Órgão: " + nomeOrgao + "\n" +
                "Telelefone: " + telefone + "\n" +
                "Endereço: " + endereco + "\n" +
                "Site: " + site;
    }

    public String getNomeOrgao() {
        return nomeOrgao;
    }

    public void setNomeOrgao(String nomeOrgao) {
        this.nomeOrgao = nomeOrgao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}