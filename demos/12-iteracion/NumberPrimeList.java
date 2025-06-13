import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberPrimeList {
    static int getNumByScanner() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número para darte un la lista de sus primos");
        int num1 = scanner.nextInt();
        scanner.close();
        return num1;
    }

    static void showPrime(int number) {
        for (int index = 1; index < number; index++) {
            if(NumberPrime.isPrime(index)) {
                System.out.println(index);
            }
        }
    }

    static List<Integer> calculatePrime(int number) {
        List<Integer> result = new ArrayList<Integer>();
        for (int index = 1; index < number; index++) {
            if(NumberPrime.isPrime(index)) {
                result.add(index);
            }
        }
        return result;
    }

    /* static void showInfo(int number) {
        if(showPrime(number) != 0) {
            System.out.println(number);
        }
        

    } */

    public static void main(String[] args) {
        
    }
}
