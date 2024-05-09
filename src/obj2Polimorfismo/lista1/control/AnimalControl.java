package obj2Polimorfismo.lista1.control;

import java.util.ArrayList;
import java.util.List;

import obj2Polimorfismo.lista1.model.Animal;
import obj2Polimorfismo.lista1.model.Cachorro;
import obj2Polimorfismo.lista1.model.Passaro;
import obj2Polimorfismo.lista1.model.Peixe;

import java.util.ArrayList;

public class AnimalControl {
    public static void main(String[] args) {

        /*1.a) Crie três instâncias de cada classe do diagrama (das possíveis) com valores válidos para
        os seus atributos. Insira-os em uma coleção do tipo List e os imprima*/

        //1 forma de se fazer polimorfismo: sobrecarga dos construtores
       Peixe peixe1 = new Peixe(1,1,1);
       Peixe peixe2 = new Peixe(2, 2, 2);
       Peixe peixe3 = new Peixe(3, 3, 3);

       Cachorro cachorro1 = new Cachorro(4,4);
       Cachorro cachorro2 = new Cachorro(5, 5);
       Cachorro cachorro3 = new Cachorro(6, 6);

       Passaro passaro1 = new Passaro(7,7,7);
       Passaro passaro2 = new Passaro(8, 8, 8);
       Passaro passaro3 = new Passaro(9, 9, 9);


       //System.out.println(peixe2);

       List<Animal> animaisList = new ArrayList<>();
       animaisList.add(peixe1);
       animaisList.add(peixe2);
       animaisList.add(peixe3);

       animaisList.add(cachorro1);
       animaisList.add(cachorro2);
       animaisList.add(cachorro3);

       animaisList.add(passaro1);
       animaisList.add(passaro2);
       animaisList.add(passaro3);

       System.out.println("\nPosição inicial do animais");
       System.out.println(animaisList);

       /*1.b) Percorra a coleção e faça com que os personagens sejam posicionados nas coordenadas
        (2, 2), os desenhe, e imprima-os;*/
       animaisList.forEach(a -> {
           a.desenhar();//agindo poliformicamente
           if (a instanceof Peixe) {
               a.mover(2, 2);
           } else if (a instanceof Cachorro) {
               a.mover(2, 2);
           } else if (a instanceof Passaro) {
               a.mover(2, 2);
           }

       });
       /*c) Reposicione os personagens que pertençam a classe Cachorro, nas coordenadas (8, 8),
        os desenhe e imprima-os;*/
       animaisList.forEach(a -> {
           if (a instanceof Cachorro) {
               a.desenhar();
               a.mover(8, 8);
           }
       });

       /*d) Reposicione os personagens que pertençam as classes Peixe e Passaro, nas coordenadas
               (5, 5, 5), os desenhe e imprima-os*/
        animaisList.forEach(a -> {
            a.desenhar();
            if (a instanceof Peixe ) {
                ((Peixe) a).mover(5.0,5.0, 5.0);
            } else if (a instanceof Passaro) {
                ((Passaro) a).mover(5.0,5.0, 5.0);
            }
        });
        System.out.println("\nposição atual dos animais");
        System.out.println(animaisList);


    }
}
