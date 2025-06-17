import java.util.ArrayList;
import java.util.List;

public class NumberPrimeList {

    // OPTION 2
    static void showPrimes(List<Integer> numbers) {
        /* for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        } */
       for(int number : numbers) {
        System.out.println(number);
       }
    }


    //OPTION 2
    static List<Integer> calculatePrimes2(int number) {
        List<Integer> result = new ArrayList<>();
        for (int index = 1; index < number; index++) {
            if (NumberPrime.isPrime(index)) {
                result.add(index);
            }
        }
        return result;
    }


     /* static List<Integer> calculatePrime(int number) {
        List<Integer> result = new ArrayList<>();
        for (int index = 2; index <= number; index++) {
            if (NumberPrime.isPrime2(index)) {
                result.add(index);
            }
        }
        return result;
    } */
   

    public static void main(String[] args) {
        String message = "Dime un número para darte un la lista de sus primos";
        int number = NumberPrime.getNumByScanner(message);

        //List<Integer> numbers = calculatePrime(number);
        List<Integer> numbers = calculatePrimes2(number); //OPTION 2
        //System.out.println("Lista de números primos hasta " + number + ":" + numbers);
        showPrimes(numbers); //OPTION 2
    
    }
}
