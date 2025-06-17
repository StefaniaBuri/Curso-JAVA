import java.util.Scanner;

public class AskUser {

    static void askContinue() {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true; // si el centinela es booleano se necesita un if para cambiar su condición

        while (wantContinue) {
             System.out.println("¿Quieres continuar (S/N)?");
             String answer = scanner.nextLine();
             if(answer.toLowerCase().equals("n") || answer.toLowerCase().equals("no")) {
                wantContinue = false;
             }
        }
        scanner.close();
        System.out.println("Gracias por todo");
        
    }

    static void ask() {
        Scanner scanner = new Scanner(System.in);
        String answer = "S"; // si el centinela es un string no hace falta tener una condición dentro

        while (!answer.toLowerCase().equals("n") && !answer.toLowerCase().equals("no")) 
        {
             System.out.println("¿Quieres continuar (S/N)?");
             answer = scanner.nextLine();
        }
        scanner.close();
        System.out.println("Gracias por todo"); 
    }
    
    public static void main(String[] args) {
       //askContinue();
       ask();
    }
}
