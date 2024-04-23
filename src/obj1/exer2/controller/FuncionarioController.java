package obj1.exer2.controller;

import obj1.exer2.model.Funcionario;
import obj2.exer2.model.Locacao;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        //exer2.c Modifique cada objeto para que ele passe a conter um valor para o atributo id;
        Funcionario funcionario1 = new Funcionario(1, "Luis Gustavo", 2000.0);
        Funcionario funcionario2 = new Funcionario(2, "Ana carolina", 1000.0);
        Funcionario funcionario3 = new Funcionario(3,"Maria Julia", 3000.0);
        Funcionario funcionario4 = new Funcionario(4,"Beatriz", 4000.0);
        Funcionario funcionario5 = new Funcionario(5,"Joao", 5000.0);
        Funcionario funcionario6 = new Funcionario(6,"Paulo", 6000.0);

        /*exer2.a Nos controladores criados no Exercício 1 adicione dois objetos do tipo coleção, um do
        tipo List, outro do tipo Map*/
        List<Funcionario> funcionariosList = new ArrayList<>();
        Map<Integer, Funcionario> funcionariosMap = new HashMap<>();

        //exer2.d. Adicione na coleção todos os objetos criados no Exercício 1;
        //cria uma colecao de carros do tipo List e adiciona objetos nela
        funcionariosList.add(funcionario1);
        funcionariosList.add(funcionario2);
        funcionariosList.add(funcionario3);
        funcionariosList.add(funcionario4);
        funcionariosList.add(funcionario5);
        funcionariosList.add(funcionario6);

        //cria uma coleção do tipo Map e adiciona objetos nela

        funcionariosMap.put(funcionario1.getId(), funcionario1);
        funcionariosMap.put(funcionario2.getId(), funcionario2);
        funcionariosMap.put(funcionario3.getId(), funcionario3);
        funcionariosMap.put(funcionario4.getId(), funcionario4);
        funcionariosMap.put(funcionario5.getId(), funcionario5);
        funcionariosMap.put(funcionario6.getId(), funcionario6);


        //exer2.e. Imprima os objetos contidos em cada coleção;
        System.out.println("\n* Lista de funcionarios do TIPO LIST\n" + funcionariosList);
        System.out.println("\n* Lista de funcionarios do TIPO MAP\n" + funcionariosMap);

        //exer2.f. Ordene a coleção em ordem decrescente e a imprima;
        //ordenacao da coleção do tipo List pelo id
        funcionariosList.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println("\n* Lista de funcionarios do TIPO LIST em ORDEM DECRESCENTE\n" + funcionariosList);

        //ordenacao da coleção do tipo Map
        //nao se ordena colecao do tipo Map, por que perde a referencia da chave na posicao de memoria onde salvou o bjeto, eu estaria buscando o registro errado

        //exer2.g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
        //pesquisa na coleção do tipo map
        //pesquisa por forca bruta percorre todos os obj dque tem na colecao, nao importa se achou ou nao

        funcionariosList.forEach(p -> {
            if (p.getId() == 3) {
                System.out.println("\n* Funcionario de id=3 do TIPO LIST\n" + p);
            }
        });

        //exer2.h Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
        funcionariosList.sort(Comparator.comparing(Funcionario::getId));
        int index = Collections.binarySearch(
                funcionariosList, new Funcionario(3, null, null), Comparator.comparing(Funcionario::getId));
        if (index >= 0) {
            Funcionario funcionario = funcionariosList.get(index);
            System.out.println("\n* Funcionario de id=3 do TIPO LIST (pesquisa binária)\n" + funcionario);
        }






    }


}
