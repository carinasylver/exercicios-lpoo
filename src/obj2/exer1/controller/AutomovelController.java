package obj2.exer1.controller;

import obj2.exer1.model.Automovel;

public class AutomovelController {
    public static void main(String[] args) {
        //exer1c.i Crie duas instâncias de cada classe utilizando um construtor padrão;
        Automovel automovel1 = new Automovel();
        Automovel automovel2 = new Automovel();
        /*System.out.println(automovel1);*/
        //System.out.println(automovel2);

        /*exer1c.ii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas
        instâncias de cada classe utilizando um construtor parametrizado por todos
        os atributos da classe de modelo;*/
        Automovel automovel3 = new Automovel("ABCD1234",
                                            "ABC-1234",
                                            "Preto",
                                            4,
                                            "Gasolina",
                                            0,
                                            "ABC-1234",
                                            500.0);

        Automovel automovel4 = new Automovel("ABCD5678",
                                            "DEF-5678",
                                            "Branco",
                                            4,
                                            "Diesel",
                                            0,
                                            "DEF-5678",
                                            1000.0);

        /*exer1c.iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas
        instâncias de cada classe utilizando uma variação do construtor
        parametrizado.*/
        Automovel automovel5 = new Automovel("ABCD9012",
                                            "GHI-9012",
                                            "Vermelho",
                                            4,
                                            "Gasolina",
                                            0,
                                            "GHI-9012",
                                            1500.0);

        Automovel automovel6 = new Automovel("ABCD3456",
                                            "JKL-3456",
                                            "Azul",
                                            4,
                                            "Diesel",
                                            0,
                                            "JKL-3456",
                                            2000.0);
        /*exer1c.iv. Imprima todos os objetos criados com os construtores utilizando o método
        toString();*/
        System.out.println("\n--IMPRIMINDO OS OBJETOS CRIADOS COM OS CONSTRUTORES PADRAO E PARAMETRIZADO UTILIZANDO O METODO TOSTRING()\n");
        System.out.println("Objeto1"+ automovel1);
        System.out.println("Objeto2"+ automovel2);
        System.out.println("Objeto3"+ automovel3);
        System.out.println("Objeto4"+ automovel4);
        System.out.println("Objeto5"+ automovel5);
        System.out.println("Objeto6"+ automovel6);

        /*v. Agora utilize os métodos setters de cada classe de modelo para alterar o
        estado de cada objeto na memória RAM;*/
        automovel1.setRenavan("ABCD1234");
        automovel1.setPlaca("ABC-1234");
        automovel1.setCor("Preto");
        automovel1.setNum_rodas(4);
        automovel1.setCombustivel("Gasolina");
        automovel1.setQuilometragem(0);
        automovel1.setChassi("ABC-1234");
        automovel1.setValor_locacao(500.0);

        automovel2.setRenavan("ABCD5678");
        automovel2.setPlaca("DEF-5678");
        automovel2.setCor("Branco");
        automovel2.setNum_rodas(4);
        automovel2.setCombustivel("Diesel");
        automovel2.setQuilometragem(0);
        automovel2.setChassi("DEF-5678");
        automovel2.setValor_locacao(1000.0);

        automovel3.setRenavan("ABCD9012");
        automovel3.setPlaca("GHI-9012");
        automovel3.setCor("Vermelho");
        automovel3.setNum_rodas(4);
        automovel3.setCombustivel("Gasolina");
        automovel3.setQuilometragem(0);
        automovel3.setChassi("GHI-9012");
        automovel3.setValor_locacao(1500.0);

        automovel4.setRenavan("ABCD3456");
        automovel4.setPlaca("JKL-3456");
        automovel4.setCor("Azul");
        automovel4.setNum_rodas(4);
        automovel4.setCombustivel("Diesel");
        automovel4.setQuilometragem(0);
        automovel4.setChassi("JKL-3456");
        automovel4.setValor_locacao(2000.0);

        automovel5.setRenavan("ABCD7890");
        automovel5.setPlaca("MNO-7890");
        automovel5.setCor("Verde");
        automovel5.setNum_rodas(4);
        automovel5.setCombustivel("Gasolina");
        automovel5.setQuilometragem(0);
        automovel5.setChassi("MNO-7890");
        automovel5.setValor_locacao(2500.0);

        automovel6.setRenavan("ABDF1234");
        automovel6.setPlaca("ABC-1234");
        automovel6.setCor("Preto");
        automovel6.setNum_rodas(4);
        automovel6.setCombustivel("Gasolina");
        automovel6.setQuilometragem(0);
        automovel6.setChassi("ABC-1234");
        automovel6.setValor_locacao(500.0);

        /*exer1c.vi. Imprima todos objetos novamente, só que agora, ao invés de utilizar o
        método toString(), utilize os método getters.*/
        System.out.println("\n--IMPRIMINDO OS OBJETOS NOVAMENTE, SOMENTE UTILIZANDO OS METODOS GETTERS\n");
        System.out.println("Objeto1-> "+"Renavan:"+automovel1.getRenavan()+", Placa:"+automovel1.getPlaca()+", Cor:"+automovel1.getCor()+", Num de rodas:"+automovel1.getNum_rodas()+", Combustivel:"+automovel1.getCombustivel()+", Quilometragem:"+automovel1.getQuilometragem()+", Chassi:"+automovel1.getChassi()+", Valor Locação:"+automovel1.getValor_locacao() );
        System.out.println("Objeto2-> "+"Renavan:"+automovel2.getRenavan()+", Placa:"+automovel2.getPlaca()+", Cor:"+automovel2.getCor()+", Num de rodas:"+automovel2.getNum_rodas()+", Combustivel:"+automovel2.getCombustivel()+", Quilometragem:"+automovel2.getQuilometragem()+", Chassi:"+automovel2.getChassi()+", Valor Locação:"+automovel2.getValor_locacao() );
        System.out.println("Objeto3-> "+"Renavan:"+automovel3.getRenavan()+", Placa:"+automovel3.getPlaca()+", Cor:"+automovel3.getCor()+", Num de rodas:"+automovel3.getNum_rodas()+", Combustivel:"+automovel3.getCombustivel()+", Quilometragem:"+automovel3.getQuilometragem()+", Chassi:"+automovel3.getChassi()+", Valor Locação:"+automovel3.getValor_locacao() );
        System.out.println("Objeto4-> "+"Renavan:"+automovel4.getRenavan()+", Placa:"+automovel4.getPlaca()+", Cor:"+automovel4.getCor()+", Num de rodas:"+automovel4.getNum_rodas()+", Combustivel:"+automovel4.getCombustivel()+", Quilometragem:"+automovel4.getQuilometragem()+", Chassi:"+automovel4.getChassi()+", Valor Locação:"+automovel4.getValor_locacao() );
        System.out.println("Objeto5-> "+"Renavan:"+automovel5.getRenavan()+", Placa:"+automovel5.getPlaca()+", Cor:"+automovel5.getCor()+", Num de rodas:"+automovel5.getNum_rodas()+", Combustivel:"+automovel5.getCombustivel()+", Quilometragem:"+automovel5.getQuilometragem()+", Chassi:"+automovel5.getChassi()+", Valor Locação:"+automovel5.getValor_locacao() );
        System.out.println("Objeto6-> "+"Renavan:"+automovel6.getRenavan()+", Placa:"+automovel6.getPlaca()+", Cor:"+automovel6.getCor()+", Num de rodas:"+automovel6.getNum_rodas()+", Combustivel:"+automovel6.getCombustivel()+", Quilometragem:"+automovel6.getQuilometragem()+", Chassi:"+automovel6.getChassi()+", Valor Locação:"+automovel6.getValor_locacao() );





    }
}
