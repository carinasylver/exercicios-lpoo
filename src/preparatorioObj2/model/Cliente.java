package preparatorioObj2.model;

public class Cliente implements Associado {
    private String nome;
    private double valorCota;
    private int qdeCotas;


    //construtor padrao
    public Cliente() {
    }

    //construtor parametrizado
    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(double valorCota, int qdeCotas) {
        this.valorCota = valorCota;
        this.qdeCotas = qdeCotas;
    }


    //metodos getters e setters acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    public int getQdeCotas() {
        return qdeCotas;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    //sobrescrita de Associado
    @Override
    public void lucros(int qdeCotas, double valorCota){
        this.qdeCotas += qdeCotas;
        this.valorCota = valorCota;
    }

    //toString

    @Override
    public String toString() {
        return "\nCliente{" +
                "nome='" + nome + '\'' +
                ", valorCota=" + valorCota +
                ", qdeCotas=" + qdeCotas +
                '}';
    }
}
