import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {


    private static int getNumberByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el número que he pensado del 1 al 10");
        int num = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return num;
    }

    

    // OPTION 1
    static void rollDice() {
        Random randomCreator = new Random();
        int random2 = randomCreator.nextInt(9)+1;

        if(getNumberByScanner() == random2) {
            System.out.println("Has adivinado el número ES: "+ getNumberByScanner());
        } else {
            System.out.println("Inténtalo otra vez, el numero era: "+ random2);
        }
    }

    //OPTION 2

    private static void guessRoll(int random) {
        int userNum = getNumberByScanner();
        String message = (userNum == random) 
        ? "Muy bien, acertaste con el "+ userNum 
        : "Fallaste, el número era el: " + random;
        System.out.println(message);
    }

    public static void main(String[] args) {
        //double random = Math.random();
        //System.out.println(random);
        
        //rollDice();

        Random randomCreator = new Random();
        int random = randomCreator.nextInt(9)+1;
        guessRoll(random);
    }
}
