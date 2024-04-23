package obj2.exer2.model;

public class Modelo {
    private Integer id;
    private String descricao;

    public Modelo() {
    }

    public Modelo(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\nModelo{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
