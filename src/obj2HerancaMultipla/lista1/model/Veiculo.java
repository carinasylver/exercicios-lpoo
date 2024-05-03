package obj2HerancaMultipla.lista1.model;

public abstract class Veiculo {
    private Integer numeroDeEixos;
    private String propulsao;
    private String marca;
    private String modelo;
    private Integer anoFabricacao;

    public Veiculo() {
    }

    public Veiculo(Integer numeroDeEixos, String propulsao, String marca, String modelo, Integer anoFabricacao) {
        this.numeroDeEixos = numeroDeEixos;
        this.propulsao = propulsao;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getNumeroDeEixos() {
        return numeroDeEixos;
    }

    public void setNumeroDeEixos(Integer numeroDeEixos) {
        this.numeroDeEixos = numeroDeEixos;
    }

    public String getPropulsao() {
        return propulsao;
    }

    public void setPropulsao(String propulsao) {
        this.propulsao = propulsao;
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

}
