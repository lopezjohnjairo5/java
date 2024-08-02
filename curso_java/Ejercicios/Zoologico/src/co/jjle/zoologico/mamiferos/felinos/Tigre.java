package co.jjle.zoologico.mamiferos.felinos;

import co.jjle.zoologico.mamiferos.Mamiferos;

public class Tigre extends Felinos {
    private String especie;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamannoGarras, int velocidad, String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, tamannoGarras, velocidad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String comer() {
        return "EL tigre de la especie " + this.getEspecie() + " caza en solitario.";
    }

    @Override
    public String dormir() {
        return "El tigre ronca como un pequeño minino.";
    }

    @Override
    public String correr() {
        return "El tigre corre con una velocidad de " + this.getVelocidad() + " k/h en la selva.";
    }

    @Override
    public String comunicarse() {
        return "EL tigre se comunica con toda su especie (" + this.getEspecie() + ") mediante fuertes rugidos.";
    }
}
