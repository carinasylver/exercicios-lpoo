package obj2HerancaMultipla.lista2.model;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonus() {
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{" +
                "bonus=" + getBonus() +
                ", nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                "} ";
    }
}
