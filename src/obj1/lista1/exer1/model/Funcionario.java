package obj1.lista1.exer1.model;

public class Funcionario {
    // ATRIBUTOS DA CLASSE FUNCIONARIO
    private String nome;
    private Double salario;


    // CONSTRUTOR PADRAO DA CLASSE FUNCIONARIO OU VAZIO
    public Funcionario() {
    }


    //CONSTRUTOR PARAMETRIZADO DA CLASSE FUNCIONARIO
    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    //METODOS ACESSORES GETTERS E SETTERS DA CLASSE FUNCIONARIO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


    //METODO UTILITARIO toString DA CLASSE FUNCIONARIO
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
