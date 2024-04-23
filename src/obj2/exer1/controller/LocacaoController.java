package obj2.exer1.controller;

import obj2.exer1.model.Locacao;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;


public class LocacaoController {
    public static void main(String[] args) {
        //exer1c.i Crie duas instâncias de cada classe utilizando um construtor padrão;
        Locacao locacao1 = new Locacao();
        Locacao locacao2 = new Locacao();

        /*exer1c.ii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas
        instâncias de cada classe utilizando um construtor parametrizado por todos
        os atributos da classe de modelo;*/

        Locacao locacao3 = new Locacao(new Date(),                                       new Time(System.currentTimeMillis()),
                                        new Date(),
                                        new Time(System.currentTimeMillis()),
                                        100,
                                        200.0,
                                        500.0,
                                        false);

        Locacao locacao4 = new Locacao(new Date(),
                                        new Time(System.currentTimeMillis()),
                                        new Date(),
                                        new Time(System.currentTimeMillis()),
                                        80,
                                        100.0,
                                        300.0,
                                        false);


         /*exer1c.iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas
        instâncias de cada classe utilizando uma variação do construtor*/

        Locacao locacao5 = new Locacao(new Date(System.currentTimeMillis()), // Data de locação
                new Time(System.currentTimeMillis()),
                new Date(),
                new Time(System.currentTimeMillis()),
                90,
                110.0,
                300.0,
                false);

        Locacao locacao6 = new Locacao(new Date(System.currentTimeMillis()), // Data de locação
                new Time(System.currentTimeMillis()),
                new Date(),
                new Time(System.currentTimeMillis()),
                90,
                110.0,
                300.0,
                false);


        /*exer1c.iv. Imprima todos os objetos criados com os construtores utilizando o método
        toString();*/
        System.out.println("\n--IMPRIMINDO OS OBJETOS CRIADOS COM OS CONSTRUTORES PADRAO E PARAMETRIZADO UTILIZANDO O METODO TOSTRING()\n");
        System.out.println(locacao1);
        System.out.println(locacao2);
        System.out.println(locacao3);
        System.out.println(locacao4);
        System.out.println(locacao5);
        System.out.println(locacao6);


        /*exer1c.v. Agora utilize os métodos setters de cada classe de modelo para alterar o
        estado de cada objeto na memória RAM;*/
        locacao1.setDataLocacao(new Date());
        locacao1.setHoraLocacao(new Time(System.currentTimeMillis()));
        locacao1.setDataDevolucao(new Date());
        locacao1.setHoraDevolucao(new Time(System.currentTimeMillis()));
        locacao1.setQuilometragem(100);
        locacao1.setValorCalcao(200.0);
        locacao1.setValor_locacao(500.0);
        locacao1.setDevolvido(false);

        locacao2.setDataLocacao(new Date());
        locacao2.setHoraLocacao(new Time(System.currentTimeMillis()));
        locacao2.setDataDevolucao(new Date());
        locacao2.setHoraDevolucao(new Time(System.currentTimeMillis()));
        locacao2.setQuilometragem(80);
        locacao2.setValorCalcao(100.0);
        locacao2.setValor_locacao(300.0);
        locacao2.setDevolvido(false);

        locacao3.setDataLocacao(new Date());
        locacao3.setHoraLocacao(new Time(System.currentTimeMillis()));
        locacao3.setDataDevolucao(new Date());
        locacao3.setHoraDevolucao(new Time(System.currentTimeMillis()));
        locacao3.setQuilometragem(90);
        locacao3.setValorCalcao(110.0);
        locacao3.setValor_locacao(300.0);
        locacao3.setDevolvido(false);

        locacao4.setDataLocacao(new Date());
        locacao4.setHoraLocacao(new Time(System.currentTimeMillis()));
        locacao4.setDataDevolucao(new Date());
        locacao4.setHoraDevolucao(new Time(System.currentTimeMillis()));
        locacao4.setQuilometragem(90);
        locacao4.setValorCalcao(110.0);
        locacao4.setValor_locacao(300.0);
        locacao4.setDevolvido(false);

        locacao5.setDataLocacao(new Date());
        locacao5.setHoraLocacao(new Time(System.currentTimeMillis()));
        locacao5.setDataDevolucao(new Date());
        locacao5.setHoraDevolucao(new Time(System.currentTimeMillis()));
        locacao5.setQuilometragem(90);
        locacao5.setValorCalcao(110.0);
        locacao5.setValor_locacao(300.0);
        locacao5.setDevolvido(false);

        locacao6.setDataLocacao(new Date());
        locacao6.setHoraLocacao(new Time(System.currentTimeMillis()));
        locacao6.setDataDevolucao(new Date());
        locacao6.setHoraDevolucao(new Time(System.currentTimeMillis()));
        locacao6.setQuilometragem(90);
        locacao6.setValorCalcao(110.0);
        locacao6.setValor_locacao(300.0);
        locacao6.setDevolvido(false);


        /*exer1c.vi. Imprima todos objetos novamente, só que agora, ao invés de utilizar o
        método toString(), utilize os método getters.*/
        System.out.println("\n--IMPRIMINDO OS OBJETOS NOVAMENTE, SOMENTE UTILIZANDO OS METODOS GETTERS\n");
        System.out.println("Objeto1-> "+"Data Locação:"+locacao1.getDataLocacao()+", Hora Locação:"+locacao1.getHoraLocacao()+", Data Devolução:"+locacao1.getDataDevolucao()+", Hora Devolução:"+locacao1.getHoraDevolucao()+", Quilometragem:"+locacao1.getQuilometragem()+", Valor Calção:"+locacao1.getValorCalcao()+", Valor Locação:"+locacao1.getValor_locacao()+", Devolvido:"+locacao1.getDevolvido() );
        System.out.println("Objeto2-> "+"Data Locação:"+locacao1.getDataLocacao()+", Hora Locação:"+locacao1.getHoraLocacao()+", Data Devolução:"+locacao2.getDataDevolucao()+", Hora Devolução:"+locacao2.getHoraDevolucao()+", Quilometragem:"+locacao2.getQuilometragem()+", Valor Calção:"+locacao2.getValorCalcao()+", Valor Locação:"+locacao2.getValor_locacao()+", Devolvido:"+locacao2.getDevolvido() );
        System.out.println("Objeto3-> "+"Data Locação:"+locacao3.getDataLocacao()+", Hora Locação:"+locacao3.getHoraLocacao()+", Data Devolução:"+locacao3.getDataDevolucao()+", Hora Devolução:"+locacao3.getHoraDevolucao()+", Quilometragem:"+locacao3.getQuilometragem()+", Valor Calção:"+locacao3.getValorCalcao()+", Valor Locação:"+locacao3.getValor_locacao()+", Devolvido:"+locacao3.getDevolvido() );
        System.out.println("Objeto4-> "+"Data Locação:"+locacao4.getDataLocacao()+", Hora Locação:"+locacao4.getHoraLocacao()+", Data Devolução:"+locacao4.getDataDevolucao()+", Hora Devolução:"+locacao4.getHoraDevolucao()+", Quilometragem:"+locacao4.getQuilometragem()+", Valor Calção:"+locacao4.getValorCalcao()+", Valor Locação:"+locacao4.getValor_locacao()+", Devolvido:"+locacao4.getDevolvido() );
        System.out.println("Objeto5-> "+"Data Locação:"+locacao5.getDataLocacao()+", Hora Locação:"+locacao5.getHoraLocacao()+", Data Devolução:"+locacao5.getDataDevolucao()+", Hora Devolução:"+locacao5.getHoraDevolucao()+", Quilometragem:"+locacao5.getQuilometragem()+", Valor Calção:"+locacao5.getValorCalcao()+", Valor Locação:"+locacao5.getValor_locacao()+", Devolvido:"+locacao5.getDevolvido() );
        System.out.println("Objeto6-> "+"Data Locação:"+locacao6.getDataLocacao()+", Hora Locação:"+locacao6.getHoraLocacao()+", Data Devolução:"+locacao6.getDataDevolucao()+", Hora Devolução:"+locacao6.getHoraDevolucao()+", Quilometragem:"+locacao6.getQuilometragem()+", Valor Calção:"+locacao6.getValorCalcao()+", Valor Locação:"+locacao6.getValor_locacao()+", Devolvido:"+locacao6.getDevolvido() );


    }
}
