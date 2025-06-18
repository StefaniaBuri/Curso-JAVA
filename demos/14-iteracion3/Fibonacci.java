import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    /* La serie de Fibonacci es un problema matemático que realiza la suma de los dos números anteriores para generar el siguiente. 
    Crea una función que imprima por consola la serie de Fibonacci hasta un número introducido por el usuario. 
    El usuario debe ser preguntado por este número al iniciar la aplicación. */
    // scanner, y algoritmo. los primero le doy,


    //revisar el codigo

    static int askNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número para calcular la serie");
        int number = scanner.nextInt();
        System.out.println("");
        scanner.close();
        
        return number;
    }

    //OPTION 2
    static int getFibonacci(int limit) {
        if (limit <= 1) {
            return limit;
        }

        int a = 0, b = 1, temp;
        for (int i = 1; i <= limit; i++) {
            temp = a + b;
            a = b;
            b = temp; 
        }
        return b;
    }

    static void showInfo(int limit) {
      System.out.printf("La sucesión de Fibonacci (hasta %s):\n", limit );
      int result = getFibonacci(limit);
      
        System.out.println(result);
    }
    

    //Solución profe
    static List<Integer> calculateFibonacci(int limit) {
        //creamos dos variables que son el inicio para calcular la serie
        int prev = 0, next = 1;

        //
        List<Integer> serie = new ArrayList<>(); //creamos la lista que debe retornar
        while (prev <= limit) {
            serie.add(prev);
            /* int temp = prev + next;
            prev = next;
            next = temp; */

            next = next + prev;
            prev = next - prev;
        }
        return serie;
    }

    static void showFibonacci(int limit, List<Integer> serie) {
       String message = "La sucesión de Fibonacci (hasta %s):\n";
       System.out.printf(message,limit);
       for (int item : serie) {
        System.out.println(item);
       }
    }

    static int askLimit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número para calcular la serie");
        int limit = scanner.nextInt();
        System.out.println("");
        scanner.close();

        return limit;
    }

    static void askContinue() {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        while (wantContinue) {
            int limit = askLimit();
        }
        scanner.close();
        System.out.println("Gracias por todo"); 
    }


    public static void main(String[] args) {
        //askContinue();
        //showFibonacci();

        //getFibonacci(askNumber());
        showInfo(askNumber());
    }
}
