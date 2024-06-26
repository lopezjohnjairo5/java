/*
*     ROJO("Rojo"), ROJO es la constante ("Rojo") el argumento que se pasa por la variable color
* */

public enum Colores {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    VERDE("Azul"),
    GRIS("Gris"),
    BLANCO("Blanco"),
    AZUL("Azul");

    private final String color;

    Colores(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
