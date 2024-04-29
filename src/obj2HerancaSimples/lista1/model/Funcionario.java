package obj2HerancaSimples.lista1.model;

public abstract class Funcionario {
    private String nome;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Double getSalario() {
        return salario;
    }

    public abstract Double getBonus();

}
