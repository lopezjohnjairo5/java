package co.jjle.zoologico.mamiferos.caninos;

import co.jjle.zoologico.mamiferos.Mamiferos;

public class Perro extends Caninos {
    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamannoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamannoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro africano come haciendo uso de los " + this.getFuerzaMordida() + " FM y de los " + this.getTamannoColmillos() + " cms de largo que tienen sus colmillos.";
    }

    @Override
    public String dormir() {
        return "El perro africano rie mientras duerme.";
    }

    @Override
    public String correr() {
        return "A pesar de no ser tan veloz como el guepardo. El perro africano sabe moverse por " + this.getHabitat();
    }

    @Override
    public String comunicarse() {
        return "El color " + this.getColor() + " es uno de los factores a tener presentes en la manada además de los impresionantes " + this.getTamannoColmillos() + " cms de colmillos con los que cuenta y que son visibles al comunicarse con su manada.";
    }
}
