public class Factorial {

    static long calculateFactorial(long number) {
        if(number < 0) {
            number = number *(-1);
        }

        //cuando vamos a sumar se inicializa a 0, como multiplicamos inicializamos a 1
        long result = 1; //al ser un acumulador si ponemos 0 siempre va a valer 0 porque tiene que (number *acumulador) asi que empezamos con 1
        for (long i = number; i > 0; i--) {
            result = result * i;
        }
        return result;

    }
    //factorial es: n! = n * (n-1)
    //Programación recursiva: función que se llama a si misma. es un bucle infinito, hay que poner una condición de parada
    static long recursiveFactorial(long number) {
        if(number == 1) { //cuando llegue a uno ya no calculara el factorial de 0
            return number;
        }
        long result = number * recursiveFactorial(number -1);
        return result;
    }

    public static void main(String[] args) {
        //System.err.println(calculateFactorial(50));
        System.out.println(recursiveFactorial(10));
    }
}
