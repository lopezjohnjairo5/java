package com.jj.clasesabstractas.form.validador;

public class Required extends Validador{
    protected String msn = "El campo es obligatorio";

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
        return (valor != null && valor.length() > 0);
    }
}
