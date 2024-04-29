package obj2HerancaSimples.lista1.controller;

import obj2HerancaSimples.lista1.model.*;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {

        /*1.c) Crie, no mínimo, duas instâncias de cada classe deste diagrama (das possíveis) em um
        controlador específico. Tenha o cuidado de criar estas instâncias de diferentes formas, ou
        seja, utilize construtores padrão e parametrizado;*/

        //Funcionario funcionario = new Funcionario(); //nao eh possivel instanciar
        Desenvolvedor dev1 = new Desenvolvedor();
        Desenvolvedor dev2 = new Desenvolvedor("leia", 10.000);

        Gerente gerente1 = new Gerente();
        Gerente gerente2 = new Gerente("yoda",10.000);

        //d) Imprima os objetos que você criou;
        System.out.println("\nIMPRESSAO DOS OBJETOS PADRAO E PARAMETRIZADO");
        System.out.println("Funcionarios");
        System.out.println("desenvolvedor1: "+dev1.getNome()+ " salario: " +dev1.getSalario());
        System.out.println("desenvolvedor2: "+dev2.getNome()+ " salario: " +dev2.getSalario());
        System.out.println("gerente1: "+gerente1.getNome()+ " salario: " +gerente1.getSalario());
        System.out.println("gerente2: "+gerente2.getNome()+ " salario: " +gerente2.getSalario());


        /*1.e) Altere o estado desses objetos, tenha o cuidado de atribuir valores válidos aos atributos, e
        imprima-os;*/

        dev1.setNome("obiwan kenobi");
        dev1.setSalario(3.500);

        dev2.setNome("leia skywalker");
        dev2.setSalario(3.500);

        gerente1.setNome("general lea organa");
        gerente1.setSalario(6.500);

        gerente2.setNome("mestre yoda");
        gerente2.setSalario(4.500);

        System.out.println("\nIMPRESSAO DOS OBJETOS APOS ALTERACAO");
        System.out.println("desenvolvedor1: "+ dev1.getNome() + ", salario: "+ dev1.getSalario());
        System.out.println("desenvolvedor2: "+ dev2.getNome() + ", salario: "+ dev2.getSalario());
        System.out.println("gerente1: "+ gerente1.getNome() + ", salario: "+ gerente1.getSalario());
        System.out.println("gerente2: "+ gerente2.getNome() + ", salario: "+ gerente2.getSalario());

        /*1.f) Faça o programa retornar o bônus de cada um dos funcionários, seguindo a seguinte regra:
        para Gerente = 20%, e para Desenvolvedor = 5%. Imprima-os.*/
        System.out.println("\nIMPRIMINDO BONUS DOS OBJETOS");
        System.out.println("Bonus Gerente1: "+ gerente1.getBonus());
        System.out.println("Bonus Gerente2: "+ gerente2.getBonus());
        System.out.println("Bonus Desenvolvedor1: "+ dev1.getBonus());
        System.out.println("Bonus Desenvolvedor2: "+ dev2.getBonus());

        /*1.g) Responda as seguintes questões (coloque suas respostas como comentário no controlador):
        i) Foi possível criar instâncias da classe Funcionario? Justifique sua resposta.*/
        //nao é possivel instanciar por que a classe funcionario foi definida como abstract

        /*ii) Onde você inseriu asregras de negócio solicitadas na questão “f”? Na classe Controller?
        Na classe Funcionário? Ou nas classes Gerente e Desenvolvedor? Justifique sua
        resposta.
        as regras de negocio devem ser modeladas nas classes gerente e desenvolvedor

        /*2.a crie uma coleção de objetos para representar a estrutura de funcionários dessa empresa;*/
         /*b) Acrescente na coleção criada no item “a” vinte funcionários, sendo, 2 gerentes e 18
        desenvolvedores. Onde:
         */

        //2b.i. O gerente geral recebe por mês o salário de R$ 6.500,00
        GerenteGeral gerenteGeral = new GerenteGeral("leia organa", 6.500);

        //2.ii O gerente de desenvolvimento recebe por mês o salário R$ 4.500,00;
        GerenteDesenvolvimento gerenteDesenvolvimento = new GerenteDesenvolvimento("luke skywalker",6.500);

        //2b.iii. 6 são sênior que recebem R$ 3.500,00 por mês
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("luke skywalker", 3.500);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("leia", 3.500);
        Desenvolvedor desenvolvedor3 = new Desenvolvedor("c3po", 3.500);
        Desenvolvedor desenvolvedor4 = new Desenvolvedor("asoka tano", 3.500);
        Desenvolvedor desenvolvedor5 = new Desenvolvedor("amilyn holdo", 3.500);
        Desenvolvedor desenvolvedor6 = new Desenvolvedor("mon mothma", 3.500);
        //2b.iii. 6 são pleno e recebem R$ 2.500,00 por mês
        Desenvolvedor desenvolvedor7 = new Desenvolvedor("aunt beru", 2.500);
        Desenvolvedor desenvolvedor8 = new Desenvolvedor("mara jade", 2.500);
        Desenvolvedor desenvolvedor9 = new Desenvolvedor("elian zahra", 2.500);
        Desenvolvedor desenvolvedor10 = new Desenvolvedor("maz kanata", 2.500);
        Desenvolvedor desenvolvedor11 = new Desenvolvedor("imperador palpatine", 2.500);
        Desenvolvedor desenvolvedor12 = new Desenvolvedor("omega", 2.500);
        //2b.iii. os demais são júnior e recebem R$ 1.800,00 por mês
        Desenvolvedor desenvolvedor13 = new Desenvolvedor("han solo",2.500);
        Desenvolvedor desenvolvedor14 = new Desenvolvedor("darth vader", 2.500);
        Desenvolvedor desenvolvedor15 = new Desenvolvedor("chewbacca", 1.800);
        Desenvolvedor desenvolvedor16 = new Desenvolvedor("capita phasma", 1.800);
        Desenvolvedor desenvolvedor17 = new Desenvolvedor("obi wan", 1.800);
        Desenvolvedor desenvolvedor18 = new Desenvolvedor("finn", 1.800);

        /*2.a crie uma coleção de objetos para representar a estrutura de funcionários dessa empresa;*/
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(gerenteGeral);
        funcionarios.add(gerenteDesenvolvimento);
        funcionarios.add(desenvolvedor1);
        funcionarios.add(desenvolvedor2);
        funcionarios.add(desenvolvedor3);
        funcionarios.add(desenvolvedor4);
        funcionarios.add(desenvolvedor5);
        funcionarios.add(desenvolvedor6);
        funcionarios.add(desenvolvedor7);
        funcionarios.add(desenvolvedor8);
        funcionarios.add(desenvolvedor9);
        funcionarios.add(desenvolvedor10);
        funcionarios.add(desenvolvedor11);
        funcionarios.add(desenvolvedor12);
        funcionarios.add(desenvolvedor13);
        funcionarios.add(desenvolvedor14);
        funcionarios.add(desenvolvedor15);
        funcionarios.add(desenvolvedor16);
        funcionarios.add(desenvolvedor17);
        funcionarios.add(desenvolvedor18);

        System.out.println("\nLista de funcionarios: "+ funcionarios);

        //2b.i. O gerente geral recebe por mês o salário de R$ 6.500,00 mais 40% de bônus;
        System.out.println("\nsalario gerente geral: R$ "+ gerenteGeral.getSalario()+", bonus salarial: R$"+ gerenteGeral.getBonus());

        //2b.ii O gerente de desenvolvimento R$ 4.500,00 mais 20% de bônus;
        System.out.println("salario gerente de desenvolvimento: R$"+ gerenteDesenvolvimento.getSalario()+", bonus salarial: R$"+ gerenteDesenvolvimento.getBonus());

        /*2b.iii) Os dezoito desenvolvedores estão divididos em grupos salariais, 6 são sênior que
        recebem R$ 3.500,00 por mês mais 10% de bônus, 6 são pleno e recebem R$ 2.500,00
        por mês mais 5% de bônus, e os demais são júnior e recebem R$ 1.800,00 por mês
        mais 5% de bônus.
        respostas estao acima*/

        //c) Calcule e imprima qual é a folha salarial dessa empresa, COM bônus;
        double folhaSalarial = 0;
        for (Funcionario funcionario : funcionarios) {
            folhaSalarial += funcionario.getSalario() + funcionario.getBonus();
        }
        System.out.println("\nfolha salarial COM bonus: R$"+ folhaSalarial);


        //d) Calcule e imprima qual é a folha salarial dessa empresa, SEM bônus;
        folhaSalarial = 0;
        for (Funcionario funcionario : funcionarios) {
            folhaSalarial += funcionario.getSalario();
        }
        System.out.println("folha salarial SEM bonus: R$"+ folhaSalarial);

        //e) Calcule e imprima o valor do bônus e o salário bruto de cada um dos funcionários dessa empresa;
        System.out.println("\nBonus e salario bruto dos funcionarios");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("bonus: "+funcionario.getBonus() +", salario bruto: "+ funcionario.getSalario());
        }

        /*f) Calcule e imprima a nova folha salarial dessa empresa, caso todos os funcionários,
                independente de cargo, tenham um reajuste salarial de 5%.*/
        System.out.println("\nNova folha salarial com reajuste de 5%");
        for (Funcionario funcionario : funcionarios) {
            folhaSalarial += funcionario.getSalario() + funcionario.getBonus();
        }
        System.out.println("folha salarial com reajuste de 5%: R$"+ folhaSalarial * 1.05);




    }
}
