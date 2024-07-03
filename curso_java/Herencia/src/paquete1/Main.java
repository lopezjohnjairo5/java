package paquete1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * SObre herencia:
        *
        * - para heredar se hace uso de la palabra clave "extends", ej: public class hijo extends padre{}
        * - si una clase, atributo o metodo se marca como final no será accesible fuera de la misma clase, atributo o metodo,
        *   por lo cual una clase marcada como final NO ES HEREDABLE.
        * - los atributos y/o metodos marcados como protected son accesibles al heredar, siempre y cuando se llamen o invoquen
        *   desde el interior del mismo PAQUETE, es por esto que al intentar acceder de un paquete a otro, se puede
        *   heredar, pero, no se puede acceder directamente al atributo o metodo marcado como protected.
        * - la palabra super se utiliza para acceder desde el hijo a los metodos del padre, si se usa solo "super()" se
        *   estará llamando al constructor del padre. Ej: super(); // llama al constructor ;; super.metodo1(params); // llama al metodo1 del padre
        * - Cuando se requiera llamar al constructor del padre, se hace uso de super dentro del constructor del hijo
        *   y debe ser lo primero que se haga dentro de este constructor o arrojará error.
        * - "this" tiene un funcionamiento similar a "super", la diferencia radica en que this hace referencia a la clase actual y super a la clase padre. Ej:
        *   this(); // invoca al constructor de la clase actual ;; this.atributo; // llama al "atributo" de la clase actual
        *   super(); // invoca al constructor de la clase padre ;; super.atributo; // llama al "atributo" de la clase padre
        * - Al trabajar con herencia, se recomienda que los elementos tengan una relacion coherente entre si antes de incluir la herencia
        * - En JAVA existe la Herencia simple, NO EXISTE EN SI LA HERENCIA MULTIPLE.
        * - En JAVA existen 2 formas de trabajar con herencia:
        *   - herencia general = se trata de generar herencia a partir de elementos en comun, basicamente si
        *                       varias clases tienen atributos o metodos comunes (aunque no tengan relacion entre si),
        *                       se puede crear una clase que tenga los elementos generales o comunes para asi ahorrar codigo
        *   - herencia relacionada = se trata de herencia por relacion, es cuando los elementos cuentan con una relacion estrecha entre ellos,
        *                       por ejemplo padre = persona, hijo = alumno, docente, profesional, etc...
        *
        * */
        String[] materias1 = {"ingles","español"};
        String[] horarios1 = {"mañana", "tarde"};
        Alumno alumno1 = new Alumno("laura", "martinez","laumar@gmail.com",17,"3013243321","politecnico","10a");
        Alumno alumno2 = new Alumno("carlos", "gonzales","cargo@gmail.com",12,"3023243123","ifescol","7b");
        Alumno alumno3 = new Alumno("maria", "ricaurte","mari@gmail.com",13,"3115433232","reyes patria","8c");
        Docente docente1 = new Docente("pepe", "lópez","pelo@gmail.com",23,"3123250232",materias1, horarios1);

        // accediendo al atributo protected de Persona
        System.out.println("persona1.accesoEnPaquete = "+ alumno1.accesoEnPaquete); // si lo permite ya que esta en el mismo paquete
        System.out.println("alumno1 = " + alumno1);
        System.out.println("alumno2 = " + alumno2);
        System.out.println("alumno3 = " + alumno3);
        System.out.println("docente1 = " + docente1);
    }
}