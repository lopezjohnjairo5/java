package co.jjle.zoologico.mamiferos.felinos;

import co.jjle.zoologico.mamiferos.Mamiferos;

public class Guepardo extends Felinos {

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamannoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamannoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo come solitario a diferencia de otros grandes felinos.";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme sobre una rama de un árbol";
    }

    @Override
    public String correr() {
        return "El guepardo corre a " + this.getVelocidad() + "k/h";
    }

    @Override
    public String comunicarse() {
        return "El guepardo ruge con poca potencia.";
    }
}
