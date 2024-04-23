package obj2.exer2.controller;

import obj2.exer2.model.Locacao;

import java.sql.Time;
import java.util.*;
import java.util.Collections;

public class LocacaoController {
    public static void main(String[] args) {
        //exer2.c Modifique cada objeto para que ele passe a conter um valor para o atributo id;
        Locacao locacao1 = new Locacao(1, new Date(),new Time(System.currentTimeMillis()),new Date(),new Time(System.currentTimeMillis()),100,200.0,500.0,false);
        Locacao locacao2 = new Locacao(2,new Date(),new Time(System.currentTimeMillis()),new Date(),new Time(System.currentTimeMillis()),100,200.0,500.0,false);
        Locacao locacao3 = new Locacao(3,new Date(),new Time(System.currentTimeMillis()),new Date(),new Time(System.currentTimeMillis()),100,200.0,500.0,false);
        Locacao locacao4 = new Locacao(4,new Date(),new Time(System.currentTimeMillis()),new Date(),new Time(System.currentTimeMillis()),80,100.0,300.0,false);
        Locacao locacao5 = new Locacao(5,new Date(), new Time(System.currentTimeMillis()),new Date(),new Time(System.currentTimeMillis()),90,110.0,300.0,false);
        Locacao locacao6 = new Locacao(6,new Date(),new Time(System.currentTimeMillis()),new Date(),new Time(System.currentTimeMillis()),90,110.0,300.0,false);

        /*exer2.a Nos controladores criados no Exercício 1 adicione dois objetos do tipo coleção, um do
        tipo List, outro do tipo Map*/
        List<Locacao> locacoesList = new ArrayList<>();
        Map<Integer, Locacao> locacoesMap = new HashMap<>();

        //exer2.d. Adicione na coleção todos os objetos criados no Exercício 1;
        //cria uma colecao de carros do tipo List e adiciona objetos nela
        locacoesList.add(locacao1);
        locacoesList.add(locacao2);
        locacoesList.add(locacao3);
        locacoesList.add(locacao4);
        locacoesList.add(locacao5);
        locacoesList.add(locacao6);

        //cria uma coleção do tipo Map e adiciona objetos nela
        locacoesMap.put(locacao1.getId(), locacao1);
        locacoesMap.put(locacao2.getId(), locacao2);
        locacoesMap.put(locacao3.getId(), locacao3);
        locacoesMap.put(locacao4.getId(), locacao4);
        locacoesMap.put(locacao5.getId(), locacao5);
        locacoesMap.put(locacao6.getId(), locacao6);

        //exer2.e. Imprima os objetos contidos em cada coleção;
        System.out.println("\nObjetos do Tipo List =>" +locacoesList);
        System.out.println("\nObjetos do Tipo Map =>" +locacoesMap);

        //exer2.f. Ordene a coleção em ordem decrescente e a imprima;
        //ordenacao da coleção do tipo List pelo id
        locacoesList.sort(Comparator.comparing(Locacao::getId).reversed());
        System.out.println("\n* Lista de locacoes ordenada pelo id do TIPO LIST em ORDEM DECRESCENTE\n" + locacoesList);

        //exer2.g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
        //pesquisa por forca bruta percorre todos os obj dque tem na colecao, nao importa se achou ou nao
        locacoesList.forEach(p -> {
            if (p.getId() == 3) {
                System.out.println("\n* Locaçao de id=3 do TIPO LIST\n" + p);
            }
        });

        //exer2.h Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
        locacoesList.sort(Comparator.comparing(Locacao::getId));
        int index = Collections.binarySearch(
                locacoesList, new Locacao(3, null, null, null, null, null, null, null,null),
                Comparator.comparing(Locacao::getId));
        if (index >= 0) {
            Locacao locacao = locacoesList.get(index);
            System.out.println("\n* Locação de id=3 do TIPO LIST\n" + locacao);
        }
    }
}
