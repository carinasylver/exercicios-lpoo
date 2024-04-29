package obj2HerancaSimples.lista1.model;

public class GerenteDesenvolvimento extends Gerente{

    public GerenteDesenvolvimento() {
    }
    public GerenteDesenvolvimento(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonus(){
        return getSalario() * 0.2; //2.ii O gerente de desenvolvimento recebe mais 20% de bônus;
    }

    @Override
    public String toString() {
        return "\nGerente Desenvolvimento{nome: " + getNome() + ", salario: " + getSalario() + ", bonus: " + getBonus() + "}";
    }


}
