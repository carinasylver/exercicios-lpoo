package obj1.exer1.controller;

import obj1.exer1.model.Carro;

public class CarroController {

    public static void main(String[] args) {
        System.out.println("\n==== OBJETOS DA CLASSE CARRO ====");

        //exer1c-i. Crie duas instâncias de cada classe utilizando um construtor padrão;
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        /*exer1c-ii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de
        cada classe utilizando um construtor parametrizado por todos os atributos da classe
        de modelo;*/
        Carro carro3 = new Carro("Ferrari", "F40", 1987);
        Carro carro4 = new Carro("Ford", "Mustang", 1969);

        /*exerc1c-iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de
cada classe utilizando uma variação do construtor parametrizado.*/
        Carro carro5 = new Carro("Volkswagen", "Fusca", 1973);
        Carro carro6 = new Carro("Chevrolet", "Chevette", 1983);


        //exerc1c-iv. Imprima todos os objetos criados com os construtores utilizando o método toString();
        System.out.println("\n--IMPRIMINDO OS OBJETOS COM OS CONSTRUTORES UTILIZANDO O METODO TOSTRING()\n");
        System.out.println("* INSTANCIA COM O CONSTRUTOR PADRAO DA CLASSE");
        System.out.println("Carro 1 " + carro1); //model.Carro@1b28cdfa
        System.out.println("Carro 2 " + carro2);
        System.out.println("\n* INSTANCIA COM O CONSTRUTOR PARAMETRIZADO");
        System.out.println("Carro 3 " + carro3);
        System.out.println("Carro 4 " + carro4);
        System.out.println("Carro 5 " + carro5);
        System.out.println("Carro 6 " + carro6);

        /*exerc1v. Agora utilize os métodos setters de cada classe de modelo para alterar o estado de
        cada objeto na memória RAM;*/
        //ALTERANDO OS OBJETOS CRIADOS COM OS CONSTRUTORES UTILIZANDO OS METODOS SETTERS
        carro1.setMarca("Chevrolet");
        carro1.setModelo("Camaro");
        carro1.setAnoFabricacao(1967);
//        System.out.println("Carro 1 " + carro1);

        carro2.setMarca("Lamborghini");
        carro2.setModelo("Aventador");
        carro2.setAnoFabricacao(2020);

        carro3.setMarca("BMW");
        carro3.setModelo("M3");
        carro3.setAnoFabricacao(2020);

        carro4.setMarca("Mercedes-Bens");
        carro4.setModelo("C-class");
        carro4.setAnoFabricacao(2021);

        carro5.setMarca("Fiat");
        carro5.setModelo("Uno");
        carro5.setAnoFabricacao(2020);

        carro6.setMarca("Ford");
        carro6.setModelo("Fiesta");
        carro6.setAnoFabricacao(2020);

        /*exerc1c-vi. Imprima todos objetos novamente, só que agora, ao invés de utilizar o método
        toString(), utilize os método getters.*/
        System.out.println("\n-- IMPRIMINDO OS OBJETOS CRIADOS COM OS CONSTRUTORES UTILIZANDO OS METODOS GETTERS");
        System.out.println("Carro 1 => " + "Marca: " + carro1.getMarca() + ", "  + "Modelo: " + carro1.getModelo() +  ", "  + "Ano de Fabricação: " + carro1.getAnoFabricacao());
        System.out.println("Carro 2 => " + "Marca: " + carro2.getMarca() + ", "  + "Modelo: " + carro2.getModelo() +  ", "  + "Ano de Fabricação: " + carro2.getAnoFabricacao());
        System.out.println("Carro 3 => " + "Marca: " + carro3.getMarca() + ", "  + "Modelo: " + carro3.getModelo() +  ", "  + "Ano de Fabricação: " + carro3.getAnoFabricacao());
        System.out.println("Carro 4 => " + "Marca: " + carro4.getMarca() + ", "  + "Modelo: " + carro4.getModelo() +  ", "  + "Ano de Fabricação: " + carro4.getAnoFabricacao());
        System.out.println("Carro 5 => " + "Marca: " + carro5.getMarca() + ", "  + "Modelo: " + carro5.getModelo() +  ", "  + "Ano de Fabricação: " + carro5.getAnoFabricacao());
        System.out.println("Carro 6 => " + "Marca: " + carro6.getMarca() + ", "  + "Modelo: " + carro6.getModelo() +  ", "  + "Ano de Fabricação: " + carro6.getAnoFabricacao());


    }

}
