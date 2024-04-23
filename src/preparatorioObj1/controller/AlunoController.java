package preparatorioObj1.controller;

import obj1.exer2.model.Funcionario;
import obj1.exer2.model.Produto;
import preparatorioObj1.model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args) {
        /*a. Criar, no mínimo, 6 instâncias da classe de modelo, alternando entre construtores do tipo
        padrão e parametrizado*/

        //Duas instâncias devem ser criadas com o construtor padrão
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        //2 instâncias com o construtor parametrizado que contenha todos os atributos da classe
        Aluno aluno3 = new Aluno(3, 123456789, "Joao", "Silva", "XXXXXXXXXXXXXX");
        Aluno aluno4 = new Aluno(4, 987654321, "Maria", "Santos", "XXXXXXXXXXXXXX");

        //2 instâncias com outro construtor parametrizado que contenha dois atributos como
        //parâmetro
        Aluno aluno5 = new Aluno(987654321, "Maria");
        Aluno aluno6 = new Aluno(987654321, "Maria");

        /*Imediatamente depois de serem construídas essas instâncias devem ser
        impressas com o uso do comportamento toString;*/
        System.out.println("\n * instancias criadas com contrutor padrão");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println("\n* instancias criadas com contrutor parametrizado");
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println("\n* instancias criadas com contrutor com 2 parametros");
        System.out.println(aluno5);
        System.out.println(aluno6);

        /*b. Os dois objetos criados com o construtor padrão devem ter seus estados modificados, em
        todos os seus atributos, com os métodos setters e devem ser impressos com os métodos
        getters (observe que não é para utilizar o comportamento toString);*/
        aluno1.setId(1);
        aluno1.setCpf(987654322);
        aluno1.setNome("Pedro");
        aluno1.setSobrenome("Alves");
        aluno1.setEmail("email1@email.com");

        aluno2.setId(2);
        aluno2.setCpf(987654323);
        aluno2.setNome("Maria Clara");
        aluno2.setSobrenome("Alves");
        aluno2.setEmail("email2@email.com");

        aluno3.setId(3);
        aluno3.setCpf(987654324);
        aluno3.setNome("Paulo");
        aluno3.setSobrenome("Alves");
        aluno3.setEmail("email3@email.com");

        aluno4.setId(4);
        aluno4.setCpf(987654325);
        aluno4.setNome("Ana");
        aluno4.setSobrenome("Alves");
        aluno4.setEmail("email4@email.com");

        aluno5.setId(5);
        aluno5.setCpf(987654326);
        aluno5.setNome("Joao");
        aluno5.setSobrenome("Alves");
        aluno5.setEmail("email5@email.com");

        aluno6.setId(6);
        aluno6.setCpf(987654327);
        aluno6.setNome("Maria");
        aluno6.setSobrenome("Alves");
        aluno6.setEmail("email6@email.com");

        System.out.println("\n* impressao com os metodos getters");
        System.out.println("id:"+ aluno1.getId() + ", cpf: " + aluno1.getCpf() + ", nome: " + aluno1.getNome() + ", sobrenome: " + aluno1.getSobrenome() + ", email: " + aluno1.getEmail());
        System.out.println("id:"+ aluno2.getId() + ", cpf: " + aluno2.getCpf() + ", nome: " + aluno2.getNome() + ", sobrenome: " + aluno2.getSobrenome() + ", email: " + aluno2.getEmail());
        System.out.println("id:"+ aluno3.getId() + ", cpf: " + aluno3.getCpf() + ", nome: " + aluno3.getNome() + ", sobrenome: " + aluno3.getSobrenome() + ", email: " + aluno3.getEmail());
        System.out.println("id:"+ aluno4.getId() + ", cpf: " + aluno4.getCpf() + ", nome: " + aluno4.getNome() + ", sobrenome: " + aluno4.getSobrenome() + ", email: " + aluno4.getEmail());
        System.out.println("id:"+ aluno5.getId() + ", cpf: " + aluno5.getCpf() + ", nome: " + aluno5.getNome() + ", sobrenome: " + aluno5.getSobrenome() + ", email: " + aluno5.getEmail());
        System.out.println("id:"+ aluno6.getId() + ", cpf: " + aluno6.getCpf() + ", nome: " + aluno6.getNome() + ", sobrenome: " + aluno6.getSobrenome() + ", email: " + aluno6.getEmail());

        /*2. No controlador criado na questão 1 adicione dois tipos de coleções de objetos, List
        e Map.*/
        List<Aluno> listaAlunos = new ArrayList<>();
        Map<Integer, Aluno> mapAlunos = new HashMap<>();

        /*Em cada coleção adicione todos os objetos que você criou nesse controlador, tendo o
        cuidado de inserir os objetos ordenados pelo campo id (se não tiver um, crie-o), na ordem
        crescente, e imprima esses objetos. */
        //adicionando objetos na colecao do tipo list
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno5);
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno4);
        listaAlunos.add(aluno6);

        //adicionando objetos na colecao do tipo map
        mapAlunos.put(1, aluno1);
        mapAlunos.put(2, aluno2);
        mapAlunos.put(3, aluno3);
        mapAlunos.put(4, aluno4);
        mapAlunos.put(5, aluno5);
        mapAlunos.put(6, aluno6);

        //objetos ordenados pelo campo id
        listaAlunos.sort(Comparator.comparing(Aluno::getId));
        System.out.println("\n* lista de alunos ordenada pelo campo id" +listaAlunos);

        //Também imprima o objeto de id=5 de cada coleção, se essa operação for possível na coleção.
        listaAlunos.forEach(p -> {
            if (p.getId() == 5) {
                System.out.println("\n* aluno de id=5 do TIPO LIST\n" + p);
            }
        });
        System.out.println("\n* aluno de id=5 do TIPO MAP\n" + mapAlunos.get(5));


        /*Por fim, ordene os objetos pelo campo id, na ordem  decrescente, com uma das técnicas apresentadas em sala de aula e imprima as coleções que
        você reordenou.*/
        listaAlunos.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println("\n* Lista de alunos ordenada pelo campo id em ordem decrescente" +listaAlunos);


    }
}
