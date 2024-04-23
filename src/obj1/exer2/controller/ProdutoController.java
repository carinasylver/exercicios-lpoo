package obj1.exer2.controller;

import obj1.exer2.model.Conta;
import obj1.exer2.model.Produto;
import obj2.exer2.model.Locacao;


import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {
        //exer2.c Modifique cada objeto para que ele passe a conter um valor para o atributo id;
        Produto produto1 = new Produto(1,"Tablet", "Apple iPad Pro", 8000.0, 20);
        Produto produto2 = new Produto(2,"Notebook", "Dell Inspiron", 3500.0, 100);
        Produto produto3 = new Produto(3,"Smartphone", "Samsung Galaxy S10", 5000.0, 50);
        Produto produto4 = new Produto(4,"Smartwatch", "Apple Watch", 1500.0, 200);
        Produto produto5 = new Produto(5,"Monitor", "Samsung 24", 2000.0, 80);
        Produto produto6 = new Produto(6,"TV", "Samsung 50", 5000.0, 30);

        /*exer2.a Nos controladores criados no Exercício 1 adicione dois objetos do tipo coleção, um do
        tipo List, outro do tipo Map*/
        List<Produto> produtosList = new ArrayList<>();
        Map<Integer, Produto> produtosMap = new HashMap<>();

        //exer2.d. Adicione na coleção todos os objetos criados no Exercício 1;
        //cria uma colecao de produtos do tipo List e adiciona objetos nela
        produtosList.add(produto1);
        produtosList.add(produto2);
        produtosList.add(produto3);
        produtosList.add(produto4);
        produtosList.add(produto5);
        produtosList.add(produto6);

        //cria uma coleção do tipo Map e adiciona objetos nela

        produtosMap.put(produto1.getId(), produto1);
        produtosMap.put(produto2.getId(), produto2);
        produtosMap.put(produto3.getId(), produto3);
        produtosMap.put(produto4.getId(), produto4);
        produtosMap.put(produto5.getId(), produto5);
        produtosMap.put(produto6.getId(), produto6);


        //exer2.e. Imprima os objetos contidos em cada coleção;
        System.out.println("\n* Lista de produtos do TIPO LIST\n" + produtosList);
        System.out.println("\n* Lista de produtos do TIPO MAP\n" + produtosMap);

        //exer2.f. Ordene a coleção em ordem decrescente e a imprima;
        //ordenacao da coleção do tipo List pelo id
        produtosList.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println("\n* Lista de contas do TIPO LIST em ORDEM DECRESCENTE\n" + produtosList);

        //ordenacao da coleção do tipo Map
        //nao se ordena colecao do tipo Map, por que perde a referencia da chave na posicao de memoria onde salvou o bjeto, eu estaria buscando o registro errado

        //exer2.g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
        //pesquisa na coleção do tipo map
        //pesquisa por forca bruta percorre todos os obj dque tem na colecao, nao importa se achou ou nao

        produtosList.forEach(p -> {
            if (p.getId() == 3) {
                System.out.println("\n* Produto de id=3 do TIPO LIST\n" + p);
            }
        });

        //exer2.h Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
        produtosList.sort(Comparator.comparing(Produto::getId));
        int index = Collections.binarySearch(
                produtosList, new Produto(3,null, null, null, null), Comparator.comparing(Produto::getId));//compara apenas o id
        if (index >= 0) {
            Produto produto = produtosList.get(index);
            System.out.println("\n* Produto de id=3 do TIPO LIST (pesquisa binária)\n" + produto);
        }

    }


}
