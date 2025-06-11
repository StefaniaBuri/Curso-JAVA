public class App {

    public static void main(String[] args) {
        /*
         * int[] numbers = {1, 2, 3, 4, 5};
         * System.out.println(numbers.length);
         * System.out.println(numbers[0]);
         * System.out.println(numbers[3]);
         */
        /*
         * String first = args[0]; //devuelve el primer string que hemos escrito en la
         * terminal
         * String second = args[1];
         * System.out.println(args.length); // devuelve el num de string que hemos
         * metido por terminal
         * System.out.println(first); //imprime string
         * System.err.println(second);
         */

        // Conversion de String
        int num1 = Integer.valueOf(args[0]);
        int num2 = Integer.valueOf(args[1]);

        // System.out.println(num1);
        // System.out.println(num2);
        // Double.parseDouble(args[1]);
        // Boolean.parseBoolean(args[2]);

        int result = Calculator.multiply(num1, num2);
        Calculator.showResult("Multiplicación", result);

    }
}
