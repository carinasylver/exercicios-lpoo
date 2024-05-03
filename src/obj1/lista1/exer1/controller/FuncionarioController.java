package obj1.lista1.exer1.controller;

import obj1.lista1.exer1.model.Funcionario;

public class FuncionarioController {

    public static void main(String[] args) {
        System.out.println("\n==== OBJETOS DA CLASSE FUNCIONARIO ====");
        //exer1c-i. Crie duas instâncias de cada classe utilizando um construtor padrão;
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();


         /*exer1c-ii Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de
        cada classe utilizando um construtor parametrizado por todos os atributos da classe
        de modelo;*/
        Funcionario funcionario3 = new Funcionario("Luis Gustavo", 2000.0);
        Funcionario funcionario4 = new Funcionario("João Pedro", 3000.0);

        /*exerc1c-iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de
cada classe utilizando uma variação do construtor parametrizado.*/
        Funcionario funcionario5 = new Funcionario("Maria Luiza", 4000.0);
        Funcionario funcionario6 = new Funcionario("Ana carolina", 5000.0);

        //exerc1c-iv. Imprima todos os objetos criados com os construtores utilizando o método toString();
        System.out.println("\n* INSTANCIA COM O CONSTRUTOR PADRAO DA CLASSE");
        System.out.println("Funcionario 1 " + funcionario1);
        System.out.println("Funcionario 2 " + funcionario2);
        System.out.println("\n* INSTANCIA COM O CONSTRUTOR PARAMETRIZADO DA CLASSE");
        System.out.println("Funcionario 3 " + funcionario3);
        System.out.println("Funcionario 4 " + funcionario4);
        System.out.println("Funcionario 5 " + funcionario5);
        System.out.println("Funcionario 6 " + funcionario6);


        /*exerc1v. Agora utilize os métodos setters de cada classe de modelo para alterar o estado de
        cada objeto na memória RAM;*/
        //ALTERANDO OS OBJETOS CRIADOS COM OS CONSTRUTORES UTILIZANDO OS METODOS SETTERS
        //setters da classe funcionario
        funcionario1.setNome("Maria");
        funcionario1.setSalario(3000.0);

        funcionario2.setNome("Ana");
        funcionario2.setSalario(4000.0);

        funcionario3.setNome("Gustavo");
        funcionario3.setSalario(2000.0);

        funcionario4.setNome("Pedro");
        funcionario4.setSalario(3000.0);

        funcionario5.setNome("Luiza");
        funcionario5.setSalario(4000.0);

        funcionario6.setNome("Carolina");
        funcionario6.setSalario(5000.0);



        /*exerc1c-vi. Imprima todos objetos novamente, só que agora, ao invés de utilizar o método
        toString(), utilize os método getters.*/
        //getters da classe funcionario
        System.out.println("\n-- IMPRIMINDO OS OBJETOS CRIADOS COM OS CONSTRUTORES UTILIZANDO OS METODOS GETTERS");
        System.out.println("Funcionario 1 => " + "Nome: " + funcionario1.getNome() + ", " + "Salario: " + funcionario1.getSalario());
        System.out.println("Funcionario 2 => " + "Nome: " + funcionario2.getNome() + ", " + "Salario: " + funcionario2.getSalario());
        System.out.println("Funcionario 3 => " + "Nome: " + funcionario3.getNome() + ", " + "Salario: " + funcionario3.getSalario());
        System.out.println("Funcionario 4 => " + "Nome: " + funcionario4.getNome() + ", " + "Salario: " + funcionario4.getSalario());
        System.out.println("Funcionario 5 => " + "Nome: " + funcionario5.getNome() + ", " + "Salario: " + funcionario5.getSalario());
        System.out.println("Funcionario 6 => " + "Nome: " + funcionario6.getNome() + ", " + "Salario: " + funcionario6.getSalario());

    }

}
