package obj2.lista2.exer2.controller;

import obj2.lista2.exer2.model.Cliente;

import java.util.*;

public class ClienteController {
    public static void main(String[] args) {
        //exer2.c Modifique cada objeto para que ele passe a conter um valor para o atributo id;
        Cliente cliente1 = new Cliente(1,"123.456.789-01","Gilberto","Peres","Rua A","12345-876","53 99999-9990","emailA@email.com");
        Cliente cliente2 = new Cliente(2, "123.456.789-02", "Pedro", "Santos", "Rua B", "12345-677", "53 99999-9999", "emailB@email.com");
        Cliente cliente3 = new Cliente(3,"123.456.789-10","João","Silva","Rua C","12345-678","53 99999-9999","emailC@email.com");
        Cliente cliente4 = new Cliente(4,"123.456.789-11","Maria","Santos","Rua D","12345-679","53 99999-9999","emailD@email.com");
        Cliente cliente5 = new Cliente(5,"123.456.789-12","Paulo","Souza","Rua E","12345-680","53 99999-9999","emailE@email.com");
        Cliente cliente6 = new Cliente(6,"123.456.789-13","Ana","Pereira","Rua F", "12345-681","53 99999-9999","emailF@email.com");

        /*exer2.a Nos controladores criados no Exercício 1 adicione dois objetos do tipo coleção, um do
        tipo List, outro do tipo Map*/
        List<Cliente> clientesList = new ArrayList<>();
        Map<Integer, Cliente> clientesMap = new HashMap<>();


        //exer2.d. Adicione na coleção todos os objetos criados no Exercício 1;
        //cria uma colecao de carros do tipo List e adiciona objetos nela
        clientesList.add(cliente1);
        clientesList.add(cliente2);
        clientesList.add(cliente3);
        clientesList.add(cliente4);
        clientesList.add(cliente5);
        clientesList.add(cliente6);

        //cria uma coleção do tipo Map e adiciona objetos nela
        clientesMap.put(cliente1.getId(), cliente1);
        clientesMap.put(cliente2.getId(), cliente2);
        clientesMap.put(cliente3.getId(), cliente3);
        clientesMap.put(cliente4.getId(), cliente4);
        clientesMap.put(cliente5.getId(), cliente5);
        clientesMap.put(cliente6.getId(), cliente6);

        //exer2.e. Imprima os objetos contidos em cada coleção;
        System.out.println("\nObjetos do Tipo List =>" +clientesList);
        System.out.println("\nObjetos do Tipo Map =>" +clientesMap);


        //exer2.f. Ordene a coleção em ordem decrescente e a imprima;
        //ordenacao da coleção do tipo List pelo id
        clientesList.sort(Comparator.comparing(Cliente::getId).reversed());
        System.out.println("\nColeção clientes do Tipo List ordenados =>" +clientesList);


        //exer2.g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
        //pesquisa na coleção do tipo map
        //pesquisa por forca bruta percorre todos os obj dque tem na colecao, nao importa se achou ou nao
        clientesList.forEach(p -> {
            if (p.getId() == 3) {
                System.out.println("\n* Cliente de id=3 do TIPO LIST\n" + p);
            }
        });
        //exer2.h Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
        //lista.sort(Comparator.comparing(Objeto::getId));
        clientesList.sort(Comparator.comparing(Cliente::getId));
        int index = Collections.binarySearch(
                clientesList, new Cliente(3,null,null,null,null,null,null,null), Comparator.comparing(Cliente::getId));
        if (index >= 0) {
            Cliente cliente = clientesList.get(index);
            System.out.println("\n* Cliente de id=3 do TIPO LIST (pesquisa binária)\n" + cliente);
        }

    }

}
