package obj2.exer1.controller;

import obj2.exer1.model.Cliente;

public class ClienteController {
    public static void main(String[] args) {
        //exer1c.i Crie duas instâncias de cada classe utilizando um construtor padrão;
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        /*exer1c.ii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas
        instâncias de cada classe utilizando um construtor parametrizado por todos
        os atributos da classe de modelo;*/
        Cliente cliente3 = new Cliente("123.456.789-10",
                                       "João",
                                       "Silva",
                                       "Rua C",
                                       "12345-678",
                                       "53 99999-9999",
                                       "email@email.com");

        Cliente cliente4 = new Cliente("123.456.789-11",
                                       "Maria",
                                       "Santos",
                                       "Rua D",
                                       "12345-679",
                                       "53 99999-9999",
                                       "email@email.com");

        /*exer1c.iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas
        instâncias de cada classe utilizando uma variação do construtor
        parametrizado.*/
        Cliente cliente5 = new Cliente("123.456.789-12",
                "Paulo",
                "Souza",
                "Rua D",
                "12345-680",
                "53 99999-9999",
                "email@email.com");

        Cliente cliente6 = new Cliente("123.456.789-13",
                "Ana",
                "Pereira",
                "Rua E",
                "12345-681",
                "53 99999-9999",
                "email@email.com");

        /*exer1c.iv. Imprima todos os objetos criados com os construtores utilizando o método
        toString();*/
        System.out.println("\n--IMPRIMINDO OS OBJETOS CRIADOS COM OS CONSTRUTORES PADRAO E PARAMETRIZADO UTILIZANDO O METODO TOSTRING()\n");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);
        System.out.println(cliente6);

        /*v. Agora utilize os métodos setters de cada classe de modelo para alterar o
        estado de cada objeto na memória RAM;*/
        cliente1.setCpf("123.456.789-01");
        cliente1.setNome("Gilberto");
        cliente1.setSobrenome("Peres");
        cliente1.setEndereco("Rua F");
        cliente1.setCep("12345-876");
        cliente1.setTelefone("53 99999-9990");
        cliente1.setEmail("email@email.com");

        cliente2.setCpf("123.456.789-02");
        cliente2.setNome("Pedro");
        cliente2.setSobrenome("Santos");
        cliente2.setEndereco("Rua E");
        cliente2.setCep("12345-679");
        cliente2.setTelefone("53 99999-9992");
        cliente2.setEmail("email@email.com");

        cliente3.setCpf("123.456.789-12");
        cliente3.setNome("Paulo");
        cliente3.setSobrenome("Souza");
        cliente3.setEndereco("Rua D");
        cliente3.setCep("12345-680");
        cliente3.setTelefone("53 99999-9993");
        cliente3.setEmail("email@email.com");

        cliente4.setCpf("123.456.789-13");
        cliente4.setNome("Ana");
        cliente4.setSobrenome("Pereira");
        cliente4.setEndereco("Rua C");
        cliente4.setCep("12345-681");
        cliente4.setTelefone("53 99999-9994");
        cliente4.setEmail("email@email.com");

        cliente5.setCpf("123.456.789-14");
        cliente5.setNome("Lucas");
        cliente5.setSobrenome("Oliveira");
        cliente5.setEndereco("Rua B");
        cliente5.setCep("12345-682");
        cliente5.setTelefone("53 99999-9995");
        cliente5.setEmail("email@email.com");

        cliente6.setCpf("123.456.789-15");
        cliente6.setNome("Mariana");
        cliente6.setSobrenome("Santos");
        cliente6.setEndereco("Rua A");
        cliente6.setCep("12345-683");
        cliente6.setTelefone("53 99999-9996");
        cliente6.setEmail("email@email.com");

        /*exer1c.vi. Imprima todos objetos novamente, só que agora, ao invés de utilizar o
        método toString(), utilize os método getters.*/
        System.out.println("\n--IMPRIMINDO OS OBJETOS NOVAMENTE, SOMENTE UTILIZANDO OS METODOS GETTERS\n");
        System.out.println("Objeto1-> "+"CPF:"+cliente1.getCpf()+", Nome:"+cliente1.getNome()+", Sobrenome:"+cliente1.getSobrenome()+", Endereço:"+cliente1.getEndereco()+", CEP:"+cliente1.getCep()+", Telefone:"+cliente1.getTelefone()+", Email:"+cliente1.getEmail() );
        System.out.println("Objeto2-> "+"CPF:"+cliente2.getCpf()+", Nome:"+cliente2.getNome()+", Sobrenome:"+cliente2.getSobrenome()+", Endereço:"+cliente2.getEndereco()+", CEP:"+cliente2.getCep()+", Telefone:"+cliente2.getTelefone()+", Email:"+cliente2.getEmail() );
        System.out.println("Objeto3-> "+"CPF:"+cliente3.getCpf()+", Nome:"+cliente3.getNome()+", Sobrenome:"+cliente3.getSobrenome()+", Endereço:"+cliente3.getEndereco()+", CEP:"+cliente3.getCep()+", Telefone:"+cliente3.getTelefone()+", Email:"+cliente3.getEmail() );
        System.out.println("Objeto4-> "+"CPF:"+cliente4.getCpf()+", Nome:"+cliente4.getNome()+", Sobrenome:"+cliente4.getSobrenome()+", Endereço:"+cliente4.getEndereco()+", CEP:"+cliente4.getCep()+", Telefone:"+cliente4.getTelefone()+", Email:"+cliente4.getEmail() );
        System.out.println("Objeto5-> "+"CPF:"+cliente5.getCpf()+", Nome:"+cliente5.getNome()+", Sobrenome:"+cliente5.getSobrenome()+", Endereço:"+cliente5.getEndereco()+", CEP:"+cliente5.getCep()+", Telefone:"+cliente5.getTelefone()+", Email:"+cliente5.getEmail() );
        System.out.println("Objeto6-> "+"CPF:"+cliente6.getCpf()+", Nome:"+cliente6.getNome()+", Sobrenome:"+cliente6.getSobrenome()+", Endereço:"+cliente6.getEndereco()+", CEP:"+cliente6.getCep()+", Telefone:"+cliente6.getTelefone()+", Email:"+cliente6.getEmail() );




    }
}
