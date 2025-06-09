public class Functions {

    /*
     * Function: código ejecutable
     * Características:
     * - Puede devolver un valor
     * - Puede recibir valores y los guarda como parámetros
     * - Puedo invocarlo por su nombre
     */

    /*
     * Función sin devolver nada
     * static void add(int num1, int num2) {
     * // System.out.println("Hola soy una función");
     * int result = num1 + num2;
     * System.out.println("El resultado es: " + result);
     * }
     */

    // Función que devuelve algo
    static int add(int num1, int num2) {
        // System.out.println("Hola soy una función");
        int result = num1 + num2;
        return result;
    }

    static int subtraction(int num1, int num2) {
        int result2 = num1 - num2;
        return result2;
    }

    static void showResult(int result) {
        System.out.println("El resultado es: " + result);
    }

    public static void main(String[] args) {
        // Los argumentos son los valores que llegarán a los parámetros.
        int firstResult = add(5, 8);

        // System.out.println("El resultado de la suma es: " + add(8_690, firstResult));

        // System.out.println("El resultado de la resta es: " + subtraction(750, 456));

        showResult(firstResult);
        showResult(subtraction(589, 247));
    }
}
