package obj2HerancaMultipla.lista2.control;

import obj2HerancaMultipla.lista2.model.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;


public class FuncionarioController {
    public static void main(String[] args) {
        /*1.a) Crie seis instâncias de cada classe do diagrama (das possíveis) com valores válidos
        para os seus atributos. Depois, utilizando o método toString(), imprima estes objetos
        e verifique o resultado.*/
        Desenvolvedor dev1 = new Desenvolvedor("Joao", 5.000);
        Desenvolvedor dev2 = new Desenvolvedor("Maria", 10.000);
        Desenvolvedor dev3 = new Desenvolvedor("Jose", 15.000);
        Desenvolvedor dev4 = new Desenvolvedor("Pedro", 20.000);
        Desenvolvedor dev5 = new Desenvolvedor("Ana", 25.000);
        Desenvolvedor dev6 = new Desenvolvedor("Carlos", 30.000);

        Gerente gerente1 = new Gerente("João", 10000.00, "ABC", 100);
        Gerente gerente2 = new Gerente("Maria", 12000.00, "XYZ", 200);
        Gerente gerente3 = new Gerente("Carlos", 13000.00, "DEF", 150);
        Gerente gerente4 = new Gerente("Ana", 8000.00, "GHI", 120);
        Gerente gerente5 = new Gerente("Pedro", 9000.00, "JKL", 180);
        Gerente gerente6 = new Gerente("Jose", 7000.00, "MNO", 100);

        Cliente cliente1 = new Cliente("João", "silva", "DEF", 120);
        Cliente cliente2 = new Cliente("Maria", "Santos", "ABC", 100);
        Cliente cliente3 = new Cliente("Pedro", "Oliveira", "GHI", 200);
        Cliente cliente4 = new Cliente("Ana", "Pereira", "JKL", 150);
        Cliente cliente5 = new Cliente("Carlos", "Silveira", "MNO", 180);
        Cliente cliente6 = new Cliente("Jose", "Santos", "PQR", 100);


        System.out.println("dev1: "+ dev1+", \ndev2: "+dev2+", \ndev3: "+dev3+", \ndev4: "+dev4+", \ndev5: "+dev5+"\ndev6: "+dev6);
        System.out.println("\ngerente1: "+ gerente1+",\ngerente2: "+gerente2 +",\ngerente3: "+gerente3+",\ngerente4: "+gerente4+",\ngerente5: "+gerente5+",\ngerente6: "+gerente6);
        System.out.println("\ncliente1: "+ cliente1+", \ncliente2: "+cliente2+", \ncliente3: "+cliente3+", \ncliente4: "+cliente4+", \ncliente5: "+cliente5+", \ncliente6: "+cliente6);

        /*1.b) Insira esses dezoito objetos em estruturas de dados do tipo coleção e imprima esta(s) coleção(ões);*/
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(dev1);
        listaFuncionarios.add(dev2);
        listaFuncionarios.add(dev3);
        listaFuncionarios.add(dev4);
        listaFuncionarios.add(dev5);
        listaFuncionarios.add(dev6);

        listaFuncionarios.add(gerente1);
        listaFuncionarios.add(gerente2);
        listaFuncionarios.add(gerente3);
        listaFuncionarios.add(gerente4);
        listaFuncionarios.add(gerente5);
        listaFuncionarios.add(gerente6);


        List<Investidor> listaInvestidores = new ArrayList<>();
        listaInvestidores.add(cliente1);
        listaInvestidores.add(cliente2);
        listaInvestidores.add(cliente3);
        listaInvestidores.add(cliente4);
        listaInvestidores.add(cliente5);
        listaInvestidores.add(cliente6);

        System.out.println("\nLista de funcionarios: "+listaFuncionarios);
        System.out.println("\nLista de investidores: "+listaInvestidores);

        /*1.c) A partir dessa(as) coleção(ões) liste todos os funcionários,
        todos os clientes, bem como, todos os investidores,
        ordenando-os pelo salário, ordem decrescente, e pela quantidade de ações, ordem decrescente;*/

        listaFuncionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println("\nLista de funcionarios ordenados pelo salario: "+listaFuncionarios);

        listaInvestidores.sort(Comparator.comparing(Investidor::getQuantidade).reversed());
        System.out.println("\nLista de clientes investidores : "+listaInvestidores);

        /*1.d) A partir dessa(as) coleção(ões), faça a aplicação imprimir o funcionário com o
        maior salário e o investidor com o maior número de ações.*/
        System.out.print("\nFuncionario com maior salário: ");
        Funcionario maiorSalario = Collections.max(listaFuncionarios, Comparator.comparing(Funcionario::getSalario)); //primeiro determina o maior
        for (Funcionario f : listaFuncionarios) {
            if (f.getSalario() >= maiorSalario.getSalario()) {
                System.out.print(f);
            }
        }

    }
}
