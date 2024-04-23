package obj2.exer1.controller;

import obj2.exer1.model.Modelo;

public class ModeloController {
    public static void main(String[] args) {
        //exer1c.i Crie duas instâncias de cada classe utilizando um construtor padrão;
        Modelo modelo1 = new Modelo();
        Modelo modelo2 = new Modelo();

        /*exer1c.ii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas
        instâncias de cada classe utilizando um construtor parametrizado por todos
        os atributos da classe de modelo;*/

        Modelo modelo3 = new Modelo("VOYAGE I MOTION Evidence 1.6 T.Flex 8V");
        Modelo modelo4 = new Modelo("323i 2.5 24V");

        /*exer1c.iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas
        instâncias de cada classe utilizando uma variação do construtor
        parametrizado.*/
        Modelo modelo5 = new Modelo("RAV4 2.4 4x2 16V 170cv Aut.");
        Modelo modelo6 = new Modelo("Palio Stile 1.6 mpi 16v 4p");

        /*exer1c.iv. Imprima todos os objetos criados com os construtores utilizando o método toString();*/
        System.out.println("\n--IMPRIMINDO OS OBJETOS CRIADOS COM OS CONSTRUTORES PADRAO E PARAMETRIZADO UTILIZANDO O METODO TOSTRING()\n");
        System.out.println(modelo1);
        System.out.println(modelo2);
        System.out.println(modelo3);
        System.out.println(modelo4);
        System.out.println(modelo5);
        System.out.println(modelo6);

        /*exer1c.v. Agora utilize os métodos setters de cada classe de modelo para alterar o
        estado de cada objeto na memória RAM;*/
        modelo1.setDescricao("VOYAGE I MOTION Evidence 1.6 T.Flex 8V");
        modelo2.setDescricao("Strada Adv.Ext. 1.8 LOCKER Dual. Flex CD");
        modelo3.setDescricao("323Ci Coup");
        modelo4.setDescricao("Tempra Ouro/Prata 2.0 2p e 4p");
        modelo5.setDescricao("760iL 6.0 V12 445cv/544cv");
        modelo6.setDescricao("Grand Siena ESSENCE 1.6 Flex 16V");

        /*exer1c.vi. Imprima todos objetos novamente, só que agora, ao invés de utilizar o
        método toString(), utilize os método getters.*/
        System.out.println("\n--IMPRIMINDO OS OBJETOS NOVAMENTE, SOMENTE UTILIZANDO OS METODOS GETTERS\n");
        System.out.println("Objeto1-> "+"Descrição:"+ modelo1.getDescricao());
        System.out.println("Objeto2-> "+"Descrição:"+ modelo2.getDescricao());
        System.out.println("Objeto3-> "+"Descrição:"+ modelo3.getDescricao());
        System.out.println("Objeto4-> "+"Descrição:"+ modelo4.getDescricao());
        System.out.println("Objeto5-> "+"Descrição:"+ modelo5.getDescricao());
        System.out.println("Objeto6-> "+"Descrição:"+ modelo6.getDescricao());





    }
}
