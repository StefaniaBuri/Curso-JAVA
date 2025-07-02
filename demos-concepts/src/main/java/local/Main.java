package local;

import local.concept1.Square;

public class Main {

    public static void useTryCatch() {
        Square s1 = new Square(10);
        Square s2 = s1; //mismo objeto
        System.out.println(s1);
        System.out.println("Objeto Square 2 asignado el s1: " +s2);

        //Clone
        try {
            Square s3 = (Square) s1.clone(); //nuevo objeto
            System.out.println("Objeto Square 1: " + s1); // side: 10
            System.out.println("Objeto Square 3: " + s3); // side: 10
            System.out.println(s1 == s3); // false
            System.out.println(s1.equals(s3)); // true

        } catch (CloneNotSupportedException e) {
            System.out.println("No se ha podido clonar el objeto");
            e.printStackTrace();
            e.getMessage();
            e.getCause();
            e.getSuppressed();
        } catch (Exception e) {
            System.out.println("Algo imprevisto ha ocurrido");
        }

        System.out.println("Gracias por usar mi programa"); 
      
    }

    public static void unHandle() throws CloneNotSupportedException {
        Square sq1 = new Square(10);
        Square sq2 = sq1;
        System.out.println(sq1);
        System.out.println(sq2);
        Square sq3 = (Square) sq1.clone();
        System.out.println(sq3);
        System.out.println("Gracias por usar mi programa");
    }

    public static void main(String[] args) {
       useTryCatch();
    // unHandle();
        
    }
}
