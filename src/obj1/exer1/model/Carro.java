package obj1.exer1.model;

public class Carro {
    // ATRIBUTOS DA CLASSE CARRO
    private String marca;
    private  String modelo;
    private  Integer anoFabricacao;

    // CONSTRUTOR PADRÃO DA CLASSE CARRO OU VAZIO
    public Carro() {
    }

    //CONSTRUTOR PARAMETRIZADO
    public Carro(String marca, String modelo, Integer anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    //METODOS ACESSORES GETTERS E SETTERS DA CLASSE CARRO
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    //METODO UTILITARIO toString DA CLASSE CARRO
    @Override
    public String toString() {
        return "{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}


