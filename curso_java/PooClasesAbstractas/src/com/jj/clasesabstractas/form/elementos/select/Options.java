package com.jj.clasesabstractas.form.elementos.select;

public class Options {
    private String valor;
    private String nombre;
    private boolean selected;


    // constructors

    public Options() {
    }

    public Options(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    // getters and setters


    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
