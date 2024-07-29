package com.jj.clasesabstractas.form.validador;

public class Len extends Validador{
    protected String msn = "El campo debe tener entre %d y %d caracteres de longitud";
    private int min;
    private int max = 12;

    // constructor
    public Len(int min, int max) {
        this.min = min;
        this.max = max;
    }

    // metodos obligatorios por la clase abstracta padre
    @Override
    public String getMsn() {
        return this.msn;
    }

    @Override
    public void setMsn(String msn) {
        this.msn = msn;
    }

    @Override
    public boolean isValid(String valor) {
        // agregando los valores para minimo y maximo al string
        this.msn = String.format(this.msn, this.min, this.max);

        if(valor == null){
            return true;
        }

        if(valor.length() >= this.min && valor.length() <= this.max){
            return true;
        }
        return false;
    }
}
