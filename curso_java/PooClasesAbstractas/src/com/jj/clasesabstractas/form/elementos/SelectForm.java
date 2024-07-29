package com.jj.clasesabstractas.form.elementos;
import com.jj.clasesabstractas.form.elementos.select.Options;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{
    private List<Options> options;

    // constructors

    public SelectForm(String nombre) {
        super(nombre);
        this.options = new ArrayList<Options>();
    }

    public SelectForm(String nombre, List<Options> options) {
        super(nombre);
        this.options = options;
    }

    // methods

    // se usa como retorno el mismo nombre de la clase para que al invocar el metodo se pueda encadenar con punto(.)
    public SelectForm addOption(Options opcion){
        this.options.add(opcion);
        return this;
    }
    @Override
    public String printHtml(){
       StringBuilder sb = new StringBuilder("<select ");
       sb.append("name = '" + this.nombre + "'>\n");
       for (Options option : this.options){
           sb.append("<option id='' value ='");
           sb.append(option.getValor());
           sb.append("'");
           if (option.isSelected()){
               sb.append(" selected");
           }
           sb.append(">");
           sb.append(option.getNombre());
           sb.append("</option>\n");
       }
       sb.append(" </select>");

        return sb.toString();
    }
}
