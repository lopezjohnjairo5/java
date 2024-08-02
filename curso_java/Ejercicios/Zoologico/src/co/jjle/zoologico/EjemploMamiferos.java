package co.jjle.zoologico;
import co.jjle.zoologico.mamiferos.*;
import co.jjle.zoologico.mamiferos.caninos.*;
import co.jjle.zoologico.mamiferos.felinos.*;
/*
* @author: JJL
* fecha: 2/08/2024
* */

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamiferos[] listadoMamiferos = new Mamiferos[5];

        Lobo lobo1 = new Lobo("bosque denso",130,150,50,"canis lupus","gris",10,10,"mamifero placentario");
        Perro perro1 = new Perro("llanura africana", 150,160,60,"Lycaon pictus","amarillo",13,7);
        Guepardo guepardo1 = new Guepardo("llanura africana",150,165,60,"Acinonyx jubatus",15,30);
        Leon leon1 = new Leon("llanura africana",130,145,60,"Panthera leo",25,17,5,20);
        Tigre tigre1 = new Tigre("nepal", 150,170,80,"Panthera tigris",35,20,"tigre de bengala real");

        listadoMamiferos[0] = lobo1;
        listadoMamiferos[1] = perro1;
        listadoMamiferos[2] = guepardo1;
        listadoMamiferos[3] = leon1;
        listadoMamiferos[4] = tigre1;

        printInfoAnimals(listadoMamiferos); // imprimiendo la info de los animales

    }

    public static void printInfoAnimals(Mamiferos[] listado){
        for (Mamiferos m: listado){

            System.out.println("El animal es una instancia de la clase " + m.getClass());

            if (m instanceof Felinos){
                System.out.println("Tamanno garras: " + ((Felinos) m).getTamannoGarras());
                System.out.println("Velocidad: " + ((Felinos) m).getVelocidad());
            }

            if (m instanceof Caninos){
                System.out.println("Color: " + ((Caninos) m).getTamannoColmillos());
                System.out.println("Tamanno colmillos: "+ ((Caninos) m).getTamannoColmillos());
            }

            System.out.println("Habitat: " + m.getHabitat());
            System.out.println("Altura: " + m.getAltura());
            System.out.println("Largo: " + m.getLargo());
            System.out.println("peso: " + m.getPeso());

            System.out.println(m.comer());
            System.out.println(m.dormir());
            System.out.println(m.correr());
            System.out.println(m.comunicarse());
            System.out.println("\n-----------------------------------------------\n");
        }
    }
}