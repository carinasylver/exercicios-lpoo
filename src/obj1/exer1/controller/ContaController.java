package obj1.exer1.controller;

import obj1.exer1.model.Conta;

public class ContaController {
    public static void main(String[] args) {
        System.out.println("\n==== OBJETOS DA CLASSE CONTA ====");
        //exer1c-i. Crie duas instâncias de cada classe utilizando um construtor padrão;
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

         /*exer1c-ii Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de
        cada classe utilizando um construtor parametrizado por todos os atributos da classe
        de modelo;*/
        Conta conta3 = new Conta(1000.0);
        Conta conta4 = new Conta(2000.0);

         /*exerc1c-iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de
         cada classe utilizando uma variação do construtor parametrizado.*/
        Conta conta5 = new Conta(3000.0);
        Conta conta6 = new Conta(4000.0);


        //exerc1c-iv. Imprima todos os objetos criados com os construtores utilizando o método toString();
        System.out.println("* INSTANCIA COM O CONSTRUTOR PADRAO DA CLASSE");
        System.out.println("Conta 1 " + conta1);
        System.out.println("Conta 2 " + conta2);
        System.out.println("\n* INSTANCIA COM O CONSTRUTOR PARAMETRIZADO DA CLASSE");
        System.out.println("Conta 3 " + conta3);
        System.out.println("Conta 4 " + conta4);
        System.out.println("Conta 5 " + conta5);
        System.out.println("Conta 6 " + conta6);



        /*exerc1v. Agora utilize os métodos setters de cada classe de modelo para alterar o estado de
        cada objeto na memória RAM;*/
        //ALTERANDO OS OBJETOS CRIADOS COM OS CONSTRUTORES UTILIZANDO OS METODOS SETTERS
        conta1.setSaldo(2000.0);
        conta2.setSaldo(3000.0);
        conta3.setSaldo(4000.0);
        conta4.setSaldo(5000.0);
        conta5.setSaldo(6000.0);


        /*exerc1c-vi. Imprima todos objetos novamente, só que agora, ao invés de utilizar o método
        toString(), utilize os método getters.*/
        //getters da classe conta
        System.out.println("\n-- IMPRIMINDO OS OBJETOS CRIADOS COM OS CONSTRUTORES UTILIZANDO OS METODOS GETTERS");
        System.out.println("Saldo da conta 1 => " + "Saldo: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2 => " + "Saldo: " + conta2.getSaldo());
        System.out.println("Saldo da conta 3 => " + "Saldo: " + conta3.getSaldo());
        System.out.println("Saldo da conta 4 => " + "Saldo: " + conta4.getSaldo());
        System.out.println("Saldo da conta 5 => " + "Saldo: " + conta5.getSaldo());
        System.out.println("Saldo da conta 6 => " + "Saldo: " + conta6.getSaldo());


    }
}
