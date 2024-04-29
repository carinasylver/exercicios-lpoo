package obj2HerancaSimples.lista1.model;

public class DesenvolvedorSenior extends Desenvolvedor{

    public DesenvolvedorSenior() {
    }

    public DesenvolvedorSenior(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonus() {
        return this.getSalario() * 0.1; //2b.iii senior recebem 10% de bônus
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorSenior{nome: " +getNome() +", salario:" + getSalario()+"}";
    }

}
