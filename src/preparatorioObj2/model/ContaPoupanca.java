package preparatorioObj2.model;

public class ContaPoupanca extends Conta{
   //construtor padrao
    public ContaPoupanca() {
    }

    //construtor herda atrib da superclasse
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    //sobrescrita do metodo atualiza
    @Override
    public void atualiza(double taxa) {
        saldo += saldo * taxa;
    }

    @Override
    public String toString() {
        return "\nContaPoupanca{" +
                "saldo=" + saldo +
                ", saldo=" + getSaldo() +
                "} ";
    }
}
