package obj1.exer2.controller;

import obj1.exer2.model.Conta;
import obj2.exer2.model.Locacao;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {

        //exer2.c Modifique cada objeto para que ele passe a conter um valor para o atributo id;
        Conta conta1 = new Conta(1,1000.0);
        Conta conta2 = new Conta(2, 2000.0);
        Conta conta3 = new Conta(3, 3000.0);
        Conta conta4 = new Conta(4, 2000.0);
        Conta conta5 = new Conta(5, 3000.0);
        Conta conta6 = new Conta(6, 4000.0);

        /*exer2.a Nos controladores criados no Exercício 1 adicione dois objetos do tipo coleção, um do
        tipo List, outro do tipo Map*/
        List<Conta> contasList = new ArrayList<>();
        Map<Integer, Conta> contasMap = new HashMap<>();

        //exer2.d. Adicione na coleção todos os objetos criados no Exercício 1;
        //cria uma colecao de carros do tipo List e adiciona objetos nela
        contasList.add(conta1);
        contasList.add(conta2);
        contasList.add(conta3);
        contasList.add(conta4);
        contasList.add(conta5);
        contasList.add(conta6);

        //cria uma coleção do tipo Map e adiciona objetos nela

       contasMap.put(conta1.getId(), conta1);
       contasMap.put(conta2.getId(), conta2);
       contasMap.put(conta3.getId(), conta3);
       contasMap.put(conta4.getId(), conta4);
       contasMap.put(conta5.getId(), conta5);
       contasMap.put(conta6.getId(), conta6);


       //exer2.e. Imprima os objetos contidos em cada coleção;
        System.out.println("\n* Lista de contas do TIPO LIST\n" + contasList);
        System.out.println("\n* Lista de contas do TIPO MAP\n" + contasMap);

        //exer2.f. Ordene a coleção em ordem decrescente e a imprima;
        //ordenacao da coleção do tipo List pelo id
        contasList.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println("\n* Lista de contas do TIPO LIST em ORDEM DECRESCENTE\n" + contasList);

        //ordenacao da coleção do tipo Map
        //nao se ordena colecao do tipo Map, por que perde a referencia da chave na posicao de memoria onde salvou o bjeto, eu estaria buscando o registro errado

        //exer2.g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
       //pesquisa na coleção do tipo map
       //pesquisa por forca bruta percorre todos os obj dque tem na colecao, nao importa se achou ou nao

        contasList.forEach(p -> {
            if (p.getId() == 3) {
                System.out.println("\n* Conta de id=3 do TIPO LIST\n" + p);
            }
        });

        //exer2.h Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
        contasList.sort(Comparator.comparing(Conta::getId));
        int index = Collections.binarySearch(
                contasList, new Conta(3, null), Comparator.comparing(Conta::getId));
        if (index >= 0) {
            Conta conta = contasList.get(index);
            System.out.println("\n* Conta de id=3 do TIPO LIST (pesquisa binária)\n" + conta);
        }

    }

}


