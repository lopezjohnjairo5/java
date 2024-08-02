package co.jjle.zoologico.mamiferos.caninos;

import co.jjle.zoologico.mamiferos.Mamiferos;

public class Lobo extends Caninos {
    private int numeroCamada;
    private String especie;

    public Lobo(String habitad, float altura, float largo, float peso, String nombreCientifico, String color, float tamannoColmillos, int numeroCamada, String especie) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamannoColmillos);
        this.numeroCamada = numeroCamada;
        this.especie = especie;
    }

    public int getNumeroCamada() {
        return numeroCamada;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String comer() {
        return "EL lobo reparte la comida con sus "+ getNumeroCamada() + " compañeros.";
    }

    @Override
    public String dormir() {
        return "Al dormir el lobo permanece con sus "+ getNumeroCamada() + " compañeros.";
    }

    @Override
    public String correr() {
        return "A pesar de que el lobo pertenece a la especie " + this.getEspecie() + " llega a ser tan agil y rapido que seria dificil escapar de el.";
    }

    @Override
    public String comunicarse() {
        return "Al comunicarse, el lobo prefiere aullar en comparación a otros mamiferos.";
    }
}
