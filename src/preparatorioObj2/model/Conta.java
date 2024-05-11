package preparatorioObj2.model;

//Classe Conta eh abstrata, isso significa que não podemos criar instâncias da classe conta
public abstract class Conta {
    //atributos
    protected double saldo;

    //construtor
    public Conta() {
    }

    //construtor
    public Conta(double saldo) {
        this.saldo = saldo;
    }

    //getters and setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //comportamento
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public abstract void atualiza(double taxa);



}