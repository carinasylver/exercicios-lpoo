package obj2Polimorfismo.lista1.model;

public class Passaro extends Animal{
    private double z=0.0;


    //1a forma de polimorfismo: sobrecarga dos construtores permite a criação polimórfica de objetos
    public Passaro() {
    }

    //1a forma de polimorfismo: sobrecarga dos construtores permite a criação polimórfica de objetos
    public Passaro(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void mover(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;

    }

    @Override
    public void mover(double x, double y) {
        System.out.println("\nmoveu passaro");
        this.x = x;
        this.y = y;
    }

    @Override
    public void desenhar() {
        System.out.println("desenhou passaro");
    }

    @Override
    public String toString() {
        return "\nPassaro{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                "} ";
    }
}
