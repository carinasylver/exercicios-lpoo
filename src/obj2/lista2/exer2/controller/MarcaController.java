package obj2.lista2.exer2.controller;

import obj2.lista2.exer2.model.Marca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarcaController {
    public static void main(String[] args) {
        //exer2.c Modifique cada objeto para que ele passe a conter um valor para o atributo id;
        Marca marca1 = new Marca(1, "Volkswagen");
        Marca marca2 = new Marca(2, "Honda");
        Marca marca3 = new Marca(3,"Audi");
        Marca marca4 = new Marca(4,"Toyota");
        Marca marca5 = new Marca(5,"Chevrolet");
        Marca marca6 = new Marca(6,"Ford");

        /*exer2.a Nos controladores criados no Exercício 1 adicione dois objetos do tipo coleção, um do
        tipo List, outro do tipo Map*/
        List<Marca> marcasList = new ArrayList<>();
        Map<Integer, Marca> marcasMap = new HashMap<>();

        //exer2.d. Adicione na coleção todos os objetos criados no Exercício 1;
        //cria uma colecao do tipo List e adiciona objetos nela
        marcasList.add(marca1);
        marcasList.add(marca2);
        marcasList.add(marca3);
        marcasList.add(marca4);
        marcasList.add(marca5);
        marcasList.add(marca6);

        //cria uma coleção do tipo Map e adiciona objetos nela
        marcasMap.put(marca1.getId(), marca1);
        marcasMap.put(marca2.getId(), marca2);
        marcasMap.put(marca3.getId(), marca3);
        marcasMap.put(marca4.getId(), marca4);
        marcasMap.put(marca5.getId(), marca5);
        marcasMap.put(marca6.getId(), marca6);

        //exer2.e. Imprima os objetos contidos em cada coleção;
        System.out.println("\nObjetos do Tipo List =>" +marcasList);
        System.out.println("\nObjetos do Tipo Map =>" +marcasMap);

        //exer2.f. Ordene a coleção em ordem decrescente e a imprima;
        //ordenacao da coleção do tipo List pelo id
        marcasList.sort(Comparator.comparing(Marca::getId).reversed());
        System.out.println("\n* Lista de Marcas do TIPO LIST em ORDEM DECRESCENTE\n" + marcasList);

        //exer2.g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
        //pesquisa por forca bruta percorre todos os obj dque tem na colecao, nao importa se achou ou nao
        marcasList.forEach(p -> {
            if (p.getId() == 3) {
                System.out.println("\n* Marca de id=3 do TIPO LIST\n" + p);
            }
        });

        //exer2.h Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
        marcasList.sort(Comparator.comparing(Marca::getId));
        int index = Collections.binarySearch(
                marcasList, new Marca(3, null), Comparator.comparing(Marca::getId));
        if(index >= 0){
            Marca marca = marcasList.get(index);
            System.out.println("\n* marca de id=3 do TIPO LIST\n" + marca);

        }

    }
}
