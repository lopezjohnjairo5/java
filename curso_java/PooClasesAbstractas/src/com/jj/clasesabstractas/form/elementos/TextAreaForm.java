package com.jj.clasesabstractas.form.elementos;

public class TextAreaForm extends ElementoForm{
    private int filas = 30;
    private int columnas = 30;

    // constructors

    public TextAreaForm(String nombre) {
        super(nombre);
    }

    public TextAreaForm(String nombre, int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    // getters and setters

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public String printHtml() {
        return "<textarea name='"+ this.nombre +
                "' rows='" + this.filas
                + "' cols='" + this.columnas
                + "' ></textarea>";
    }
}
