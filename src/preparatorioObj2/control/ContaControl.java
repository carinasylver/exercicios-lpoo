package preparatorioObj2.control;

import preparatorioObj2.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ContaControl {
    public static void main(String[] args) {

        /*1.a. Crie 3 instâncias de cada classe (das possíveis de criar instâncias), insira valores válidos
        nos atributos dessas instâncias, e imprima esses objetos;*/
        System.out.println("\n* 3 instâncias de cada classe (conta corrente, conta poupanca, cliente)");
        ContaCorrente cc1 = new ContaCorrente(1.000);
        ContaCorrente cc2 = new ContaCorrente(2.000);
        ContaCorrente cc3 = new ContaCorrente(3.000);

        ContaPoupanca cp1 = new ContaPoupanca(4.000);
        ContaPoupanca cp2 = new ContaPoupanca(5.000);
        ContaPoupanca cp3 = new ContaPoupanca(6.000);

        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");
        Cliente cliente3 = new Cliente("Pedro");

        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);
        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

        /*1.b. Crie as coleções necessárias para expressar as contas registradas no sistema, bem como,
         os associados, depois, imprima essa (s) coleção (ões);*/

        //lista de contas
        List<Conta> contasList = new ArrayList<>();
        contasList.add(cc1);
        contasList.add(cc2);
        contasList.add(cc3);

        contasList.add(cp1);
        contasList.add(cp2);
        contasList.add(cp3);

        //lista de clientes
        List<Cliente> clientesList = new ArrayList<>();
        clientesList.add(cliente1);
        clientesList.add(cliente2);
        clientesList.add(cliente3);

        System.out.println("\n* lista de contas: ");
        System.out.println(contasList);
        System.out.println("-----------------------------------");
        System.out.println("\n* lista de clientes: ");
        System.out.println(clientesList);
        System.out.println("-----------------------------------");

        /*1.c. Movimente, pelo menos, uma conta poupança, realizando as seguintes operações:
        depósito de R$ 1.000,00; atualização monetária de 5%; saque de R$ 50,00;*/
        cp1.deposita(1000);
        cp1.atualiza(0.05);
        cp1.saca(50);
        System.out.println("\n* conta poupanca 1: " + cp1);
        System.out.println("-----------------------------------");


        /*1d. Movimente, pelo menos, uma conta corrente, realizando as seguintes operações: depósito
         R$ 500,00; saque de R$ 400,00;*/
        cc1.deposita(500);
        cc1.saca(400);
        System.out.println("\n* conta corrente 1: " + cc1);
        System.out.println("-----------------------------------");

        /*1e. Faça com que cada associado tenha as seguintes quantidade de cotas, nessa ordem: 100,
         400, 600, 300, 600, 600, e imprima a (s) coleção (ões);*/
        cliente1.lucros(100, 0.0);
        cliente2.lucros(400, 0.0);
        cliente3.lucros(600, 0.0);
        cliente1.lucros(300, 0.0);
        cliente2.lucros(600, 0.0);
        cliente3.lucros(600, 0.0);

        System.out.println("\n* lista de clientes: ");
        System.out.println(clientesList);
        System.out.println("----------------------------");


        /*1.f. A partir da (s) coleção (ões), imprima todos os associados, ordenados pelo critério de
        número de cotas, em ordem decrescente. E faça o programa calcular e imprimir os
        associados com o maior número de cotas no sistema.*/

        clientesList.sort(Comparator.comparingInt(Cliente::getQdeCotas).reversed());
        System.out.println("\n* lista de clientes ordenada por cotas (decrescente): ");
        System.out.println(clientesList);

        System.out.println("----------------------------");

        //busca o numero de cotas do maior associado na lista de clientes
        int maiorNumeroCotas = 0;
        for (Cliente cliente : clientesList) {
            if (cliente.getQdeCotas() > maiorNumeroCotas) {
                maiorNumeroCotas = cliente.getQdeCotas();
            }
        }
        //System.out.println(maiorNumeroCotas);

        System.out.println("\n* associados com o maior número de cotas (" + maiorNumeroCotas + "):");
        for (Cliente cliente : clientesList) {
            if (cliente.getQdeCotas() == maiorNumeroCotas) {
                System.out.println(cliente);
            }
        }
        System.out.println("----------------------------");


        /*g. A partir da (s) coleção(ões), imprima todas as contas cadastradas no sistema, ordenadas pelo critério saldo,
        em ordem decrescente. E, imprima todas associados que sejam Associado e possua conta cadastradas no sistema,
        em qualquer ordem. Também faça o programa imprimir a lista de contas com maior saldo bancário.*/

        contasList.sort(Comparator.comparingDouble(Conta::getSaldo).reversed());

        System.out.println("\n* lista de contas ordenada por saldo (decrescente): ");
        System.out.println(contasList);
        System.out.println("----------------------------");

        System.out.println("\n* associados com contas cadastradas no sistema:");
//        for (Cliente cliente : clientesList) {
//            if (cliente instanceof Associado) {
//                System.out.println(cliente);
//            }
//            /*Como todos os objetos na lista clientesList já são instâncias de Cliente,
//            e Cliente implementa a interface Associado, a verificação instanceof é redundante.*/
//        }
//        System.out.println("----------------------------");
         /* Podemos simplificar o código para: clientesList.forEach(System.out::println);
         System.out.println(cliente);*/
        clientesList.forEach(System.out::println);
        System.out.println("------------------------------");

        // busca o maior saldo na lista de contas
        double maiorSaldo = 0;
        for (Conta conta : contasList) {
            if (conta.getSaldo() > maiorSaldo) {
                maiorSaldo = conta.getSaldo();
            }
        }

        // busca a conta com o maior saldo na lista de contas
        System.out.println("\n* contas com o maior saldo bancario (" + maiorSaldo + "):");
        for (Conta conta : contasList) {
            if (conta.getSaldo() == maiorSaldo) {
                System.out.println(conta);
            }
        }
        System.out.println("------------------------------");
    }

}
