package obj2HerancaMultipla.lista2.model;

public class Cliente implements Investidor {
    //atributos de cliente
    private String nome;
    private String sobrenome;

    //atributos de investidor
    private String ticker;
    private Integer quantidade;


    public Cliente(String nome, String sobrenome, String ticker, Integer quantidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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
        return "\nCliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", ticker='" + ticker + '\'' +
                ", quantidade=" + quantidade +
                "} ";
    }
}
