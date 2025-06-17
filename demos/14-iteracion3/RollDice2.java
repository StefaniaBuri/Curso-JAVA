import java.util.Random;
import java.util.Scanner;

/* Crea una función que simule el lanzamiento de un dado e imprime por consola el resultado cada vez que se ejecuta.
  - Aplicar while a repetirla */

public class RollDice2 {

   static void roll() {
      //creamos Random para generar un número del 1 al 6.
        Random random = new Random();

      //Scanner para preguntar al usuario si quiere seguir jugando.
        Scanner scanner = new Scanner(System.in);
        String answer = "s";

        while (answer.equalsIgnoreCase("s")) {
            int result = random.nextInt(6) + 1; // número entre 1 y 6
            System.out.println("Has lanzado el dado y salió: " + result);
            System.out.print("¿Quieres lanzar de nuevo? (s/n): ");
            answer = scanner.nextLine();
        }

        System.out.println("Juego terminado. ¡Gracias por jugar!");
        scanner.close();
    }


   public static void main(String[] args) {
      roll();
   }
}
