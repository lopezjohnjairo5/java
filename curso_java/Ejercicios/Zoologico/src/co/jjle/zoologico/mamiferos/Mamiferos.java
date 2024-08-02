package co.jjle.zoologico.mamiferos;

abstract public class Mamiferos {
    private String habitat;
    private float altura;
    private float largo;
    private float peso;
    private String nombreCientifico;

    public Mamiferos(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    // metodos abstractos
    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();

}
