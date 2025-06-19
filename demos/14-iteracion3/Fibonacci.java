import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    /* La serie de Fibonacci es un problema matemático que realiza la suma de los dos números anteriores para generar el siguiente. 
    Crea una función que imprima por consola la serie de Fibonacci hasta un número introducido por el usuario. 
    El usuario debe ser preguntado por este número al iniciar la aplicación. */
    // scanner, y algoritmo. los primero le doy,

    private static List<Integer> serie;
    private static int limit;

    /* static int askNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número para calcular la serie");
        int number = scanner.nextInt();
        System.out.println("");
        scanner.close();
        
        return number;
    } */

    //OPTION
    /* static int getFibonacci(int limit) {
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
    } */
    

    // Solucion profe

    private static void calculateFibonacci() {

        int prev = 0, next = 1;
        Fibonacci.serie = new ArrayList<>();

        while (prev <= Fibonacci.limit) {
            Fibonacci.serie.add(prev);
            // int temp = prev + next;
            // prev = next;
            // next = temp;
            next = next + prev;
            prev = next - prev;
        }
    }

    private static void showFibonacci() {
        String message = "Sucesión de Fibonacci (hasta %s):\n";
        System.out.printf(message, Fibonacci.limit);
        for (int item : Fibonacci.serie) {
            System.out.println(item);
        }
    }

    private static void askLimit() {
        String message = "Indica el valor límite para tu serie de Fibonacci";
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        Fibonacci.limit = scanner.nextInt();
        // scanner.close();
    }

    private static void askContinue() {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        String[] messages = {
                "¿Quieres continuar (S/N)?",
                "Gracias por todo"
        };

        while (wantContinue) {
            askLimit();
            calculateFibonacci();
            showFibonacci();
            System.out.println(messages[0]);
            String answer = scanner.nextLine();
            if (answer.toLowerCase().equals("n") ||
                    answer.toLowerCase().equals("no")) {
                wantContinue = false;
            }
        }

        scanner.close();
        System.out.println(messages[1]);
    }

    public static void main(String[] args) {
        //showFibonacci();
        //getFibonacci(askNumber());
        //showInfo(askNumber());

        askContinue();
    }
}
