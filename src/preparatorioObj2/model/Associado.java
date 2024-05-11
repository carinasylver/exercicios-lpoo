package preparatorioObj2.model;

//Declarar métodos abstratos: Interfaces podem conter apenas métodos abstratos, ou seja, sem implementação.
public interface Associado {
    //os metodos em um interface sao publicos e abstratos por natureza

    /*double lucros(int qdeCotas, double valorCota);
    //nao pode ser double pq métodos abstratos não possuem implementação (corpo do método)
    // eles apenas declaram a assinatura do método, deixando a implementação
    por conta das classes que implementam a interface.*/

    void lucros(int qdeCotas, double valorCota);

}
