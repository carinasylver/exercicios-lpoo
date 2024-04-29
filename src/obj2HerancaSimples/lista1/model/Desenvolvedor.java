package obj2HerancaSimples.lista1.model;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }


    @Override
    public Double getBonus(){
//        System.out.println("Bonus de desenvolvedor: " + (this.getSalario() * 0.5));
        return getSalario() * 0.5;
    }


    @Override
    public String toString() {
        return "\nDesenvolvedor{nome: " +getNome() +", salario:" + getSalario()+"}";
    }
}
