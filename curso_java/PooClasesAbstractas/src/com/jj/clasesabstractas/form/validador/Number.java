package com.jj.clasesabstractas.form.validador;

public class Number extends Validador{
    protected String msn = "El valor debe ser numerico";
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
        try {
            Integer.parseInt(valor);
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
