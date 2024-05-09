package obj2Polimorfismo.lista1.model;

public class Peixe extends Animal{
    private double z=0.0;

    //1a forma de polimorfismo: a sobrecarga dos construtores permite a criação polimórfica de objetos

    public Peixe() {
    }

    //1a forma de polimorfismo: a sobrecarga dos construtores permite a criação polimórfica de objetos
    public Peixe(double x, double y, double z) {
        super(x, y); //construtor parametrizado da superclasse Animal
        this.z = z;
    }

    public void mover(double x, double y, double z) {
        System.out.println("moveu um peixe");
        this.x = x;
        this.y = y;
        this.z = z;

    }

    @Override
    public void mover(double x, double y) {
        System.out.println("\nmoveu um peixe");
        this.x = x;
        this.y = y;
    }

    @Override
    public void desenhar() {
        System.out.println("desenhou um peixe");
    }


    @Override
    public String toString() {
        return "\nPeixe{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                "} ";
    }
}
