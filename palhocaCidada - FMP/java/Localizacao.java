public class Localizacao {
    private String bairro;
    private String rua;
    private double latitude;
    private double longitude;

    public Localizacao(String bairro, String rua, double latitude, double longitude) {
        this.bairro = bairro;
        this.rua = rua;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCoordenadasFormatadas(){
        StringBuilder coordenadas = new StringBuilder();
        coordenadas.append("Informaçãoes da Localização do Relato: \n");
        coordenadas.append("Bairro: "+ this.bairro).append("\n");
        coordenadas.append("Rua: "+ this.rua).append("\n");
        coordenadas.append("Latitude: "+ this.latitude).append("\n");
        coordenadas.append("Longitude: "+ this.longitude).append("\n");

        return coordenadas.toString();
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
