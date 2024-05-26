import java.util.Scanner;

/*
* Creado por JJL
* 25/05/2024
* */
public class Main {
    public static void main(String[] args) {
        Double[] notasAlumno = new Double[20];
        Scanner scaner = new Scanner(System.in);

        String instrucciones = "A continuacion podrá ingresar 20 notas para el alumno (NOTAS DEL 1 al 7) y el programa calculará el promedio";
        instrucciones.concat("de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1,");
        instrucciones.concat("ademas mostrar el promedio total.");

        System.out.println(instrucciones);

        try{
            for (int i = 0; i < 20; i++) {
                System.out.print("Ingrese una nota: ");
                notasAlumno[i] = scaner.nextDouble();
                if (notasAlumno[i] == 0 || notasAlumno[i] > 7){
                    throw new Exception();
                }
            }

        } catch (Exception e) {
            System.out.println("Solo se admiten valores numericos con decimales mayores a cero y menores o iguales a 7.");
            System.exit(0);
        }

        // llamando a funcion | metodo encargado de obtener los promedios
        obtenerPromedioValores(notasAlumno);
    }


    public static void obtenerPromedioValores (Double[] arrayNotas){
        int cantidadNotasMayoresA5 = 0, cantidadNotasInferioresA4 = 0, cantidadDeUnos = 0 ;
        double sumatoriaNotasMayoresA5 = 0.0, sumatoriaNotasInferioresA4 = 0.0, sumatoria = 0.0;
        double promedioNotasMayoresA5 = 0.0, promedioNotasInferioresA4 = 0.0, promedioTotal = 0.0;

        for (double nota: arrayNotas){
        //for (int i = 0; i < arrayNotas.length; i++) {
            if ( nota > 5) {
                cantidadNotasMayoresA5++;
                sumatoriaNotasMayoresA5 += nota;
            }
            if (nota < 4) {
                cantidadNotasInferioresA4++;
                sumatoriaNotasInferioresA4 += nota;
            }
            if (nota == 1) {
                cantidadDeUnos++;
            }
            sumatoria += nota;
        }
        promedioTotal = sumatoria / arrayNotas.length;
        promedioNotasMayoresA5 = sumatoriaNotasMayoresA5 / cantidadNotasMayoresA5;
        promedioNotasInferioresA4 = sumatoriaNotasInferioresA4 / cantidadNotasInferioresA4;

        System.out.println("El promedio total de las 20 notas ingresadas es: " + promedioTotal);
        System.out.println("El promedio de las " + cantidadNotasMayoresA5 + " notas mayores a 5 ingresadas es: " + promedioNotasMayoresA5);
        System.out.println("El promedio de las " + cantidadNotasInferioresA4 + " notas menores a 4 ingresadas  es: " + promedioNotasInferioresA4);
        System.out.println("La cantidad de 1nos (UNOS) introducidos es: " + cantidadDeUnos);
    }

}