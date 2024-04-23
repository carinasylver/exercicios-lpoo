package obj1.exer1.model;

public class Conta {
    //ATRIBUTOS DA CLASSE CONTA
    private Double saldo;


    //CONSTRUTOR PADRAO DA CLASSE CONTA
    public Conta() {
    }

    //CONSTRUTOR PARAMETRIZADO DA CLASSE CONTA
    public Conta(Double saldo) {
        this.saldo = saldo;
    }


    //METODOS ACESSORES GETTERS E SETTERS DA CLASSE CONTA
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    //METODO TOSTRING DA CLASSE CONTA
    @Override
    public String toString() {
        return "{" +
                "saldo=" + saldo +
                '}';
    }
}
