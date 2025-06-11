public class EvenOdds {

    public static void mode1(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Introduce un numero por la consola");
        } else {
            int num1 = Integer.valueOf(args[0]);
            if((num1 % 2) == 0) {
                System.out.printf("El número: %d es par", num1);
            } else {
                System.out.printf("El número: %d es impar", num1);
            }
        } 
    }

    public static void mode2(String[] args) {
        if (args.length == 0) {
            System.out.println("Introduce un numero por la consola");
            return;
        } 

            int num1 = Integer.valueOf(args[0]);

            if((num1 % 2) == 0) {
                String result = "par";
                System.out.printf("El número: %s es %s", num1, result);
            } else {
                String result = "impar";
                System.out.printf("El número: %s es %s", num1, result);
            }
    }

     public static void mode3(String[] args) {
        if (args.length == 0) {
            System.out.println("Introduce un numero por la consola");
            return;
        } 

            int num1 = Integer.valueOf(args[0]);
            String result;

            if((num1 % 2) == 0) {
                result = "par";
            } else {
                result = "impar";
            }
            
            System.out.printf("El número: %s es %s", num1, result);
    }


    public static void mode4(String[] args) {
        if (args.length == 0) {
            System.out.println("Introduce un numero por la consola");
            return;
        } 

            int num1 = Integer.valueOf(args[0]);
            String result = "impar";

            if((num1 % 2) == 0) {
                result = "par";
            }
            
            System.out.printf("El número: %s es %s", num1, result);
    }


    public static void mode5(String[] args) {
        if (args.length == 0) {
            System.out.println("Introduce un numero por la consola");
            return;
        } 

        int num1 = Integer.valueOf(args[0]);

        //Modo ternario -> (condición) ? valor : valor
        String result = (num1 % 2) == 0 ? "par" : "impar";
        System.out.printf("El número: %s es %s", num1, result);
    }
   

    public static void main(String[] args) {
        mode5(args);
    }
}
