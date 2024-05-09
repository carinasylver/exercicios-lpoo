package obj2Polimorfismo.lista1.model;

public class Cachorro extends Animal{

    //1a forma de polimorfismo: sobrecarga dos construtores permite a criação polimórfica de objetos
    public Cachorro() {
    }

    //1a forma de polimorfismo: sobrecarga dos construtores permite a criação polimórfica de objetos
    public Cachorro(double x, double y) {
        super(x, y);
    }

    @Override
    public void mover(double x, double y) {
        System.out.println("\nmoveu cachorro");
        this.x = x;
        this.y = y;
    }

    @Override
    public void desenhar() {
        System.out.println("desenhou cachorro");
    }

    @Override
    public String toString() {
        return "\nCachorro{" +
                "x=" + x +
                ", y=" + y +
                "} ";
    }
}
