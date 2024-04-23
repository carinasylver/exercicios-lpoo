package obj1.exer1.controller;
import obj1.exer1.model.Produto;

public class ProdutoController {
    public static void main(String[] args) {
        System.out.println("\n==== OBJETOS DA CLASSE FUNCIONARIO ====");
        //exer1c-i. Crie duas instâncias de cada classe utilizando um construtor padrão;
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();


         /*exer1c-ii Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de
        cada classe utilizando um construtor parametrizado por todos os atributos da classe
        de modelo;*/
        Produto produto3 = new Produto("Tablet", "Apple iPad Pro", 8000.0, 20);
        Produto produto4 = new Produto("Notebook", "Dell Inspiron", 3500.0, 100);

        /*exerc1c-iii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de
        cada classe utilizando uma variação do construtor parametrizado.*/
        Produto produto5 = new Produto("Notebook", "Dell Inspiron", 3500.0, 100);
        Produto produto6 = new Produto("Notebook", "Acer", 3900.0, 100);

        //exerc1c-iv. Imprima todos os objetos criados com os construtores utilizando o método toString();
        System.out.println("\n* INSTANCIA COM O CONSTRUTOR PADRAO DA CLASSE");
        System.out.println("Produto 1 " + produto1);
        System.out.println("Produto 2 " + produto2);
        System.out.println("\n* INSTANCIA COM O CONSTRUTOR PARAMETRIZADO DA CLASSE");
        System.out.println("Produto 3 " + produto3);
        System.out.println("Produto 4 " + produto4);
        System.out.println("Produto 5 " + produto5);
        System.out.println("Produto 6 " + produto6);

        //System.out.println("\nALTERANDO O ESTADO DO OBJETO(Métodos Setters e Getters)");
        //setters da classe produto
        produto1.setNome("Notebook");
        produto1.setDescricao("Dell Inspiron");
        produto1.setValor(3000.0);
        produto1.setEstoque(50);

        produto2.setNome("Smartphone");
        produto2.setDescricao("Samsung Galaxy S21");
        produto2.setValor(5000.0);
        produto2.setEstoque(15);

        produto3.setNome("Notebook");
        produto3.setDescricao("Dell Inspiron");
        produto3.setValor(3500.0);
        produto3.setEstoque(100);

        produto4.setNome("Notebook");
        produto4.setDescricao("Dell Latitude");
        produto4.setValor(5000.0);
        produto4.setEstoque(15);

        produto5.setNome("Notebook");
        produto5.setDescricao("Acer Aspire");
        produto5.setValor(3500.0);
        produto5.setEstoque(100);

        produto6.setNome("Notebook ");
        produto6.setDescricao("Acer Nitro");
        produto6.setValor(5000.0);
        produto6.setEstoque(15);

        /*exerc1c-vi. Imprima todos objetos novamente, só que agora, ao invés de utilizar o método
        toString(), utilize os método getters.*/
        System.out.println("\n-- IMPRIMINDO OS OBJETOS CRIADOS COM OS CONSTRUTORES UTILIZANDO OS METODOS GETTERS");
        //getters da classe produto
        System.out.println("Produto 1 => " + "Nome: " + produto1.getNome() + ", " + "Descrição: " + produto1.getDescricao() + ", " + "valor: " + produto1.getValor() + ", " + "estoque:" + produto1.getEstoque());
        System.out.println("Produto 2 => " + "Nome: " + produto2.getNome() + ", " + "Descrição: " + produto2.getDescricao() + ", " + "valor: " + produto2.getValor() + ", " + "estoque:" + produto2.getEstoque());
        System.out.println("Produto 3 => " + "Nome: " + produto3.getNome() + ", " + "Descrição: " + produto3.getDescricao() + ", " + "valor: " + produto3.getValor() + ", " + "estoque:" + produto3.getEstoque());
        System.out.println("Produto 4 => " + "Nome: " + produto4.getNome() + ", " + "Descrição: " + produto4.getDescricao() + ", " + "valor: " + produto4.getValor() + ", " + "estoque:" + produto4.getEstoque());
        System.out.println("Produto 5 => " + "Nome: " + produto5.getNome() + ", " + "Descrição: " + produto5.getDescricao() + ", " + "valor: " + produto5.getValor() + ", " + "estoque:" + produto5.getEstoque());
        System.out.println("Produto 6 => " + "Nome: " + produto6.getNome() + ", " + "Descrição: " + produto6.getDescricao() + ", " + "valor: " + produto6.getValor() + ", " + "estoque:" + produto6.getEstoque());







    }
}
