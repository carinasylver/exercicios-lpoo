package obj1.exer2.model;

public class Conta {
    //ATRIBUTO DA CLASSE CONTA
    private Integer id;
    private Double saldo;

    //CONSTRUTOR PADRAO DA CLASSE CONTA
    public Conta() {
    }
    //CONSTRUTOR PARAMETRIZADO DA CLASSE CONTA
    public Conta(Integer id, Double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    //METODOS ACESSORES GETTERS E SETTERS DA CLASSE CARRO
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void deposita(Double valor){
        this.saldo += valor;
    }
    public void saca(Double valor){
        this.saldo -= valor;
    }
    public void atualiza(Double taxa){
        this.saldo += this.saldo * taxa;
    }


    //METODO TOSTRING DA CLASSE CONTA
    @Override
    public String toString() {
        return "\nConta{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
