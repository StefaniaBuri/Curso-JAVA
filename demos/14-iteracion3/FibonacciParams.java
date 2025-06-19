import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FibonacciParams {

    static List<Integer> calculateFibonacci(int limit) {
        //creamos dos variables que son el inicio para calcular la serie
        int prev = 0, next = 1;
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
        String message = "Introduce un número para calcular la serie de Fibonacci";
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int limit = scanner.nextInt();
    
        //scanner.close();
        return limit;
    }

    static void askContinue() {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        String[] messages = {
                "¿Quieres continuar (S/N)?",
                "Gracias por todo"
        };

        while (wantContinue) {
            int limit = askLimit();
            List<Integer> serie =  calculateFibonacci(limit);
            showFibonacci(limit, serie);
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
         askContinue();
    }
}
