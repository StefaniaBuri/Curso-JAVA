import java.util.Scanner;

public class NumberPrime {

    static int getNumByScanner() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número para ver si es primo: ");
        int num1 = scanner.nextInt();
        scanner.close();
        return num1;
    }

    public static boolean isPrime(int number) {
        for (int index = 1; index < number; index++) {
            if(number % index == 0) {
                return false; //No es primo porque el resto es 0
            }
        }
        return true; // es primo
    }

    static void showInfo() {
        int number = getNumByScanner();
        String result = isPrime(number) ? "%s es primo" : "%s no es primo";
        System.out.printf(result, number);

    }

    public static void main(String[] args) {
        showInfo();
    }
}
