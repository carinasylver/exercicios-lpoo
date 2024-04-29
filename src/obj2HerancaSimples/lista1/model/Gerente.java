package obj2HerancaSimples.lista1.model;

public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonus() {
        //System.out.println("Bonus de gerente R$" + salario * 0.2);
        return getSalario() * 0.2;

    }

    @Override
    public String toString() {
        return "\nGerente{nome: "+ getNome()+ ", salario:"+getSalario()+"}";
    }
}
