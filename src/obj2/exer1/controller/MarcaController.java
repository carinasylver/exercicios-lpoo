package obj2.exer1.controller;

import obj2.exer1.model.Marca;

public class MarcaController {
    public static void main(String[] args) {
        //exer1c.i Crie duas instâncias de cada classe utilizando um construtor padrão;
        Marca marca1 = new Marca();
        Marca marca2 = new Marca();

    /*exer1c.ii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas
     instâncias de cada classe utilizando um construtor parametrizado por todos
     os atributos da classe de modelo;*/
        Marca marca3 = new Marca("abcd");
        Marca marca4 = new Marca("efgh");


    /*exer1c.iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas
    instâncias de cada classe utilizando uma variação do construtor
    parametrizado.*/
        Marca marca5 = new Marca("ijklm");
        Marca marca6 = new Marca("nopqr");

     /*exer1c.iv. Imprima todos os objetos criados com os construtores utilizando o método
     toString();*/
        System.out.println("\n---IMPRIMINDO OS OBJETOS CRIADOS COM OS CONSTRUTORES PADRAO E PARAMETRIZADO UTILIZANDO O METODO TOSTRING()\n");
        System.out.println(marca1);
        System.out.println(marca2);
        System.out.println(marca3);
        System.out.println(marca4);
        System.out.println(marca5);
        System.out.println(marca6);

        /*v. Agora utilize os métodos setters de cada classe de modelo para alterar o
        estado de cada objeto na memória RAM;*/
        marca1.setDescricao("Fiat");
        marca2.setDescricao("Ford");
        marca3.setDescricao("Honda");
        marca4.setDescricao("Toyota");
        marca5.setDescricao("Chevrolet");

        /*exer1c.vi. Imprima todos objetos novamente, só que agora, ao invés de utilizar o
        método toString(), utilize os método getters.*/
        System.out.println("\n--IMPRIMINDO OS OBJETOS NOVAMENTE, SOMENTE UTILIZANDO OS METODOS GETTERS\n");
        System.out.println("Objeto1-> "+"Descrição:"+marca1.getDescricao());
        System.out.println("Objeto2-> "+"Descrição:"+marca2.getDescricao());
        System.out.println("Objeto3-> "+"Descrição:"+marca3.getDescricao());
        System.out.println("Objeto4-> "+"Descrição:"+marca4.getDescricao());
        System.out.println("Objeto5-> "+"Descrição:"+marca5.getDescricao());
        System.out.println("Objeto6-> "+"Descrição:"+marca6.getDescricao());



    }

}
