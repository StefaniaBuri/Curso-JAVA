import java.util.Scanner;

public class Calculadora {

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    static int division(int num1, int num2) {
        return num1 / num2;
    }

    /*
     * OPTION 1
     * static void showResult(int number1, int number2) {
     * System.out.println(" La suma es " + add(number1, number2)
     * + " \n La resta es:  " + subtraction(number1, number2)
     * + "\n La multiplicación es:  " + multiply(number1, number2)
     * + " \n La división es: " + division(number1, number2));
     * }
     */


    // OPTION 2
    static void showResult(String operation, int result) {
        System.out.printf("El resultado de la %s es %s", operation, result);
        System.out.println("");
    }


    public static void main(String[] args) {

        // Declaramos los dos números
        int number1;
        int number2;

        // Creamos el objeto scanner
        Scanner scanner = new Scanner(System.in);

        // Pedimos los números por la consola
        System.out.println("Introduce number one");

        // Guardamos el primer numero en una variable
        number1 = scanner.nextInt();

        // Pedimos por consola el segundo numero
        System.out.println("Introduce number two");

        // Guardamos el segundo numero por consola
        number2 = scanner.nextInt();

        // Cerramos scanner porque no vamos a pedir mas info
        scanner.close();


        // Imprimo resultado llamando a una función
        System.out.printf("Operaciones con %s y %s \n", number1, number2);
        showResult("Suma: ", add(number1, number2));
        showResult("Resta: ", subtraction(number1, number2));
        showResult("Multiplicación", multiply(number1, number2));
        showResult("División", division(number1, number2));

    }
}
