public class Main {
    public static void main(String[] args) {
        float a=0.0f, b=0.0f, resultado=0.0f;
        String op;

        try{
            if (args.length != 3){
                throw new Exception();
            }

            a = Float.parseFloat(args[0]);
            op = args[1];
            b = Float.parseFloat(args[2]);

            switch (op){
                case "+":
                    resultado = a + b;
                    break;

                case "-":
                    resultado = a - b;
                    break;

                case "*":
                    resultado = a * b;
                    break;

                case "/":
                    resultado = a / b;
                    break;

                case "^":
                    resultado = (float)Math.pow(a,b);
                    break;

                default:
                    System.out.println("Operación incorrecta. Verifique e intente nuevamente.");
            }

            System.out.println("resultado = " + resultado);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Debe proporcionar una operacion valida. Ej: 12 * 3. No se admite: division por zero.");
            System.exit(0);
        }

        /*
        * resultado ejemplo:
        * - cd src
        * - javac Main.java
        * - java Main 3 * 4
        * >
        * */
    }
}