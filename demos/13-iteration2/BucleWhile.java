import java.util.Random;

public class BucleWhile {

    static void whileSample() {
         boolean sentinel = true;

        while (sentinel) {
            Random randomCreator = new Random();
            int number = randomCreator.nextInt(9);// el 9 es hasta que rango lo quieres generar
            
            if(number % 2 == 0) { // si encuentra un numero par, salta de esa linea y continua
                continue; // solo pintara los números impares
            }
            
            System.out.println("Número " + number);
            if(number == 7) {
                sentinel = false;
            }
        }
    }

    static void whileSampleWithCounter() {
        boolean sentinel = true;
        int i = 0;

        while (sentinel) {
            i++;
            Random randomCreator = new Random();
            int number = randomCreator.nextInt(9);
            
            if(number % 2 == 0) { // si encuentra un numero par, salta de esa linea y continua
                continue; // solo pintara los números impares
            }
            
            System.out.printf("Número %s = %s\n", i, number);
            if(number == 7) {
                sentinel = false;
            }
        }
    }

    static void forSample() {
        for (int index = 0; index >= 0; index++) {
            Random randomCreator = new Random();
            int number = randomCreator.nextInt(9);// el 9 es hasta que rango lo quieres generar
            
            if(number % 2 == 0) { // si encuentra un numero par, salta de esa linea y continua
                continue; // solo pintara los números impares
            }
            
            System.out.println("Número " + number);
            if(number == 7) {
                break;
            }
        }
    }

    static void forSample2() {
        int number = 0;
        
        for (int index = 0; number != 7; index++) {
            Random randomCreator = new Random();
            number = randomCreator.nextInt(9);// el 9 es hasta que rango lo quieres generar
            
            if(number % 2 == 0) { // si encuentra un numero par, salta de esa linea y continua
                continue; // solo pintara los números impares
            }
            
            System.out.printf("Número %s = %s\n", index + 1, number);
           
        }
    }

    public static void main(String[] args) {
       //whileSample();
       //forSample();
       //forSample2();

       whileSampleWithCounter();
    }
}
