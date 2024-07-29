package com.jj.clasesabstractas.form.validador;

public class Null extends Validador{
    protected String msn = "El campo no puede ser nulo";

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
        return (valor != null);
    }
}
