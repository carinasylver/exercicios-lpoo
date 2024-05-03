package obj1.lista1.exer1.model;

public class Produto {
    // ATRIBUTOS DA CLASSE PRODUTO
    private String nome;
    private String descricao;
    private Double valor;
    private Integer estoque;


    //CONSTRUTOR PADRAO OU VAZIO
    public Produto() {
    }

    //CONSTRUTOR PARAMETRIZADO
    public Produto(String nome, String descricao, Double valor, Integer estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
    }


    //METODOS ACESSORES GETTERS E SETTERS DA CLASSE PRODUTO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }


    //METODO UTILITARIO toString DA CLASSE PRODUTO
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", estoque=" + estoque +
                '}';
    }
}
