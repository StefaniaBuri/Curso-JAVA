import java.util.Scanner;

public class AgeGreetings {

    //OPTION 1 By Args

     public static void ageGreetings(String[] args) {
        if (args.length == 0) {
            System.out.println("Introduce tu edad");
            return;
        } 

        int age = Integer.valueOf(args[0]);
        
        if(age <= 18) {
            System.out.printf("Tu tienes %s años eres menor de edad", age);
        } else if(age <= 33){ 
            System.out.printf("Tu tienes %s eres joven", age);
        } else if(age <= 65 ){
            System.out.printf("Tu tienes %s eres adulto", age);
        } else {
            System.out.printf("Tu tienes %s eres jubilado", age);
        }
    } 


    // OPTION 2 By Scanner

    static int getAgeByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int age = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return age;
    }


    /* static int getAgeByArgs(String[] args) {
         if (args.length == 0) {
            System.out.println("Introduce tu edad");
            return 0;
        } 

        int age = Integer.valueOf(args[0]);
        return age;
    } */

    
    public static void main(String[] args) {
        ageGreetings(args);
    }
}

