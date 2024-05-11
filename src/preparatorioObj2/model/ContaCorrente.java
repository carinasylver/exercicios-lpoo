package preparatorioObj2.model;
public class ContaCorrente extends Conta implements Associado {

    //atributos da interface Associado
    private int qdeCotas;
    private double valorCota;

    //construtor padrao
    public ContaCorrente() {
    }

    //construtor parametrizado herda saldo da superclasse
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    //construtor parametrizado herda saldo da superclasse
    public ContaCorrente(double saldo, int qdeCotas, double valorCota) {
        super(saldo);
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    //sobrescrita de atualiza(Conta) e lucros(Associado)
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    //sobrescrita de lucros(Associado)
    @Override
    public void lucros(int qdeCotas, double valorCota) {
        this.qdeCotas += qdeCotas;
        this.valorCota = valorCota;
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                ", saldo=" + saldo +
                ", saldo=" + getSaldo() +
                "} ";
    }
}