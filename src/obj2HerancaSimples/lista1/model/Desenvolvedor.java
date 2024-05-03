package obj2HerancaSimples.lista1.model;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }


    @Override
    public Double getBonus(){
        return getSalario() * 0.05;
    }


    @Override
    public String toString() {
        return "\nDesenvolvedor{nome: " +getNome() +", salario:" + getSalario()+"}";
    }
}
