package co.jjle.zoologico.mamiferos.felinos;

import co.jjle.zoologico.mamiferos.Mamiferos;

abstract public class Felinos extends Mamiferos {
    private float tamannoGarras;
    private int velocidad;

    public Felinos(String habitad, float altura, float largo, float peso, String nombreCientifico, float tamannoGarras, int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.tamannoGarras = tamannoGarras;
        this.velocidad = velocidad;
    }

    public float getTamannoGarras() {
        return tamannoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
