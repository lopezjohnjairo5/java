//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // aritmeticos => multiplicacion(*), division(/), porcentaje(%), suma(+), resta(-)
        float suma, resta, multiplicacion, division, resto = 0.0f;
        suma = 5 + 3;
        resta = 3 - 9;
        multiplicacion = 24 * 19;
        division = 24.5f / 4.3f;
        resto = 33 % 3;

        System.out.println("\nsuma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("division = " + division);
        System.out.println("resto = " + resto);

        // aritmeticos combinados =>  *=, /=, +=, -=
        suma += 5;
        resta -= 3;
        multiplicacion *= 24;
        division /= 10.5f;
        resto %= 3;

        System.out.println("\n(comb)suma = " + suma);
        System.out.println("(comb)resta = " + resta);
        System.out.println("(comb)multiplicacion = " + multiplicacion);
        System.out.println("(comb)division = " + division);
        System.out.println("(comb)resto = " + resto);

        // relacionales => mayor que ( > ), menor que ( < ), mayor o igual que ( >= ), menor o igual que ( <= ), diferente ( != ), igual( == )
        boolean mayorQue, menorQue, mayorIgualQue, menorIgualQue, igualQue, diferente;
        mayorQue = suma > resta;
        menorQue = suma < resta;
        mayorIgualQue = multiplicacion >= division;
        menorIgualQue = multiplicacion <= division;
        igualQue = suma == resto;
        diferente = suma != resto;

        System.out.println("\nmayorQue (suma > resta) = " + mayorQue);
        System.out.println("menorQue (suma < resta) = " + menorQue);
        System.out.println("mayorIgualQue ( multiplicacion >= division ) = " + mayorIgualQue);
        System.out.println("menorIgualQue = ( multiplicacion <= division )" + menorIgualQue);
        System.out.println("igualQue ( suma == resto ) = " + igualQue);
        System.out.println("diferente ( suma != resto ) = " + diferente);

        // logicos => AND(&&), OR(||), XOR(^)retorna verdadero cuando son diferentes a nivel de bits, NOT(!)
        boolean operadorAnd, operadorOr, operadorXor, operadorNot;

        operadorAnd = mayorQue && menorQue;
        operadorOr = mayorIgualQue || menorIgualQue;
        operadorXor = mayorQue ^ mayorIgualQue;
        operadorNot = !menorQue;

        System.out.println("\noperadorAnd = " + operadorAnd);
        System.out.println("operadorOr = " + operadorOr);
        System.out.println("operadorXor = " + operadorXor);
        System.out.println("operadorNot = " + operadorNot);
        System.out.println("Los operadores logicos tienen un orden de ejecucion: primero se ejecutan los parentesis, luego los AND (&&), a continuacion los OR ");
        // incremento( ++ ), decremento( -- )
        int num = 0;
        System.out.println("\nnum (postincremento) = " + (num++));
        System.out.println("num (preincremento) = " + (++num));

        System.out.println("\nnum (postdecremento) = " + (num--));
        System.out.println("num (predecremento) = " + (--num));

        // operadores especiales => ternario (condicion ? valor si verdadero : valor si falso ;)

        // generamos valores aleatorios entre el 1 y el 10, se hace cast a (int) de lo contrario se requeriria un double
        int operador1 = (int)(Math.random() * 10 + 1), operador2 = (int)(Math.random() * 10 + 1);
        boolean resultado = operador1 == operador2 ? true : false;
        System.out.println("resultado del operador ternario entre " + operador1 +" == " + operador2 + " = " + resultado);
    }
}