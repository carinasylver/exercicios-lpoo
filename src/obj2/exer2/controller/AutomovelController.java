package obj2.exer2.controller;

import obj2.exer2.model.Automovel;
import obj2.exer2.model.Locacao;

import java.util.*;

public class AutomovelController {
    public static void main(String[] args) {
        //exer2.c Modifique cada objeto para que ele passe a conter um valor para o atributo id;
        Automovel automovel1 = new Automovel(1, "ABCD1254", "ABC-1254", "Preto", 4, "Gasolina", 0, "ABC-1235", 500.0);
        Automovel automovel2 = new Automovel(2, "ABCD1256", "ABC-1256", "Preto", 4, "Gasolina", 0, "ABC-1236", 400.0);
        Automovel automovel3 = new Automovel(3, "ABCD1234", "ABC-1234", "Preto", 4, "Gasolina", 0, "ABC-1234", 500.0);
        Automovel automovel4 = new Automovel(4, "ABCD5678", "DEF-5678", "Branco", 4, "Diesel", 0, "DEF-5678", 1000.0);
        Automovel automovel5 = new Automovel(5, "ABCD9012", "GHI-9012", "Vermelho", 4, "Gasolina", 0, "GHI-9012", 1500.0);
        Automovel automovel6 = new Automovel(6, "ABCD3456", "JKL-3456", "Azul", 4, "Diesel", 0, "JKL-3456", 2000.0);

       /*exer2.a Nos controladores criados no Exercício 1 adicione dois objetos do tipo coleção, um do
       tipo List, outro do tipo Map*/
        List<Automovel> automoveisList = new ArrayList<>();
        Map<Integer, Automovel> automoveisMap = new HashMap<>();

        //exer2.d. Adicione na coleção todos os objetos criados no Exercício 1;
        //cria uma colecao de carros do tipo List e adiciona objetos nela
        automoveisList.add(automovel1);
        automoveisList.add(automovel2);
        automoveisList.add(automovel3);
        automoveisList.add(automovel4);
        automoveisList.add(automovel5);
        automoveisList.add(automovel6);

        //cria uma coleção do tipo Map e adiciona objetos nela
        automoveisMap.put(automovel1.getId(), automovel1);
        automoveisMap.put(automovel2.getId(), automovel2);
        automoveisMap.put(automovel3.getId(), automovel3);
        automoveisMap.put(automovel4.getId(), automovel4);
        automoveisMap.put(automovel5.getId(), automovel5);

        //exer2.e. Imprima os objetos contidos em cada coleção;
        System.out.println("\n* Lista de Automovel do TIPO LIST\n" + automoveisList);
        System.out.println("\n* Lista de Automovel do TIPO MAP\n" + automoveisMap);

        //exer2.f. Ordene a coleção em ordem decrescente e a imprima;
        //ordenacao da coleção do tipo List pelo id
        automoveisList.sort(Comparator.comparing(Automovel::getId).reversed());
        System.out.println("\n* Lista de Automovel do TIPO LIST em ORDEM DECRESCENTE\n" + automoveisList);

        //exer2.g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
        //pesquisa na coleção do tipo map
        //pesquisa por forca bruta percorre todos os obj dque tem na colecao, nao importa se achou ou nao
        automoveisList.forEach(p -> {
            if (p.getId() == 3) {
                System.out.println("\n* Automovel de id=3 do TIPO LIST\n" + p);
            }
        });

        //exer2.h Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
        automoveisList.sort(Comparator.comparing(Automovel::getId));
        int index = Collections.binarySearch(
                automoveisList, new Automovel(3, null, null,null,null,null, null,null, null), Comparator.comparing(Automovel::getId));
        if (index >= 0) {
            Automovel automovel = automoveisList.get(index);
            System.out.println("\n* Automovel de id=3 do TIPO LIST (pesquisa binária)\n" + automoveisList.get(index));
        }
    }

}
