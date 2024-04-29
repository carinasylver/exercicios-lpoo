package obj2HerancaSimples.lista1.model;

public class GerenteGeral extends Gerente{

    public GerenteGeral() {
    }

    public GerenteGeral(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonus() {

        return getSalario() * 0.40; //2b.i. O gerente geral recebe por mês mais 40% de bônus;
    }

    @Override
    public String toString() {
        return "\nGerenteGeral{nome: "+ getNome()+ ", salario:"+getSalario()+", Bonus:"+getBonus()+"}";
    }
}
