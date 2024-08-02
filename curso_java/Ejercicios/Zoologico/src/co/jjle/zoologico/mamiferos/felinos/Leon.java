package co.jjle.zoologico.mamiferos.felinos;

import co.jjle.zoologico.mamiferos.Mamiferos;

public class Leon extends Felinos {
    private int numeroManada;
    private float potenciaRugido;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamannoGarras, int velocidad, int numeroManada, float potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, tamannoGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public float getPotenciaRugido() {
        return potenciaRugido;
    }

    @Override
    public String comer() {
        return "El león africano come con su manada compuesta de " + this.getNumeroManada() + " miembros.";
    }

    @Override
    public String dormir() {
        return "El león duerme placidamente hasta que un rugido de " + this.getPotenciaRugido() + " decibeles, se escucha a lo lejos";
    }

    @Override
    public String correr() {
        return "A pesar de su peso de " + this.getPeso() + " kilos, el león es bastante agil al cazar";
    }

    @Override
    public String comunicarse() {
        return "El león invoca a los miembros de su manada con un potente rugido de: " + this.getPotenciaRugido() +" decibeles, y entonces todos acuden al llamado";
    }
}
