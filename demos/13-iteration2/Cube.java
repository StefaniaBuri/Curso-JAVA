public class Cube {

   /* Crea una función que imprima por consola el resultado de elevar al cubo un número dado como parámetro. */

   static void printCube(int number) {
        int result = number * number * number;
        System.out.printf("El número %s elevado al cubo es: %s",number, result);
    }

    public static void main(String[] args) {
        printCube(5);
    }
}
