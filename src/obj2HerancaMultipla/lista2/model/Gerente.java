package obj2HerancaMultipla.lista2.model;

public class Gerente extends Funcionario implements Investidor{
    //atributos da interface investidor
    private String ticker;
    private Integer quantidade;

    //construtor parametrizado
    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    public Gerente(String nome, Double salario, String ticker, Integer quantidade) {
        super(nome, salario);
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    @Override
    public Double getBonus() {
        return getSalario() * 0.1;
    }

    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "ticker='" + ticker + '\'' +
                ", quantidade=" + quantidade +
                ", bonus=" + getBonus() +
                ", nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                "} ";
    }
}
