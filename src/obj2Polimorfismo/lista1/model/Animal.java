package obj2Polimorfismo.lista1.model;

public abstract class Animal {
    protected double x=0.0;
    protected double y=0.0;

    //1a forma de polimorfismo: a sobrecarga dos construtores permite a criação polimórfica de objetos
    public Animal() {
    }
    //1a forma de polimorfismo : a sobrecarga dos construtores permite a criação polimórfica de objetos
    public Animal(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //comportamento mover
    public void mover(double x, double y){
        this.x = x;
        this.y = y;
    }

//    public void mover(double x, double y, double z){
//        this.x = x;
//        this.y = y;
//    }

    public abstract void desenhar();

    /*sobrescreve o comportamento da superclasse object*/
    @Override
    public String toString() {
        return "Animal{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
