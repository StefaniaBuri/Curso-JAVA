import java.util.Scanner;

public class CalculateAge {
   
   /* Escribe una función que reciba por parámetros el año de nacimiento, y calcule la edad de la persona. */

   //OPTION 1
   static int getAge(int yearOfBirth, int actualYear) {
        int age = actualYear - yearOfBirth;

        if (age < 0) {
            System.out.println("El año de nacimiento no puede ser mayor que el año actual");
            return -1;
        }
        return age;
   }

   static void showInfo() {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Introduce tu año de nacimiento: ");
      int yearOfBirth = scanner.nextInt();

      System.out.print("Introduce el año actual: ");
      int actualYear = scanner.nextInt();

      int age = getAge(yearOfBirth, actualYear);

      if (age != -1) {
         System.out.printf("Tienes %s años", age);
      }

      scanner.close();
   }


   /* Crea una función que reciba la edad de una persona por parámetros y verifique si es mayor de edad. Imprime por consola un string con el resultado. */

   static void verifyAge(int age) {
        if (age < 0) {
            System.out.println("La edad no puede ser un numero negativo");
        } else if (age >= 18) {
            System.out.printf("Tienes %s años, eres mayor de edad",age);
        } else {
            System.out.printf("Tienes %s años, eres menor de edad", age);
        }
    }

    /* Crea una función que reciba un año por parámetros y compruebe e imprima por consola si el año es bisiesto o no 
     * bisiesto si: es divisible entre 4, excepto si también es divisible entre 100, a menos que también sea divisible entre 400.
    */

   static void isLeapYear(int year) {
        if (year < 0) {
            System.out.println("El año no puede ser un numero negativo");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("El año %s es bisiesto", year);
        } else {
            System.out.printf("El año %s no es bisiesto", year);
        }
    }



    public static void main(String[] args) {
        //showInfo();
        //verifyAge(15);

        isLeapYear(2025);
    }
}
