public class Factorial {

    static int calculateFactorial(int number) {
        if(number < 0) {
            number = number *(-1);
        }

        int result = 1; //al ser un acumulador si ponemos 0 siempre va a valer 0 porque tiene que (number *acumulador) asi que empezamos con 1
        for (int i = number; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.err.println(calculateFactorial(5));
    }
}
