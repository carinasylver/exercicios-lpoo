package obj1.exer2.controller;

import obj1.exer2.model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {

        //exer2.c Modifique cada objeto para que ele passe a conter um valor para o atributo id;
        Carro carro1 = new Carro(1, "Marca1", "Modelo1", 2000);
        Carro carro2 = new Carro(2, "Ferrari", "F40", 1920);
        Carro carro3 = new Carro(3,"Ford" ,"Mustang" , 1969);
        Carro carro4 = new Carro(4, "Volkswagen", "Fusca", 1973);
        Carro carro5 = new Carro(5, "Chevrolet", "Chevette", 1983);


        /*exer2.a Nos controladores criados no Exercício 1 adicione dois objetos do tipo coleção, um do
        tipo List, outro do tipo Map*/
        List<Carro> carrosList = new ArrayList<>(); //coleçao do tipo List
        Map<Integer, Carro> carrosMap = new HashMap<>();//coleçao do tipo Map

        //exer2.d. Adicione na coleção todos os objetos criados no Exercício 1;
        //cria uma colecao de carros do tipo List e adiciona objetos nela
        carrosList.add(carro1);
        carrosList.add(carro2);
        carrosList.add(carro3);
        carrosList.add(carro4);
        carrosList.add(carro5);

        //cria uma coleção do tipo Map e adiciona objetos nela
        //1 argumento(Integer))eh a chave q vai utilizar na funcao map
        //2 argument(carro)eh o tipo de objeto q vou manipular dentro da colecao
        //Map<Integer, Carro> carrosMap = new HashMap<>(); //hashmap pq usa funçao hash p colocar valores dentro da coleçao e para buscar
        carrosMap.put(carro1.getId(), carro1); //put(string key, carro value)// passo 2 arg chave e valor
        carrosMap.put(carro2.getId(), carro2);
        carrosMap.put(carro3.getId(), carro3);
        carrosMap.put(carro4.getId(), carro4);
        carrosMap.put(carro5.getId(), carro5);

        //vantagem da map eh que nao repete o mesmo dado, ou seja nao possui dados repetidos.
        // 2 vantagem eh a velocidade em q salvo o dado na posicao da mem
        // 3 vantagem eh a busca do dado
        // a funcao hash eh aplicada emcima da chave e nao do objeto

        //exer2.e. Imprima os objetos contidos em cada coleção;
        System.out.println("\n* Lista de carros do TIPO LIST\n" + carrosList);
        System.out.println("\n* Lista de carros do TIPO MAP\n" + carrosMap);

        //exer2.f. Ordene a coleção em ordem decrescente e a imprima;
        //ordenacao da coleção do tipo List pelo id
        carrosList.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println("\n* Lista de carros do TIPO LIST em ORDEM DECRESCENTE\n" + carrosList);


        //ordenacao da coleção do tipo Map
        //nao se ordena colecao do tipo Map, por que perde a referencia da chave na posicao de memoria onde salvou o bjeto, eu estaria buscando o registro errado

        //exer2.g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
        //pesquisa na coleção do tipo map
        //pesquisa por forca bruta percorre todos os obj dque tem na colecao, nao importa se achou ou nao

        carrosList.forEach(p -> {
            if (p.getId() == 3) {
                System.out.println("\n* Carro de id=3 do TIPO LIST\n" + p);
            }
        });

        //exer2.h Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
        carrosList.sort(Comparator.comparing(Carro::getId));
        int index = Collections.binarySearch(
                carrosList, new Carro(3, null, null, null), Comparator.comparing(Carro::getId));
        if (index >= 0) {
            System.out.println("\n* Carro de id=3 do TIPO LIST (pesquisa binária)\n" + carrosList.get(index));
        }






    }
}
