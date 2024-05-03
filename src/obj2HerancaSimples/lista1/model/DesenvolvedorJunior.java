package obj2HerancaSimples.lista1.model;

public class DesenvolvedorJunior extends Desenvolvedor{
    public DesenvolvedorJunior() {
    }

    public DesenvolvedorJunior(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonus() {
        return this.getSalario() * 0.05; //2b.iii junior recebem 5% de bônus
    }

    public String toString() {
        return "\nDesenvolvedorJunior{"+
                "nome: " +getNome() +
                ", salario:" + getSalario()+
                "}";
    }
}
