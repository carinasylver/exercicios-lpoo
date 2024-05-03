package obj2.lista2.exer2.model;

public class Automovel {
    private Integer id; //exer2.b Modifique as classes de modelo para que elas passem a conter mais um atributo, o
    //atributo de nome “id” (identificador);
    private String renavan;
    private String placa;
    private String cor;
    private Integer num_rodas;
    private String combustivel;
    private Integer quilometragem;
    private String chassi;
    private Double valor_locacao;

    public Automovel() {
    }

    public Automovel(Integer id, String renavan, String placa, String cor, Integer num_rodas, String combustivel, Integer quilometragem, String chassi, Double valor_locacao) {
        this.id = id;
        this.renavan = renavan;
        this.placa = placa;
        this.cor = cor;
        this.num_rodas = num_rodas;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.chassi = chassi;
        this.valor_locacao = valor_locacao;
    }

    public Integer getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Automovel{" +
                "id=" + id +
                ", renavan='" + renavan + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", num_rodas=" + num_rodas +
                ", combustivel='" + combustivel + '\'' +
                ", quilometragem=" + quilometragem +
                ", chassi='" + chassi + '\'' +
                ", valor_locacao=" + valor_locacao +
                '}';
    }


}
