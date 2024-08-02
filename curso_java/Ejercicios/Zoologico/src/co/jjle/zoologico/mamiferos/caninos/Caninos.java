package co.jjle.zoologico.mamiferos.caninos;

import co.jjle.zoologico.mamiferos.Mamiferos;

abstract public class Caninos extends Mamiferos {
    private String color;
    private float tamannoColmillos;

    public Caninos(String habitad, float altura, float largo, float peso, String nombreCientifico, String color, float tamannoColmillos) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamannoColmillos = tamannoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamannoColmillos() {
        return tamannoColmillos;
    }
}
