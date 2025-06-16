import java.util.Scanner;

public class NumberPrime {

    static int getNumByScanner(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int num1 = scanner.nextInt();
        scanner.close();
        return num1;
    }

    public static boolean isPrime(int number) {
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                return false; // No es primo porque el resto es 0
            }
        }
        return true; // es primo
    }

    static boolean isPrime2(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }


    static void showInfo(int number) {
        // int number = getNumByScanner();
        String result = isPrime2(number) ? "%s es primo" : "%s no es primo";
        System.out.printf(result, number);

    }

    public static void main(String[] args) {
        String message = "Dime un número para ver si es primo: ";
        showInfo(getNumByScanner(message));
    }
}
