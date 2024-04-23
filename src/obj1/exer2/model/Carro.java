package obj1.exer2.model;


public class Carro {
    // ATRIBUTOS DA CLASSE CARRO
    private Integer id;  //exer2.b Modifique as classes de modelo para que elas passem a conter mais um atributo, o
    //atributo de nome “id” (identificador);
    private String marca;
    private String modelo;
    private Integer anoFabricacao;

    // CONSTRUTOR PADRÃO DA CLASSE CARRO
    public Carro() {
    }

    //CONSTRUTOR PARAMETRIZADO

    public Carro(Integer id, String marca, String modelo, Integer anoFabricacao) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    //METODOS ACESSORES GETTERS E SETTERS DA CLASSE CARRO

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
        return "\nCarro{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}


