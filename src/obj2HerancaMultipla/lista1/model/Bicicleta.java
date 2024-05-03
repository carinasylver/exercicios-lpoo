package obj2HerancaMultipla.lista1.model;

public class Bicicleta extends Veiculo{
    private Integer tamanhoRoda;
    private String chassi;

    public Bicicleta() {
    }

    public Bicicleta(Integer tamanhoRoda, String chassi) {
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }

    public Bicicleta(Integer numeroDeEixos, String propulsao, String marca, String modelo, Integer anoFabricacao, Integer tamanhoRoda, String chassi) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }

    public Integer getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(Integer tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "\nBicicleta{" +
                "tamanhoRoda=" + tamanhoRoda +
                ", chassi='" + chassi + '\'' +
                ", numeroDeEixos=" + getNumeroDeEixos() +
                ", propulsao='" + getPropulsao() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", anoFabricacao=" + getAnoFabricacao() +
                "}";
    }
}
