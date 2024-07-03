import co.jjle.calculadora.*; // importamos el contenido completo del paquete
/*
* @author JJLE
* 01/07/2024
* */
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        // variables de diferentes tipos para invocar la sobrecarga
        int num1 = 10;
        int num2 = 20;
        int[] arrayInt = {1,2,3,4,5,6,7,8,9};
        float num3 = 10.0f;
        float num4 = 20.0f;
        float[] arrayFloat = {1.0f,2.0f,3.0f,4.0f,5.0f,6.0f,7.0f,8.0f,9.0f};
        double num5 = 10.0;
        double num6 = 20.0;
        double[] arrayDouble = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
        String num7 = "10";
        String num8 = "20";
        char[] arrayString = {'@','#','$','%','&','/','(',')','='};

        // valores sin metodos de sobrecarga pero que SI funcionan de forma automatica
        long num9 = 235L;
        long num10 = 25L;

        // invocando los metodos de sobrecarga
        System.out.println("suma int = " + calc.suma(num1, num2));
        System.out.println("suma float = " + calc.suma(num3, num4));
        System.out.println("suma double = " + calc.suma(num5, num6));
        System.out.println("suma String = " + calc.suma(num7, num8));
        System.out.println("suma int[] = " + calc.suma(arrayInt));
        System.out.println("suma float[] = " + calc.suma(arrayFloat));
        System.out.println("suma double[] = " + calc.suma(arrayDouble));
        System.out.println("suma char[] = " + calc.suma(arrayString));
        System.out.println("suma long (automaticamente coje el metodo FLOAT para operar.)= "+ calc.suma(num9, num10));

    }
}