package co.jjle.calculadora;

public class Calculadora {

    // sobrecarga con int

    public int suma(int a, int b){
        // metodo que suma 2 valores enteros
        return a + b;
    }

    public int suma(int... values){
        // metodo que suma N valores enteros
        /*
        * los (...) se llaman varargs y permiten pasar de 0 a N argumentos
        * es basicamente un array y se trata como tal mediante un for,
        * sin embargo al invocar el metodo NO se pasan los parametros
        * como array, se pasan como argumentos individuales.
        *
        * NOTA: el metodo que tiene (...) varargs, debe ser puesto como ultimo argumento.
        * EJ:
        * public float suma(String msn, int arg1, float... argsN){}
        * */
        int total = 0;

        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }

    // sobrecarga con float

    public float suma(float a, float b){
        // metodo que suma 2 valores float
        return a + b;
    }

    public float suma(float... values){
        // metodo que suma N valores float
        float total = 0.0f;

        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }

    // sobrecarga con double

    public double suma(double a, double b){
        // metodo que suma 2 valores double
        return a + b;
    }

    public double suma(double... values){
        // metodo que suma N valores double
        double total = 0.0;

        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }

    // sobrecarga con string - char

    public int suma(String a, String b){
        // metodo que suma 2 valores incluidos en un array de string
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public float suma(char... values){
        // metodo que suma N valores incluidos en un array de string y los retorna como float
        float total = 0.0f;

        for (int i = 0; i < values.length; i++) {
            total += (float) values[i];
        }
        return total;
    }

}
