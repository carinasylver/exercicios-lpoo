package obj2HerancaSimples.lista1.model;

public class DesenvolvedorPleno extends Desenvolvedor{
    public DesenvolvedorPleno() {
    }

    public DesenvolvedorPleno(String nome, Double salario) {
        super(nome, salario);
    }


    @Override
    public Double getBonus() {
        return this.getSalario() * 0.5; //2b.iii pleno recebem 5% de bônus
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorPleno{nome: " +getNome() +", salario:" + getSalario()+"}";
    }
}
