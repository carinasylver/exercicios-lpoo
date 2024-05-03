package obj2.lista2.exer2.controller;

import obj2.lista2.exer2.model.Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModeloController {
    public static void main(String[] args) {
        //exer2.c Modifique cada objeto para que ele passe a conter um valor para o atributo id;
        Modelo modelo1 = new Modelo(1,"Polo");
        Modelo modelo2 = new Modelo(2,"Civic");
        Modelo modelo3 = new Modelo(3,"A3");
        Modelo modelo4 = new Modelo(4,"Corolla");
        Modelo modelo5 = new Modelo(5,"Onix");
        Modelo modelo6 = new Modelo(6, "Mustang");

        /*exer2.a Nos controladores criados no Exercício 1 adicione dois objetos do tipo coleção, um do
        tipo List, outro do tipo Map*/
        List<Modelo> modelosList = new ArrayList<>();
        Map<Integer, Modelo> modelosMap = new HashMap<>();

        //exer2.d. Adicione na coleção todos os objetos criados no Exercício 1;
        //cria uma colecao do tipo List e adiciona objetos nela
        modelosList.add(modelo1);
        modelosList.add(modelo2);
        modelosList.add(modelo3);
        modelosList.add(modelo4);
        modelosList.add(modelo5);
        modelosList.add(modelo6);

        //cria uma coleção do tipo Map e adiciona objetos nela
        modelosMap.put(modelo1.getId(), modelo1);
        modelosMap.put(modelo2.getId(), modelo2);
        modelosMap.put(modelo3.getId(), modelo3);
        modelosMap.put(modelo4.getId(), modelo4);
        modelosMap.put(modelo5.getId(), modelo5);
        modelosMap.put(modelo6.getId(), modelo6);

        //exer2.e. Imprima os objetos contidos em cada coleção;
        System.out.println("\n* Lista de Modelo do TIPO LIST\n" + modelosList);
        System.out.println("\n* Lista de Modelo do TIPO MAP\n" + modelosMap);

        //exer2.f. Ordene a coleção em ordem decrescente e a imprima;
        //ordenacao da coleção do tipo List pelo id
        modelosList.sort(Comparator.comparing(Modelo::getId).reversed());
        System.out.println("\n* Lista de Modelo do TIPO LIST em ORDEM DECRESCENTE\n" + modelosList);

        //exer2.g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
        //pesquisa na coleção do tipo map
        //pesquisa por forca bruta percorre todos os obj dque tem na colecao, nao importa se achou ou nao
        modelosList.forEach(p -> {
            if (p.getId() == 3) {
                System.out.println("\n* Modelo de id=3\n" + p);
            }
        });
        //exer2.h Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
        modelosList.sort(Comparator.comparing(Modelo::getId));
        int index = Collections.binarySearch(
                modelosList, new Modelo(3, null), Comparator.comparing(Modelo::getId));
        if(index >= 0){
            Modelo modelo = modelosList.get(index);
            System.out.println("\n* Modelo de id=3 do TIPO LIST\n" + modelo);

        }
    }
}
