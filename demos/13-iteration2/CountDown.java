public class CountDown {
   
   /* Crea una función que realice una cuenta atrás desde un número recibido por parámetros */

   static void countDownFrom(int number) {
        if (number < 0) {
            System.out.println("Introduce un número positivo");
            return;
        }

        while (number >= 0) {
            System.out.println(number);
            number--;
        }
    }

    public static void main(String[] args) {
        countDownFrom(15);
    }
}
